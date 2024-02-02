package tech.pedrolima.credit.application.system.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import tech.pedrolima.credit.application.system.entity.Credit
@Repository
interface CreditRepository: JpaRepository<Credit, Long> {
}