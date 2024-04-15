package com.example.leadtech;

import java.util.List;

import jakarta.persistence.CascadeType;
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
	private Long idFornecedor;

	private String nomeFornecedor;
	private String tipoFornecedor;

	@OneToMany(mappedBy = "fornecedor", cascade = CascadeType.ALL)
	private List<Produto> produtos;
}
