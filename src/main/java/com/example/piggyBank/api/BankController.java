package com.example.piggyBank.api;


import com.example.piggyBank.entity.Bank;
import com.example.piggyBank.repository.BankRepository;
import com.example.piggyBank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v1/bank")
public class BankController {

    private final BankService bankService;

    @Autowired
    public BankController(BankService bankService)

    /* @GetMapping("")
    public String index(){
        return "Hola, página de inicio";
    }
    @GetMapping ("/list")
    public List<Bank> getBanksList(){
        return BankService.findAll();
    }
    @GetMapping ("/{id}")
    public Bank getById(@PathVariable Long id){
        return bankRepository.findById(id).get();
    } */
    /*Create*/
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Bank bank) {
            return ResponseEntity.ok().body(BankService.create(bank));
    }

}
