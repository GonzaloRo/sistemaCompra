package com.proyectoCompra.demo.models;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name = "articuloProveedor")

public class articuloEmpresa {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO) private long idArticulo;
	    @Column(name = "nombre") private String nombre;  
	    @Column(name = "precio") private float precio;  
	    @Column(name = "fechaIngreso") private Date fechaIngreso;
 
	    @ManyToOne
	    private empleado empleado;	  


}
