package com.example.piggyBank.repository;

import com.example.piggyBank.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Map;

@CrossOrigin(origins="*")
@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

