package jp.takeda.doma2sample.domain.model.read

import org.seasar.doma.Entity
import org.seasar.doma.jdbc.entity.NamingType

@Entity(immutable = true, naming = NamingType.SNAKE_UPPER_CASE)
data class AddressSearchEntity(
        val personId: Int,
        val name: String,
        val sexType: String,
        val addressId: Int,
        val address: String
)