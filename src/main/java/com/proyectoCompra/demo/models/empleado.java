package com.proyectoCompra.demo.models;

import javax.persistence.*;	

@Entity
@Table(name = "empleado")


public class empleado {

    public empleado() {
		super();
	}
	public empleado(long idEmpleado, String nombre, departamento depto, com.proyectoCompra.demo.models.cargo cargo) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.depto = depto;
		this.cargo = cargo;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) private long idEmpleado;
    @Column(name = "nombre") private String nombre;  
    @ManyToOne
    private departamento depto;
    @ManyToOne
    private cargo cargo;
	public long getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public departamento getDepto() {
		return depto;
	}
	public void setDepto(departamento depto) {
		this.depto = depto;
	}
	public cargo getCargo() {
		return cargo;
	}
	public void setCargo(cargo cargo) {
		this.cargo = cargo;
	}

}
