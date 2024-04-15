package com.example.leadtech;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Fornecedor")
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFornecedor")
	private Long idFornecedor;
	
	@Column(name = "nomeFornecedor")
	private String nomeFornecedor;
	@Column(name = "tipoFornecedor")
	private String tipoFornecedor;

	@OneToMany(mappedBy = "fornecedor", cascade = CascadeType.ALL)
	private List<Produto> produtos;
}
