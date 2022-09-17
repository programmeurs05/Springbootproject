package com.Programmeurs.Empresa.Repositories;

import com.Programmeurs.Empresa.Entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, String> {
}
