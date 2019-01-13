package jp.takeda.doma2sample.domain.service

import jp.takeda.doma2sample.dao.AddressDomaDao
import jp.takeda.doma2sample.dto.request.insert.WriteAddressRequest
import jp.takeda.doma2sample.dto.request.insert.WriteAddressRequestConverter
import jp.takeda.doma2sample.dto.response.insert.WriteAddressResponse
import jp.takeda.doma2sample.dto.response.insert.WriteAddressResponseConverter
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

    fun insert(request: WriteAddressRequest): WriteAddressResponse {
        val addressEntity = WriteAddressRequestConverter.of(request)
        val result = addressDomaDao.insert(addressEntity).entity

        return WriteAddressResponseConverter.of(result)
    }
}
