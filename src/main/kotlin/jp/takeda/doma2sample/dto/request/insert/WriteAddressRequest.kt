package jp.takeda.doma2sample.dto.request.insert

data class WriteAddressRequest(
        val addressId: Int,
        val address: String,
        val personId: Int
)