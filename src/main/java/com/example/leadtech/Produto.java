package com.example.leadtech;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;

	@Column(nullable = false)
	private String nomeProduto;

	private int estrelas;

	@Column(nullable = false)
	private String categoriaProduto;

	private int qtdEstoque;

	@Column(nullable = false)
	private Date dataCompraProduto;

	@Column(nullable = false)
	private double valorProduto;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idFornecedor")
	private Fornecedor fornecedor;

	public Produto() {

	}

	public Produto(Long idProduto, String nomeProduto, int estrelas, String categoriaProduto, int qtdEstoque,
			Date dataCompraProduto, double valorProduto, Fornecedor fornecedor) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.estrelas = estrelas;
		this.categoriaProduto = categoriaProduto;
		this.qtdEstoque = qtdEstoque;
		this.dataCompraProduto = dataCompraProduto;
		this.valorProduto = valorProduto;
		this.fornecedor = fornecedor;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getEstrelas() {
		return estrelas;
	}

	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}

	public String getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(String categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public Date getDataCompraProduto() {
		return dataCompraProduto;
	}

	public void setDataCompraProduto(Date dataCompraProduto) {
		this.dataCompraProduto = dataCompraProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
