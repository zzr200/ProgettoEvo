package com.tim.Evo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tim.Evo.controller.SmartController;
import com.tim.Evo.dao.Din_pev_ut_sitoRepository;
import com.tim.Evo.model.Din_pev_ut_sito;

@Service
public class Din_pev_ut_sitoImpl implements Din_pev_ut_sitoService{
	
	@Autowired
	Din_pev_ut_sitoRepository dinpevRepo;
	
	private static final Logger log = LoggerFactory.getLogger(Din_pev_ut_sitoImpl.class);

	@Override
	public Din_pev_ut_sito cercaDinPev(Integer codice_sito) {
		
		log.info("codice sito ricevuto in Din_pev_ut_sitoImpl ="+codice_sito);

		return dinpevRepo.findCodiceSito(codice_sito);
		
	}
	
	@Override
	public List<Din_pev_ut_sito> ricercaTutto(){
		
		return dinpevRepo.findAll();
	}
	
	

}
