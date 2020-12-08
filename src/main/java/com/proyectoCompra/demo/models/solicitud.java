package com.proyectoCompra.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "solicitud")

public class solicitud {

	public solicitud() {
		super();
	}

	public solicitud(long idSolicitud, String nombreArt, String unidad, int cantidad, int estado,
			com.proyectoCompra.demo.models.empleado empleado) {
		super();
		this.idSolicitud = idSolicitud;
		this.nombreArt = nombreArt;
		this.unidad = unidad;
		this.cantidad = cantidad;
		this.estado = estado;
		this.empleado = empleado;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idSolicitud;
	@Column(name = "nombreArt")
	private String nombreArt;
	@Column(name = "unidad")
	private String unidad;
	@Column(name = "cantidad")
	private int cantidad;
	@Column(name = "estado")
	private int estado;

	@ManyToOne
	private empleado empleado;

	public long getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(long idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public String getNombreArt() {
		return nombreArt;
	}

	public void setNombreArt(String nombreArt) {
		this.nombreArt = nombreArt;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(empleado empleado) {
		this.empleado = empleado;
	}

}
