package com.proyectoCompra.demo.models;
import javax.persistence.*;	
@Entity
@Table(name = "solicitud")

public class solicitud {

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO) private long idSolicitud;
	    @Column(name = "nombreArt") private String nombreArt;  
	    @Column(name = "unidad") private String unidad;  
	    @Column(name = "cantidad") private String cantidad;  
	    @Column(name = "estado") private int estado;  
	    
	    @ManyToOne
	    private empleado empleado;
	
}
