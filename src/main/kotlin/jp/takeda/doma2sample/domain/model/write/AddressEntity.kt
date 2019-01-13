package jp.takeda.doma2sample.domain.model.write

import org.seasar.doma.Entity
import org.seasar.doma.Id
import org.seasar.doma.Table
import org.seasar.doma.jdbc.entity.NamingType

@Entity(immutable = true, naming = NamingType.SNAKE_UPPER_CASE)
@Table(name = "address")
data class AddressEntity(
        @Id
        val addressId: Int,
        val address: String,
        val personId: Int
)