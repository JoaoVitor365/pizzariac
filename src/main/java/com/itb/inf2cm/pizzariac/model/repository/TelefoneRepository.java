package com.itb.inf2cm.pizzariac.model.repository;

import com.itb.inf2cm.pizzariac.model.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
