package com.Programmeurs.Empresa.Services;

import com.Programmeurs.Empresa.Entities.Transaction;
import com.Programmeurs.Empresa.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TransactionService {
    TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }

    public void addNewTransaction(Transaction transaction){
        transactionRepository.save(transaction);
    }
    public Transaction getTransaction (Long transactionId){
        return transactionRepository.findTransactionById(transactionId);
    }

    public void updateTransaction(Long transactionId, Transaction transactionC){
        Transaction transaction = transactionRepository.findTransactionById(transactionId);
        transaction.setConcept(transactionC.getConcept());
        transaction.setAmount(transactionC.getAmount());
        transaction.setEnterprise(transactionC.getEnterprise());
        transaction.setEmployee(transactionC.getEmployee());
        transactionRepository.save(transaction);

    }

    public void deleteTransaction(Long transactionId){
        transactionRepository.deleteById(transactionId);
    }
}
