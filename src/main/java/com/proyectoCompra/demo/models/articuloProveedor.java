package com.proyectoCompra.demo.models;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "articuloProveedor")

public class articuloProveedor {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO) private long idArticulo;
	    @Column(name = "nombre") private String nombre;  
	    @Column(name = "precio") private float precio;  
	    @Column(name = "fechaInicio") private Date fechaInicio;  
	    @Column(name = "fechaFinal") private Date fechaFinal;  
	    @Column(name = "porcentajeDesc") private float porcentajeDesc;  
	    @Column(name = "periodoGracia") private int periodoGracia;  
	
	    @ManyToOne
	    private proveedor proveedor;

}
