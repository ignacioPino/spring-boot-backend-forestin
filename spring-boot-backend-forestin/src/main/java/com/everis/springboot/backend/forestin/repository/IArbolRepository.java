package com.everis.springboot.backend.forestin.repository;

import java.util.List;

import com.everis.springboot.backend.forestin.entity.Arbol;

public interface IArbolRepository {
	
	public List<Arbol> findAll(); 
	
	public Arbol finById(Integer id); 
	
	public Arbol save(Arbol arbol); 
	
	public void delete(Integer id);  
}
