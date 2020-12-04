package com.proyectoCompra.demo.models;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name = "articuloProveedor")

public class articuloEmpresa {
	
	 	public articuloEmpresa() {
		super();
	}

		public articuloEmpresa(long idArticulo, String nombre, float precio, Date fechaIngreso,
			com.proyectoCompra.demo.models.empleado empleado) {
		super();
		this.idArticulo = idArticulo;
		this.nombre = nombre;
		this.precio = precio;
		this.fechaIngreso = fechaIngreso;
		this.empleado = empleado;
	}

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO) private long idArticulo;
	    @Column(name = "nombre") private String nombre;  
	    @Column(name = "precio") private float precio;  
	    @Column(name = "unidad") private String unidad;  
	    @Column(name = "fechaIngreso") private Date fechaIngreso;
 
	    @ManyToOne
	    private empleado empleado;

		public long getIdArticulo() {
			return idArticulo;
		}

		public void setIdArticulo(long idArticulo) {
			this.idArticulo = idArticulo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public float getPrecio() {
			return precio;
		}

		public void setPrecio(float precio) {
			this.precio = precio;
		}

		public Date getFechaIngreso() {
			return fechaIngreso;
		}

		public void setFechaIngreso(Date fechaIngreso) {
			this.fechaIngreso = fechaIngreso;
		}

		public empleado getEmpleado() {
			return empleado;
		}

		public void setEmpleado(empleado empleado) {
			this.empleado = empleado;
		}
	    
	    


}
