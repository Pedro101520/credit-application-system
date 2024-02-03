package tech.pedrolima.credit.application.system.dto

import tech.pedrolima.credit.application.system.entity.Credit
import tech.pedrolima.credit.application.system.entity.Customer
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(
    val creditvalue: BigDecimal,
    val dayFirstInstallment: LocalDate,
    val numberOfInstallments: Int,
    val customerId: Long
    ){

    fun toEntity(): Credit = Credit(
        creditValue = this.creditvalue,
        dayFirstInstallment = this.dayFirstInstallment,
        numberOfInstallments = this.numberOfInstallments,
        customer = Customer(id = this.customerId)
    )
}
