package com.example.piggyBank.service;
import com.example.piggyBank.payload.request.BankRequest;
import com.example.piggyBank.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.piggyBank.entity.Bank;
import org.springframework.stereotype.Service;

import java.util.List;

import lombok.Builder;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins="*")
@Builder
@Service
public class BankService {
    private final BankRepository bankRepository;

    @Autowired
    public BankService(BankRepository bankRepository){
        this.bankRepository = bankRepository;
    }
    public List<Bank>findAll(){
        return bankRepository.findAll();
    }

    public Bank findByID(Long id){
        return bankRepository.findById(id).get();
    }


    public Long delete(Long id) {
        if (bankRepository.findById(id).isEmpty()) {
            throw new RuntimeException("Piggybank not Found");
        }
        bankRepository.deleteById(id);
        return id;
    }
    public Bank update(Bank bank){
        if (bankRepository.findById(bank.getId()).isEmpty()) {
            throw new RuntimeException("Piggybank not Found");
        }
        return bankRepository.save(bank);

    }
    public Bank  create(BankRequest bankRequest){
        Bank bank = Bank
                .builder()
                .name(bankRequest.getName())
                .quantity(bankRequest.getQuantity())
                .dueDate(bankRequest.getDueDate())
                .build();
        return bankRepository.save(bank);
    }

}