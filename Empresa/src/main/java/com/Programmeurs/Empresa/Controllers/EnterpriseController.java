package com.Programmeurs.Empresa.Controllers;

import com.Programmeurs.Empresa.Entities.Enterprise;
import com.Programmeurs.Empresa.Services.EnterpriseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(path = "/enterprises")
public class EnterpriseController {
    EnterpriseService enterpriseService;

    @Autowired
    public EnterpriseController(EnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

    @GetMapping
    public List<Enterprise> getEnterprises(){
        return enterpriseService.getEnterprises();
    }

    @PostMapping
    public void RegisterNewEnterprise (@RequestBody Enterprise enterprise){
        enterpriseService.addNewEnterprise(enterprise);
    }

    @GetMapping(path = "{enterpriseId}")
    public Enterprise getEnterprise(@PathVariable ("enterpriseId") Long enterpriseId){
        return enterpriseService.getEnterprise(enterpriseId);
    }

    @PatchMapping(path = "{enterpriseId}")
    public void updateEnterprise(@PathVariable("enterpriseId") Long enterpriseId, @RequestBody Enterprise enterpriseC){
        enterpriseService.updateEnterprise(enterpriseId, enterpriseC);
    }

    @DeleteMapping(path = "{enterpriseId}")
    public void deleteEnterprise(@PathVariable("enterpriseId") Long enterpriseId){
        enterpriseService.deleteEnterprise(enterpriseId);
    }



}
