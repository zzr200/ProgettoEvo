package com.tim.Evo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.tim.Evo.model.Din_pev_ut_sito;
import com.tim.Evo.model.GetJson;
import com.tim.Evo.model.Payload;
import com.tim.Evo.service.Din_pev_ut_sitoImpl;

@RestController
public class SmartController {
	
	@Autowired
	Din_pev_ut_sitoImpl dinPev;
	
	private static final Logger log = LoggerFactory.getLogger(SmartController.class);
	
	@GetMapping("/allSito")
	public @ResponseBody List<Din_pev_ut_sito> findDinPevAll() {
		
		
		return dinPev.ricercaTutto();
	}
	
	@RequestMapping(value = "/sito", method = RequestMethod.GET)
	public @ResponseBody  Din_pev_ut_sito getOneSito(@RequestParam String codice_sito) {
		
		log.info("codice sito ricevuto = "+codice_sito);
		
		Integer cod_sitoInt=Integer.parseInt(codice_sito);
		
		return dinPev.cercaDinPev(cod_sitoInt);
	}
	
	@GetMapping("/all")
	public GetJson all() {
		// servizi mock
		Payload pay = new Payload();
		pay.setBackhaulingFibraOttica(100);
		pay.setBackhaulingPonteRadio(75);
		pay.setBackhaulingRame(0);
		pay.setDaLavoareExtra(0);
		pay.setDaLavoarePev(0);
		pay.setInLavorazioneExtra(0);
		pay.setInLavorazionePev(0);
		pay.setLavoratiExtra(0);
		pay.setLavoratiPev(0);

		GetJson jj = new GetJson();

		jj.setResult("Success");
		jj.setPayload(pay);
		jj.setTotaleElementi(3);

		log.info("--------------------------------");
		log.info("Adesso si restituiscono servizi mock");
		log.info("--------------------------------");
		return jj;
	}


}
