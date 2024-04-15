package com.example.leadtech;
import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProdutoDTO {
    private Long id;
    
    @NotBlank(message = "O nome do produto é obrigatório")
    private String nome;
    
    @NotNull(message = "A categoria do produto é obrigatória")
    private String categoria;
    
    private int estrelas;
    
    private int qtdEstoque;
    
    private Date dataCompra;
    
    @NotNull(message = "O valor do produto é obrigatório")
    private Double valor;
    
    // Getters e Setters
}
