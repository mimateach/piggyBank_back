package com.example.piggyBank.service;
import com.example.piggyBank.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.piggyBank.entity.Bank;





public class BankService {
    private final BankRepository bankRepository;

    @Autowired
    public BankService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public Bank create(Bank bank) {
        if (bank.getQuantity() > 5000) {
            return bankRepository.save(bank);
        }
        return null;
    }
}
