package com.Programmeurs.Empresa.Services;

import com.Programmeurs.Empresa.Entities.*;
import com.Programmeurs.Empresa.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    public void addNewEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public Employee getEmployee(Long employeeId){
        return employeeRepository.findEmployeeById(employeeId);
    }

    public void updateEmployee(Long employeeId, String email, Profile profile, Enmu_RoleName enmu_roleName, Enterprise enterprise, List<Transaction> transactions){
        Employee employee = employeeRepository.findEmployeeById(employeeId);
        employee.setEmail(email);
        employee.setProfile(profile);
        employee.setEnmu_RoleName(enmu_roleName);
        employee.setEnterprise(enterprise);
        employee.setTransactions(transactions);
        employeeRepository.save(employee);

    }

    public void deleteEmployee(Long employeeId){
        employeeRepository.deleteById(employeeId);
    }
}