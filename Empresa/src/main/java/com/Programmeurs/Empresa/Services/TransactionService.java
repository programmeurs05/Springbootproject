package com.Programmeurs.Empresa.Services;

import com.Programmeurs.Empresa.Entities.Employee;
import com.Programmeurs.Empresa.Entities.Enterprise;
import com.Programmeurs.Empresa.Entities.Transaction;
import com.Programmeurs.Empresa.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

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

    public void updateTransaction(long transactionId, String concept, BigDecimal amount, Enterprise enterprise, Employee employee){
        Transaction transaction = transactionRepository.findTransactionById(transactionId);

        transaction.setConcept(concept);
        transaction.setAmount(amount);
        transaction.setEnterprise(enterprise);
        transaction.setEmployee(employee);
        transactionRepository.save(transaction);

    }

    public void deleteTransaction(Long transactionId){
        transactionRepository.deleteById(transactionId);
    }
}
