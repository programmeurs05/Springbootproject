package com.Programmeurs.Empresa.Repositories;

import com.Programmeurs.Empresa.Entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {

    Enterprise findEnterpriseById(Long enterpriseId);
}
