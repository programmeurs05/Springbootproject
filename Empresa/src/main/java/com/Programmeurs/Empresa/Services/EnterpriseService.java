package com.Programmeurs.Empresa.Services;

import com.Programmeurs.Empresa.Entities.Enterprise;
import com.Programmeurs.Empresa.Repositories.EnterpriseRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseService {

    EnterpriseRepository enterpriseRepository;

    @Autowired
    public EnterpriseService(EnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
    }


    public List<Enterprise> getEnterprises(){
        return enterpriseRepository.findAll();
    }

    public void addNewEnterprise(Enterprise enterprise){
        enterpriseRepository.save(enterprise);
    }
    public Enterprise getEnterprise(Long enterpriseId){
        return enterpriseRepository.findEnterpriseById(enterpriseId);

    }

    public void updateEnterprise(Long enterpriseId, Enterprise enterpriseC){
        Enterprise enterprise = enterpriseRepository.findEnterpriseById(enterpriseId);
        enterprise.setName(enterpriseC.getName());
        enterprise.setDocument(enterpriseC.getDocument());
        enterprise.setPhone(enterpriseC.getPhone());
        enterprise.setAddress(enterpriseC.getAddress());
        enterpriseRepository.save(enterprise);

    }

    public void deleteEnterprise(Long enterpriseId){
        enterpriseRepository.deleteById(enterpriseId);
    }
}
