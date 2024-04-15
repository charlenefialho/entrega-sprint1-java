package com.example.leadtech;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Lead")
public class Lead {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idLead")
	private Long idLead;

	@Column(name = "canalOrigem")
	private String canalOrigem;
	
	@Column(name = "categoriaProdutoInteresse")
	private String categoriaProdutoInteresse;

	@OneToOne(mappedBy = "lead")
	private Cliente cliente;

}
