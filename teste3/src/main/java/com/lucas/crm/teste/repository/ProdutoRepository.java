package com.lucas.crm.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.crm.teste.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Short>{

}
