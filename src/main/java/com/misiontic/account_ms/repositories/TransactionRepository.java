package com.misiontic.account_ms.repositories;

import com.misiontic.account_ms.models.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TransactionRepository extends MongoRepository <Transaction, String> {
    List<Transaction> findByUserOrigin(String userIdOrigin);
    List<Transaction> findByUserDestiny(String userIdDestiny);
}
