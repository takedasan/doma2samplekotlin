package jp.takeda.doma2sample.dto.response.insert

data class WriteAddressResponse(
        val addressId: Int,
        val address: String,
        val personId: Int
)