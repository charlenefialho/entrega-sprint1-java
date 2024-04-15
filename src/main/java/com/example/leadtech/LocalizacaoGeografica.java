package com.example.leadtech;

import java.util.List;

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
@Table(name = "LocalizacaoGeografica")
public class LocalizacaoGeografica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLocalizacao;

	@Column(nullable = false)
	private String pais;

	@Column(nullable = false)
	private String estado;

	@Column(nullable = false)
	private String cidade;

	@Column(nullable = false)
	private String cep;

}
