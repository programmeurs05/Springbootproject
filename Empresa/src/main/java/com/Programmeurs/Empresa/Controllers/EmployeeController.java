package com.Programmeurs.Empresa.Controllers;

import com.Programmeurs.Empresa.Entities.*;
import com.Programmeurs.Empresa.Entities.Enmu_RoleName;
import com.Programmeurs.Empresa.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getEmployee() {
        return this.employeeService.getEmployee();
    }

    @PostMapping
    public void RegisterNewEmployee (@RequestBody Employee employee){
        employeeService.addNewEmployee(employee);
    }

    @GetMapping(path = "{employeeId}")
    public Enterprise getEmployee(@PathVariable ("employeeId") Long employeeId){
        return employeeService.getEmployee(employeeId).getEnterprise();
    }

    @PatchMapping(path = "{employeeId}")
    public void updateEmployee(@PathVariable("employeeId") Long employeeId, @RequestParam(required = false) String email,
                               @RequestParam(required = false) Profile profile,
                               @RequestParam(required = false) Enmu_RoleName enmu_RoleName,
                               @RequestParam(required = false) Enterprise enterprise,
                               @RequestParam(required = false) List<Transaction> transactions){
        employeeService.updateEmployee(employeeId, email, profile, enmu_RoleName, enterprise, transactions);
    }

    @DeleteMapping(path = "{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") Long employeeId){
        employeeService.deleteEmployee(employeeId);
    }
}