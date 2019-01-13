package jp.takeda.doma2sample.domain.service

import jp.takeda.doma2sample.dao.AddressDomaDao
import jp.takeda.doma2sample.domain.model.write.AddressEntity
import jp.takeda.doma2sample.dto.response.search.SelectAddressListConverter
import jp.takeda.doma2sample.dto.response.search.SelectAddressListResponse
import org.springframework.stereotype.Service

@Service
class AddressService(
        private val addressDomaDao: AddressDomaDao
) {

    fun selectById(addressId: Int): SelectAddressListResponse {
        val result = addressDomaDao.search()
        return SelectAddressListConverter.of(result)
    }

    fun insert(addressEntity: AddressEntity): AddressEntity {
        return addressDomaDao.insert(addressEntity).entity
    }
}
