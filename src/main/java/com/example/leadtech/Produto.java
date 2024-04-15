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
@Data
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
}
