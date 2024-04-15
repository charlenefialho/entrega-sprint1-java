package com.example.leadtech;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Cliente")
public class Cliente  {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
	
	@OneToOne
    @JoinColumn(name = "idLead")
    private Lead lead;

    @Column(nullable = false)
    private String nome;

    private String telefone;

    @Column(nullable = false, unique = true)
    private String email;

    private int idade;

    private String genero;

    private String estadoCivil;

    @ManyToOne
    @JoinColumn(name = "idLocalizacao")
    private LocalizacaoGeografica localizacao;

    private double nivelRenda;

    private String nivelEducacao;

    private String formaPagamentoPref;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Produto> produtos;
}
