package com.proyectoCompra.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "detalleSolicitud")

public class detalleSolicitud {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) private long idDetalleSolicitud;
	@Column(name = "cantidad") private String cantidad;  
	
    @ManyToOne
    private solicitud solicitud;
    @ManyToOne
    private articuloEmpresa articulo;
	public long getIdDetalleSolicitud() {
		return idDetalleSolicitud;
	}
	public void setIdDetalleSolicitud(long idDetalleSolicitud) {
		this.idDetalleSolicitud = idDetalleSolicitud;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public solicitud getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(solicitud solicitud) {
		this.solicitud = solicitud;
	}
	public articuloEmpresa getArticulo() {
		return articulo;
	}
	public void setArticulo(articuloEmpresa articulo) {
		this.articulo = articulo;
	}
	public detalleSolicitud(long idDetalleSolicitud, String cantidad,
			com.proyectoCompra.demo.models.solicitud solicitud, articuloEmpresa articulo) {
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
