package com.proyectoCompra.demo.models;
import javax.persistence.*;	

@Entity
@Table(name = "proveedor")

public class proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) private long idProveedor;
    @Column(name = "nombre") private String nombre;  
    @Column(name = "municipio") private String municipio;  
}
