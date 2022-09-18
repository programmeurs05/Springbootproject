package com.Programmeurs.Empresa.Controllers;

import com.Programmeurs.Empresa.Entities.Employee;
import com.Programmeurs.Empresa.Entities.Enterprise;
import com.Programmeurs.Empresa.Entities.Transaction;
import com.Programmeurs.Empresa.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.math.BigDecimal;


@RestController
@RequestMapping (path = "/enterprises/{transactionId}/movements")
public class TransactionController {

    TransactionService transactionService;

    @Autowired
    public TransactionController (TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public Transaction getTransaction(@PathVariable("transactionId") Long transactionId) {
        return transactionService.getTransaction(transactionId);
    }

    @PostMapping
    public void RegisterNewTransaction (@RequestBody Transaction transaction){
        transactionService.addNewTransaction(transaction);
    }


    @PatchMapping
    public void updateTransaction(@PathVariable("transactionId") Long transactionId,@RequestBody Transaction transactionC

    ){
        transactionService.updateTransaction(transactionId, transactionC);
    }

    @DeleteMapping
    public void deleteTransaction(@PathVariable("transactionId") Long transactionId){
        transactionService.deleteTransaction(transactionId);
    }

}

