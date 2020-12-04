package com.proyectoCompra.demo.models;
import javax.persistence.*;	

@Entity
@Table(name = "cargo")
public class cargo {
	  	public cargo() {
		super();
	}
		public cargo(long idCargo, String nombre, String descripcion) {
		super();
		this.idCargo = idCargo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO) private long idCargo;
	    @Column(name = "nombre") private String nombre;
	    @Column(name = "descripcion") private String descripcion;
		public long getIdCargo() {
			return idCargo;
		}
		public void setIdCargo(long idCargo) {
			this.idCargo = idCargo;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}	   

}
