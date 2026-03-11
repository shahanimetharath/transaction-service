package com.hopn.transaction_service.Controller;


import com.hopn.transaction_service.model.Transaction;
import com.hopn.transaction_service.repository.TransactionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TransactionController {

    private final TransactionRepository repository;

    public TransactionController(TransactionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/health")
    public String health() {
        return "Service is running";
    }

    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
        return repository.findAll();
    }

    @PostMapping("/transactions")
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return repository.save(transaction);
    }
} 
