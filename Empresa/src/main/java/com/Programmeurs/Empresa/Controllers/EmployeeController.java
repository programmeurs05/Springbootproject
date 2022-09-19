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
    public List<Employee> getEmployees() {
        return this.employeeService.getEmployees();
    }

    @PostMapping
    public void RegisterNewEmployee (@RequestBody Employee employee){
        employeeService.addNewEmployee(employee);
    }

    @GetMapping(path = "{employeeId}")
    public Employee getEmployee(@PathVariable ("employeeId") Long employeeId){
        return employeeService.getEmployee(employeeId);
    }

    @PatchMapping(path = "{employeeId}")
    public void updateEmployee(@PathVariable("employeeId") Long employeeId, @RequestBody Employee employeeC){
        employeeService.updateEmployee(employeeId, employeeC);
    }

    @DeleteMapping(path = "{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") Long employeeId){
        employeeService.deleteEmployee(employeeId);
    }
}