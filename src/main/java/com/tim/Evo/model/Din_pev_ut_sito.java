package com.tim.Evo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "DIN_PEV_UT_SITO")
public class Din_pev_ut_sito implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codice_sito;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "dinPevUtSito", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Attivita> attivitaList= new ArrayList<Attivita>();

	public Integer getCodice_sito() {
		return codice_sito;
	}

	public void setCodice_sito(Integer codice_sito) {
		this.codice_sito = codice_sito;
	}

	public List<Attivita> getAttivitaList() {
		return attivitaList;
	}

	public void setAttivitaList(List<Attivita> attivitaList) {
		this.attivitaList = attivitaList;
	}
	
}
