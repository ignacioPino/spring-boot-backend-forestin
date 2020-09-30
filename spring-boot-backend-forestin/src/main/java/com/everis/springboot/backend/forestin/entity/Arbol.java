package com.everis.springboot.backend.forestin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name="arbol")
public class Arbol {
	
	@Id // etiqueta para identificar id
	@Column(name="id_arbol") // para identificar que es una columna
	@GeneratedValue(strategy=GenerationType.IDENTITY) // para identificar id incremental 
	private Integer idArbol;
	
	@Column
	private String nombre;
	
	@Column
	private Float dap; 
	
	@Column
	private Float altura;
	
	@Column(name="estado_sanidad")
	private String estadoSanidad;
	
	@Column(name="estado_desarrollo")
	private String estadoDesarrollo;
	
	@Column
	private Integer cop; 
}
