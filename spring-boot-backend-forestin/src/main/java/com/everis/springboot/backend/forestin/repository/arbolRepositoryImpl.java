package com.everis.springboot.backend.forestin.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.springboot.backend.forestin.Dao.IArbolDao;
import com.everis.springboot.backend.forestin.entity.Arbol;

@Service
public class arbolRepositoryImpl implements IArbolRepository {
	
	@Autowired
	IArbolDao arbolDao; 
	
	@Override
	public List<Arbol> findAll() {
		// TODO Auto-generated method stub
		return (List<Arbol>) arbolDao.findAll();
	}

	@Override
	public Arbol finById(Integer id) {
		// TODO Auto-generated method stub
		return arbolDao.findById(id).orElse(null);
	}

	@Override
	public Arbol save(Arbol arbol) {
		// TODO Auto-generated method stub
		return arbolDao.save(arbol); 
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		arbolDao.deleteById(id);
	}

}
