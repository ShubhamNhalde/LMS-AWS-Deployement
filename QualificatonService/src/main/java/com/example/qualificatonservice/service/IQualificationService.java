package com.example.qualificatonservice.service;

import com.example.qualificatonservice.dto.QualificationDto;
import com.example.qualificatonservice.model.QualificationInfo;

import java.util.List;

public interface IQualificationService {

    QualificationInfo addQualificationData(QualificationDto qualificationDto);

    List<QualificationInfo> getQualificationData();

    QualificationInfo updateQualificationById(long id, QualificationDto qualificationDto);
}
