package com.proyectoCompra.demo.models;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "articuloEmpresa")

public class articuloEmpresa {
	
	 	public articuloEmpresa() {
		super();
	}

		public articuloEmpresa(long idArticulo, String nombre, float precio, Date fecha_ingreso,
			com.proyectoCompra.demo.models.empleado empleado) {
		super();
		this.idArticulo = idArticulo;
		this.nombre = nombre;
		this.precio = precio;
		this.fecha_ingreso = fecha_ingreso;
		this.empleado = empleado;
	}

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO) private long idArticulo;
	    @Column(name = "nombre") private String nombre;  
	    @Column(name = "precio") private float precio;  
	    @Column(name = "unidad") private String unidad;  
	    @Column(name = "fecha_ingreso")  private Date fecha_ingreso;
	   
 
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
			return fecha_ingreso;
		}

		public void setFechaIngreso(Date fechaIngreso) {
			this.fecha_ingreso = fechaIngreso;
		}

		public empleado getEmpleado() {
			return empleado;
		}

		public void setEmpleado(empleado empleado) {
			this.empleado = empleado;
		}
	    
	    


}
