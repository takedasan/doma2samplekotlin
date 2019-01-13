package jp.takeda.doma2sample.dto.response.insert

import jp.takeda.doma2sample.domain.model.write.AddressEntity

class WriteAddressResponseConverter {

    companion object {

        fun of(from: AddressEntity): WriteAddressResponse {
            return WriteAddressResponse(
                    addressId = from.addressId,
                    address = from.address,
                    personId = from.personId
            )
        }
    }
}