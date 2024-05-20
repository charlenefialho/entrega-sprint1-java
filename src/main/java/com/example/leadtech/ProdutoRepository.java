package com.example.leadtech;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByCategoriaProduto(String categoria);
    List<Produto> findByEstrelas(int estrelas);
    List<Produto> findByDataCompraProdutoBetween(Date dataInicial, Date dataFinal);
    List<Produto> findByValorProdutoBetween(double valorMinimo, double valorMaximo);
    List<Produto> findByQtdEstoqueGreaterThan(int quantidade);
    List<Produto> findByNomeProdutoContainingIgnoreCase(String palavraChave);
    List<Produto> findByNomeProdutoContainingIgnoreCaseAndEstrelas(String palavraChave, int estrelas);
}


