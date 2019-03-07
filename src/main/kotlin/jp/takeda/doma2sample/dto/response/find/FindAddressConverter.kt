package jp.takeda.doma2sample.dto.response.find

import jp.takeda.doma2sample.domain.model.read.AddressReadEntity

class FindAddressConverter {
    companion object {
        fun of(from: AddressReadEntity): FindAddressResponse {
            return FindAddressResponse(
                    personId = from.personId,
                    addressId = from.addressId,
                    name = from.name,
                    sexType = from.sexType,
                    address = from.address
            )
        }
    }
}