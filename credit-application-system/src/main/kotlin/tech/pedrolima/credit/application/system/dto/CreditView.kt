package tech.pedrolima.credit.application.system.dto

import tech.pedrolima.credit.application.system.ennumerator.Status
import tech.pedrolima.credit.application.system.entity.Credit
import tech.pedrolima.credit.application.system.entity.Customer
import java.math.BigDecimal
import java.util.*


data class CreditView(
    val creditCode: UUID,
    val creditValue: BigDecimal,
    val numberOfInstallments: Int,
    val status: Status,
    val emailCustomer: String?,
    val incomeCustomer: BigDecimal?
){
    constructor(credit: Credit) : this(
        creditCode = credit.creditCode,
        creditValue = credit.creditValue,
        numberOfInstallments = credit.numberOfInstallments,
        status = credit.status,
        emailCustomer = credit.customer?.email,
        incomeCustomer = credit.customer?.income
    )
}
