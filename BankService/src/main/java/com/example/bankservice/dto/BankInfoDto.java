package com.example.bankservice.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class BankInfoDto {

    @NotNull
    public String panNumber;
    @NotNull
    public String aadharNumber;
    @NotNull
    public String bankName;
    @NotNull
    public String bankAccountNumber;
    @NotNull
    public String ifscCode;

}
