package com.tim.Evo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ATTIVITA")
public class Attivita implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer CODICE_ATTIVITA;
	
    @JsonBackReference
    @ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn(name = "CODICE_SITO", nullable = false)
    Din_pev_ut_sito dinPevUtSito;
	
    @Column
    private int co_pev;
    
    @Column
    private String nome_sito;
    
    @Column
    private String regione_oa;
    
    @Column
    private String origine;
    
    @Column
    private String stato_attivita;
    
    @Column
    private Date data_ins;

	public Integer getCODICE_ATTIVITA() {
		return CODICE_ATTIVITA;
	}

	public void setCODICE_ATTIVITA(Integer cODICE_ATTIVITA) {
		CODICE_ATTIVITA = cODICE_ATTIVITA;
	}

	public Din_pev_ut_sito getDinPevUtSito() {
		return dinPevUtSito;
	}

	public void setDinPevUtSito(Din_pev_ut_sito dinPevUtSito) {
		this.dinPevUtSito = dinPevUtSito;
	}

	public int getCo_pev() {
		return co_pev;
	}

	public void setCo_pev(int co_pev) {
		this.co_pev = co_pev;
	}

	public String getNome_sito() {
		return nome_sito;
	}

	public void setNome_sito(String nome_sito) {
		this.nome_sito = nome_sito;
	}

	public String getRegione_oa() {
		return regione_oa;
	}

	public void setRegione_oa(String regione_oa) {
		this.regione_oa = regione_oa;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public String getStato_attivita() {
		return stato_attivita;
	}

	public void setStato_attivita(String stato_attivita) {
		this.stato_attivita = stato_attivita;
	}

	public Date getData_ins() {
		return data_ins;
	}

	public void setData_ins(Date data_ins) {
		this.data_ins = data_ins;
	}

}
