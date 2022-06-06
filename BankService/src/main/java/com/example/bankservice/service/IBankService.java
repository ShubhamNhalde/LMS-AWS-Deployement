package com.example.bankservice.service;


import com.example.bankservice.dto.BankInfoDto;
import com.example.bankservice.model.BankInfo;

import java.util.List;

public interface IBankService {

    BankInfo addBankInfo(BankInfoDto bankInfoDto);

    List<BankInfo> getAllBankDeatils();

    BankInfo updateBankInfo(long id, BankInfoDto bankInfoDto);
}
