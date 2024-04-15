package com.example.leadtech;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Table(name = "Cliente")
public class Cliente extends Lead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	private String nome;
	private String telefone;
	private String email;
	private String genero;
	private String estadoCivil;
	private Long idLocalizacao;
	private Double nivelRenda;
	private String nivelEducacao;
	private String formaPagamentoPref;
}
