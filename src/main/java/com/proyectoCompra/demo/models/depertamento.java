package com.proyectoCompra.demo.models;

import javax.persistence.*;	

@Entity
@Table(name = "departamento")
public class depertamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) private long idDepto;
    @Column(name = "nombre") private String nombre;  

    
}
