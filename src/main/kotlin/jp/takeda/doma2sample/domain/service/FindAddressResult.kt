package jp.takeda.doma2sample.domain.service

import jp.takeda.doma2sample.dto.response.find.FindAddressResponse

sealed class FindAddressResult {
    data class Found(val response: FindAddressResponse) : FindAddressResult()
    object NotFound : FindAddressResult()
}