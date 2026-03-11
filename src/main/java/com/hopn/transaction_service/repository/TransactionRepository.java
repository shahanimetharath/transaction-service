package com.hopn.transaction_service.repository;

import com.hopn.transaction_service.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
