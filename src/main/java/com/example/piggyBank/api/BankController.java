package com.example.piggyBank.api;


import com.example.piggyBank.entity.Bank;
import com.example.piggyBank.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/v1/bank")
public class BankController {

    private final BankRepository bankRepository;
    @Autowired
    public BankController (BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }


    @GetMapping("")
    public String index(){
        return "Hola, página de inicio";
    }
    @GetMapping ("/list")
    public List<Bank> getBanksList(){
        return bankRepository.findAll();
    }
    @GetMapping ("/{id")
    public Bank getById(@PathVariable Long id){
        return bankRepository.findById(id).get();
    }

}
