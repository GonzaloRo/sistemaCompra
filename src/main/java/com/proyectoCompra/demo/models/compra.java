package com.proyectoCompra.demo.models;
import javax.persistence.*;	
@Entity
@Table(name = "compra")

public class compra {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) private long idcompra;
  
    @ManyToOne
    private solicitud solicitud;

}
