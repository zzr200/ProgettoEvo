package com.tim.Evo.service;

import java.util.List;

import com.tim.Evo.model.Din_pev_ut_sito;

public interface Din_pev_ut_sitoService {
	
	public Din_pev_ut_sito cercaDinPev(Integer codice_sito);
	
	public List<Din_pev_ut_sito> ricercaTutto();

}
