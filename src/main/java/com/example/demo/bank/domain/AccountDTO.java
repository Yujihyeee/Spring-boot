package com.example.demo.bank.domain;

import lombok.Data;

@Data
public class AccountDTO {
    private String name;
    private String accNumber;
    private String money;
    private String balance;
    private String date;
    private String interest;
    public static final String BANK_NAME = "비트은행";

    @Override
    public String toString(){
        return BANK_NAME + " : "+
                "예금주='" + name + '\'' +
                ", 계좌번호='" + accNumber + '\'' +
                ", 잔고=" + balance +
                ", 거래일자='" + date + '\'' +
                ", 이자율=" + interest +"\n";
    }
}
