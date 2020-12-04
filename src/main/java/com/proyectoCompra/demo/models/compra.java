package com.proyectoCompra.demo.models;
import javax.persistence.*;	
@Entity
@Table(name = "compra")

public class compra {
	public compra() {
		super();
	}

	public compra(long idcompra, com.proyectoCompra.demo.models.solicitud solicitud) {
		super();
		this.idcompra = idcompra;
		this.solicitud = solicitud;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) private long idcompra;
  
    @ManyToOne
    private solicitud solicitud;

	public long getIdcompra() {
		return idcompra;
	}

	public void setIdcompra(long idcompra) {
		this.idcompra = idcompra;
	}

	public solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(solicitud solicitud) {
		this.solicitud = solicitud;
	}

}
