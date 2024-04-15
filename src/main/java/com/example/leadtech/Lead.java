package com.example.leadtech;

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
	private Long idLead;

	private String canalOrigem;
	private String categoriaProdutoInteresse;

	@OneToOne(mappedBy = "lead")
	private Cliente cliente;

}
