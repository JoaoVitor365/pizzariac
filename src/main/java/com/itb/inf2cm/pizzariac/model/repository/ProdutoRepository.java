package com.itb.inf2cm.pizzariac.model.repository;

import com.itb.inf2cm.pizzariac.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
