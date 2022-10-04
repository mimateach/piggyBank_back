package com.example.piggyBank.repository;

import com.example.piggyBank.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {

}
