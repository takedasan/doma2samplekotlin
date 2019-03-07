package jp.takeda.doma2sample.dto.response.find

data class FindAddressResponse(
        val personId: Int,
        val addressId: Int,
        val name: String,
        val sexType: String,
        val address: String
)