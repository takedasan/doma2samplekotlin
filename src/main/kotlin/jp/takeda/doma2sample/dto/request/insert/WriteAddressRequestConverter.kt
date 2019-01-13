package jp.takeda.doma2sample.dto.request.insert

import jp.takeda.doma2sample.domain.model.write.AddressEntity

class WriteAddressRequestConverter {

    companion object {

        fun of(from: WriteAddressRequest): AddressEntity {
            return AddressEntity(
                    addressId = from.addressId,
                    address = from.address,
                    personId = from.personId
            )
        }
    }
}