package jp.takeda.doma2sample.controller

import jp.takeda.doma2sample.domain.service.AddressService
import jp.takeda.doma2sample.dto.request.insert.WriteAddressRequest
import jp.takeda.doma2sample.dto.response.find.FindAddressResponse
import jp.takeda.doma2sample.dto.response.insert.WriteAddressResponse
import jp.takeda.doma2sample.dto.response.search.SelectAddressListResponse
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("addresses")
class AddressController(
        val addressService: AddressService
) {
    @GetMapping
    fun getAddressList(): SelectAddressListResponse {
        return addressService.search()
    }

    @GetMapping("{id}")
    fun getAddress(@PathVariable("id") id: Int): FindAddressResponse {
        return addressService.find(id)
    }

    @PostMapping
    fun postAddress(request: WriteAddressRequest): WriteAddressResponse {
        return addressService.insert(request)
    }
}