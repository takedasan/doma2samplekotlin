package jp.takeda.doma2sample.controller

import jp.takeda.doma2sample.domain.service.AddressService
import jp.takeda.doma2sample.domain.service.FindAddressResult
import jp.takeda.doma2sample.dto.request.insert.WriteAddressRequest
import jp.takeda.doma2sample.dto.response.find.FindAddressResponse
import jp.takeda.doma2sample.dto.response.insert.WriteAddressResponse
import jp.takeda.doma2sample.dto.response.search.SelectAddressListResponse
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
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

    @GetMapping("{id}", produces = ["application/json"])
    fun getAddress(@PathVariable("id") id: Int): ResponseEntity<FindAddressResponse> {
        val result = addressService.find(id)

        return when (result) {
            is FindAddressResult.Found -> ResponseEntity.ok(result.response)
            is FindAddressResult.NotFound -> ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).build<FindAddressResponse>()
        }
    }

    @PostMapping
    fun postAddress(request: WriteAddressRequest): WriteAddressResponse {
        return addressService.insert(request)
    }
}