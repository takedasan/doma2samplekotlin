package jp.takeda.doma2sample.dto.response.search

import jp.takeda.doma2sample.domain.model.read.AddressReadEntity

class SelectAddressListConverter {

    companion object {
        fun of(from: List<AddressReadEntity>): SelectAddressListResponse {
            val subAddressList = from.map {
                SubAddress(
                        personId = it.personId,
                        addressId = it.addressId,
                        name = it.name,
                        sexType = it.sexType,
                        address = it.address
                )
            }

            return SelectAddressListResponse(
                    count = from.size,
                    addressList = subAddressList
            )
        }
    }
}