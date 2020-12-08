package com.proyectoCompra.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "detalleSolicitud")

public class detalleSolicitud {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idDetalleSolicitud;
	@Column(name = "cantidad")
	private int cantidad;

	@ManyToOne
	private solicitud solicitud;
	@ManyToOne
	private articuloProveedor articulo;

	public long getIdDetalleSolicitud() {
		return idDetalleSolicitud;
	}

	public void setIdDetalleSolicitud(long idDetalleSolicitud) {
		this.idDetalleSolicitud = idDetalleSolicitud;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(solicitud solicitud) {
		this.solicitud = solicitud;
	}

	public articuloProveedor getArticulo() {
		return articulo;
	}

	public void setArticulo(articuloProveedor articulo) {
		this.articulo = articulo;
	}

	public detalleSolicitud(long idDetalleSolicitud, int cantidad, com.proyectoCompra.demo.models.solicitud solicitud,
			articuloProveedor articulo) {
		super();
		this.idDetalleSolicitud = idDetalleSolicitud;
		this.cantidad = cantidad;
		this.solicitud = solicitud;
		this.articulo = articulo;
	}

	public detalleSolicitud() {
		super();
	}

}
