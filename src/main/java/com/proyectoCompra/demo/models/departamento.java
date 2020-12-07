package com.proyectoCompra.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "departamento")
public class departamento {

	public departamento() {
		super();
	}

	public departamento(long idDepto, String nombre_depto) {
		super();
		this.idDepto = idDepto;
		this.nombre_depto = nombre_depto;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idDepto;
	@Column(name = "nombre_depto")
	private String nombre_depto;

	public long getIdDepto() {
		return idDepto;
	}

	public void setIdDepto(long idDepto) {
		this.idDepto = idDepto;
	}

	public String getnombre_depto() {
		return nombre_depto;
	}

	public void setnombre_depto(String nombre_depto) {
		this.nombre_depto = nombre_depto;
	}

}
