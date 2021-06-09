package com.tim.Evo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tim.Evo.model.Din_pev_ut_sito;

@Repository
public interface Din_pev_ut_sitoRepository extends JpaRepository<Din_pev_ut_sito, Integer>{
	
	
    @Query(value="SELECT * FROM DIN_PEV_UT_SITO AS u WHERE u.codice_sito = ?",  nativeQuery = true)
//	@Query("SELECT u FROM DIN_PEV_UT_SITO u WHERE u.codice_sito = ?1")
	public Din_pev_ut_sito findCodiceSito(Integer codice_sito);
	
	public List<Din_pev_ut_sito> findAll();

}
