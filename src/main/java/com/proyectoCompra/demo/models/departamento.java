package com.proyectoCompra.demo.models;

import javax.persistence.*;	

@Entity
@Table(name = "departamento")
public class departamento {

    public departamento() {
		super();
	}
	public departamento(long idDepto, String nombre) {
		super();
		this.idDepto = idDepto;
		this.nombre = nombre;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) private long idDepto;
    @Column(name = "nombre") private String nombre;
	public long getIdDepto() {
		return idDepto;
	}
	public void setIdDepto(long idDepto) {
		this.idDepto = idDepto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}  

    
}
