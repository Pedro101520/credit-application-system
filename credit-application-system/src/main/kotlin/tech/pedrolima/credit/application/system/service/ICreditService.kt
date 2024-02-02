package tech.pedrolima.credit.application.system.service

import jakarta.persistence.Id
import org.aspectj.apache.bcel.classfile.Code
import tech.pedrolima.credit.application.system.entity.Credit
import tech.pedrolima.credit.application.system.entity.Customer
import java.util.UUID

interface ICreditService {
    fun save(credit: Credit): Credit
    fun findAllByCustomer(customerId: Long): List<Credit>
    fun findByCreditCode(customerId: Long, creditCode: UUID): Credit
}