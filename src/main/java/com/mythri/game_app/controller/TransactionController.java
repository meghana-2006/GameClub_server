package com.mythri.game_app.controller;

// package com.mtd.gaming_club_app.controller;

import com.mythri.game_app.entity.Transaction;
import com.mythri.game_app.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }

    @GetMapping("/member/{memberId}")
    public List<Transaction> getTransactionsByMember(@PathVariable String memberId) {
        return transactionService.getTransactionsByMember(memberId);
    }
}
