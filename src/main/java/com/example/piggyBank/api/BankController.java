
package com.example.piggyBank.api;


import com.example.piggyBank.entity.Bank;
import com.example.piggyBank.payload.request.BankRequest;
import com.example.piggyBank.repository.BankRepository;
import com.example.piggyBank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.piggyBank.payload.request.BookRequest;
import lombok.Builder;

import java.util.List;

    @RestController
    @CrossOrigin(origins = "*")
    @RequestMapping("/api/v1")
    public class BankController {
        private final BankService bankService;

        @Autowired
        public BankController(BankService bankService) {
            this.bankService = bankService;
        }

        @GetMapping("")
        public ResponseEntity<List<Bank>> findAll() {
            return ResponseEntity.ok().body(bankService.findAll());
        }

        @GetMapping("/{id}")
        public ResponseEntity<Bank> getById(@PathVariable Long id){
            return ResponseEntity.ok().body(bankService.findByID(id));
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<Long> delete(@PathVariable Long id) {
            return ResponseEntity.ok().body(bankService.delete(id));
        }

        @PostMapping("/create")
        public ResponseEntity<?> create(@RequestBody BankRequest bankRequest) {
            return ResponseEntity.ok().body(bankService.create(bankRequest));
        }

        @PutMapping("/edit")
        public ResponseEntity<Bank> update(@RequestBody Bank bank) {
            return ResponseEntity.ok().body(bankService.update(bank));
        }
    }
