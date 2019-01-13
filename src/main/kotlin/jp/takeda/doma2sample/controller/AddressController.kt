package jp.takeda.doma2sample.controller

import jp.takeda.doma2sample.domain.service.AddressService
import jp.takeda.doma2sample.dto.request.insert.WriteAddressRequest
import jp.takeda.doma2sample.dto.response.insert.WriteAddressResponse
import jp.takeda.doma2sample.dto.response.search.SelectAddressListResponse
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("address")
class AddressController(
        val addressService: AddressService
) {


    @GetMapping("{id}")
    fun getAddressList(@PathVariable("id") id: Int): SelectAddressListResponse {
        return addressService.selectById(1)
    }

    @PostMapping
    fun postAddress(request: WriteAddressRequest): WriteAddressResponse {
        return addressService.insert(request)
    }
}