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

@Data
@Entity
@Table(name = "Cliente")
public class Cliente  {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "idCliente")
    private Long idCliente;
	
	@OneToOne
    @JoinColumn(name = "idLead")
    private Lead lead;

    @Column(nullable = false, name = "nome")
    private String nome;
    
    @Column(nullable = false, name = "telefone")
    private String telefone;

    @Column(nullable = false, unique = true, name="email")
    private String email;

    @Column(name="idade")
    private int idade;

    @Column( name="genero")
    private String genero;

    @Column( name="estadoCivil")
    private String estadoCivil;

    @ManyToOne
    @JoinColumn(name = "idLocalizacao")
    private LocalizacaoGeografica localizacao;

    @Column( name="nivelRenda")
    private double nivelRenda;
    
    @Column( name="nivelEducacao")
    private String nivelEducacao;

    @Column( name="formaPagamentoPref")
    private String formaPagamentoPref;
    

}
