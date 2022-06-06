package com.example.bankservice.controller;


import com.example.bankservice.dto.BankInfoDto;
import com.example.bankservice.dto.ResponseDto;
import com.example.bankservice.model.BankInfo;
import com.example.bankservice.service.IBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bankinfo")
public class BankController {


    @Autowired
    private IBankService bankService;

    @PostMapping("/addbankDetails")
    public ResponseEntity<ResponseDto> addingBankDetails(@Valid @RequestBody BankInfoDto bankInfoDto) {
        BankInfo bank = bankService.addBankInfo(bankInfoDto);
        ResponseDto response = new ResponseDto("BankInfo Added Successfully", bank);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/getallbankDetails")
    public ResponseEntity<ResponseDto> getDetails() {
        List<BankInfo> list = bankService.getAllBankDeatils();
        ResponseDto response = new ResponseDto("Bank Details", list);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/updatebankdetails/{id}")
    public ResponseEntity<ResponseDto> updateInfo(@PathVariable long id, @RequestBody BankInfoDto bankInfoDto) {
        BankInfo bank = bankService.updateBankInfo(id, bankInfoDto);
        ResponseDto response = new ResponseDto("Bank Data Successfully Updated", bank);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
