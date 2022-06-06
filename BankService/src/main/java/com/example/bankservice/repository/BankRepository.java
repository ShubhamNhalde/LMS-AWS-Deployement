package com.example.bankservice.repository;


import com.example.bankservice.model.BankInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends MongoRepository<BankInfo, Long> {
}
