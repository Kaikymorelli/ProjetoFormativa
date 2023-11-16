package com.ProjetoFormativa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoFormativa.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
