package jp.takeda.doma2sample.dto.response.search

data class SubAddress(
        val personId: Int,
        val addressId: Int,
        val name: String,
        val sexType: String,
        val address: String
)