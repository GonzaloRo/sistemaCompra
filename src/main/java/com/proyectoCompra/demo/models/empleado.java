package com.proyectoCompra.demo.models;

import javax.persistence.*;	

@Entity
@Table(name = "empleado")


public class empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) private long idEmpleado;
    @Column(name = "nombre") private String nombre;  
    @ManyToOne
    private departamento depto;
    @ManyToOne
    private cargo cargo;

}
