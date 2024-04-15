package com.example.leadtech;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByCategoriaProduto(String categoria);
    List<Produto> findByEstrelas(int estrelas);
}


