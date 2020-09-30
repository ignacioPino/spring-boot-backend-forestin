package com.everis.springboot.backend.forestin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.everis.springboot.backend.forestin.entity.Arbol;
import com.everis.springboot.backend.forestin.repository.IArbolRepository;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping(value="/")
public class ArbolController {
	
	@Autowired
	IArbolRepository arbolRepo; 
	
	// este metodo lista todos los arboles existentes
	@GetMapping("arbol")
	public List<Arbol> index(){
		return (List<Arbol>) arbolRepo.findAll(); 
	}
	
	//este metodo es para crear un arbol
	@PostMapping("crearArbol")
	@ResponseStatus(HttpStatus.CREATED)
	public Arbol create(@RequestBody Arbol arbol) {
		return arbolRepo.save(arbol);  
	}
	
	//este metodo busca por id
	@GetMapping("arbol/{idArbol}")
	public Arbol findById(@PathVariable Integer idArbol) {
		return arbolRepo.finById(idArbol); 
	}
	
	@PutMapping("arbolEdit/{idArbol}")
	@ResponseStatus(HttpStatus.CREATED)
	public Arbol update(@RequestBody Arbol arbol, @PathVariable Integer idArbol) {
		Arbol currentArbol = arbolRepo.finById(idArbol); 
		currentArbol.setNombre(arbol.getNombre());
		currentArbol.setDap(arbol.getDap());
		currentArbol.setAltura(arbol.getAltura());
		currentArbol.setEstadoSanidad(arbol.getEstadoSanidad());
		currentArbol.setEstadoDesarrollo(arbol.getEstadoDesarrollo());
		currentArbol.setCop(arbol.getCop());
		return arbolRepo.save(currentArbol); 
	}
	
	@DeleteMapping("arbolDelete/{idArbol}") 
	public void delete(@PathVariable Integer idArbol) {
		arbolRepo.delete(idArbol);
	}
}
