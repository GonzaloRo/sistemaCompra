package com.proyectoCompra.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "detalleCompra")

public class detalleCompra {
	public detalleCompra() {
		super();
	}

	public detalleCompra(long idDetalleCompra, int cantidad, float total, com.proyectoCompra.demo.models.compra compra,
			articuloProveedor articulo) {
		super();
		this.idDetalleCompra = idDetalleCompra;
		this.cantidad = cantidad;
		this.total = total;
		this.compra = compra;
		this.articulo = articulo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idDetalleCompra;
	@Column(name = "cantidad")
	private int cantidad;
	@Column(name = "total")
	private float total;
	@ManyToOne
	private compra compra;
	@ManyToOne
	private articuloProveedor articulo;

	public long getIdDetalleCompra() {
		return idDetalleCompra;
	}

	public void setIdDetalleCompra(long idDetalleCompra) {
		this.idDetalleCompra = idDetalleCompra;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public compra getCompra() {
		return compra;
	}

	public void setCompra(compra compra) {
		this.compra = compra;
	}

	public articuloProveedor getArticulo() {
		return articulo;
	}

	public void setArticulo(articuloProveedor articulo) {
		this.articulo = articulo;
	}
}
