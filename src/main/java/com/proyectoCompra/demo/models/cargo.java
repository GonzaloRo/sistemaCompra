package com.proyectoCompra.demo.models;
import javax.persistence.*;	

@Entity
@Table(name = "cargo")
public class cargo {
	  	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO) private long idCargo;
	    @Column(name = "nombre") private String nombre;
	    @Column(name = "descripcion") private String descripcion;	   

}
