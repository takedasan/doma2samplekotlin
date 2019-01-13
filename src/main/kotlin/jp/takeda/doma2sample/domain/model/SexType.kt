package jp.takeda.doma2sample.domain.model

import org.seasar.doma.Domain

@Domain(valueType = String::class)
data class SexType(
        val value: String
)