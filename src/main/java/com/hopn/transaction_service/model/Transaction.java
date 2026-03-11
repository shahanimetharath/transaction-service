package com.hopn.transaction_service.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sender;
    private String receiver;
    private Double amount;
}
