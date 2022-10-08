package com.example.piggyBank.payload.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.sql.Date;

@CrossOrigin(origins="*")
@Getter
@Setter
public class BankRequest {

    private Long id;
    private String name;
    private Integer quantity;
    private Date dueDate;

}