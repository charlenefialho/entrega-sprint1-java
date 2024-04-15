package com.example.leadtech;
import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


public class ProdutoDTO {
	
	public ProdutoDTO(){
		
	}
	
    public ProdutoDTO(Long id, @NotBlank(message = "O nome do produto é obrigatório") String nome,
			@NotNull(message = "A categoria do produto é obrigatória") String categoria, int estrelas, int qtdEstoque,
			Date dataCompra, @NotNull(message = "O valor do produto é obrigatório") Double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.estrelas = estrelas;
		this.qtdEstoque = qtdEstoque;
		this.dataCompra = dataCompra;
		this.valor = valor;
	}

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEstrelas() {
		return estrelas;
	}

	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
    
    
}
