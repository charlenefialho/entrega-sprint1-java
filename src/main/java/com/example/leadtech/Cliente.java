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
@Table(name = "Cliente")
public class Cliente  {
	public Cliente() {
		
	}
	
	
	public Cliente(Long idCliente, Lead lead, String nome, String telefone, String email, int idade, String genero,
			String estadoCivil, LocalizacaoGeografica localizacao, double nivelRenda, String nivelEducacao,
			String formaPagamentoPref) {
		super();
		this.idCliente = idCliente;
		this.lead = lead;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.idade = idade;
		this.genero = genero;
		this.estadoCivil = estadoCivil;
		this.localizacao = localizacao;
		this.nivelRenda = nivelRenda;
		this.nivelEducacao = nivelEducacao;
		this.formaPagamentoPref = formaPagamentoPref;
	}

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
    
    
	

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Lead getLead() {
		return lead;
	}

	public void setLead(Lead lead) {
		this.lead = lead;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public LocalizacaoGeografica getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(LocalizacaoGeografica localizacao) {
		this.localizacao = localizacao;
	}

	public double getNivelRenda() {
		return nivelRenda;
	}

	public void setNivelRenda(double nivelRenda) {
		this.nivelRenda = nivelRenda;
	}

	public String getNivelEducacao() {
		return nivelEducacao;
	}

	public void setNivelEducacao(String nivelEducacao) {
		this.nivelEducacao = nivelEducacao;
	}

	public String getFormaPagamentoPref() {
		return formaPagamentoPref;
	}

	public void setFormaPagamentoPref(String formaPagamentoPref) {
		this.formaPagamentoPref = formaPagamentoPref;
	}


}
