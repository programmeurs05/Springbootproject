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

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public void addNewEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public Employee getEmployee(Long employeeId){
        return employeeRepository.findEmployeeById(employeeId);
    }

    public void updateEmployee(Long employeeId,Employee employeeC){
        Employee employee = employeeRepository.findEmployeeById(employeeId);
        employee.setEmail(employeeC.getEmail());
        employee.setProfile(employeeC.getProfile());
        employee.setEnmu_RoleName(employeeC.getEnmu_RoleName());
        employee.setEnterprise(employeeC.getEnterprise());
        employee.setTransactions(employeeC.getTransactions());
        employeeRepository.save(employee);

    }

    public void deleteEmployee(Long employeeId){
        employeeRepository.deleteById(employeeId);
    }
}