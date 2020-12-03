package com.proyectoCompra.demo.models;
import javax.persistence.*;
	
@Entity
@Table(name = "detealleCompra")

public class detalleCompra {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) private long idDetalleCompra;
	@Column(name = "cantidad") private String cantidad;  
	@Column(name = "total") private float total;  
    @ManyToOne
    private compra compra;
    @ManyToOne
    private articuloProveedor articulo;
}
