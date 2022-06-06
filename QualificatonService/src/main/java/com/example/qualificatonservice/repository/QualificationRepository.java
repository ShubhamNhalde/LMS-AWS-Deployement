package com.example.qualificatonservice.repository;

import com.example.qualificatonservice.model.QualificationInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualificationRepository extends MongoRepository<QualificationInfo, Long> {
}
