package com.proyectoCompra.demo.models;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "articuloProveedor")

public class articuloProveedor {
	 public articuloProveedor() {
		super();
	}

	public articuloProveedor(long idArticulo, String nombre, float precio, Date fechaInicio, Date fechaFinal,
			float porcentajeDesc, int periodoGracia, com.proyectoCompra.demo.models.proveedor proveedor) {
		super();
		this.idArticulo = idArticulo;
		this.nombre = nombre;
		this.precio = precio;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.porcentajeDesc = porcentajeDesc;
		this.periodoGracia = periodoGracia;
		this.proveedor = proveedor;
	}

	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO) private long idArticulo;
	    @Column(name = "nombre") private String nombre;  
	    @Column(name = "precio") private float precio;  
	    @Column(name = "fechaInicio") private Date fechaInicio;  
	    @Column(name = "fechaFinal") private Date fechaFinal;  
	    @Column(name = "porcentajeDesc") private float porcentajeDesc;  
	    @Column(name = "periodoGracia") private int periodoGracia;  
	
	    @ManyToOne
	    private proveedor proveedor;

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

		public Date getFechaInicio() {
			return fechaInicio;
		}

		public void setFechaInicio(Date fechaInicio) {
			this.fechaInicio = fechaInicio;
		}

		public Date getFechaFinal() {
			return fechaFinal;
		}

		public void setFechaFinal(Date fechaFinal) {
			this.fechaFinal = fechaFinal;
		}

		public float getPorcentajeDesc() {
			return porcentajeDesc;
		}

		public void setPorcentajeDesc(float porcentajeDesc) {
			this.porcentajeDesc = porcentajeDesc;
		}

		public int getPeriodoGracia() {
			return periodoGracia;
		}

		public void setPeriodoGracia(int periodoGracia) {
			this.periodoGracia = periodoGracia;
		}

		public proveedor getProveedor() {
			return proveedor;
		}

		public void setProveedor(proveedor proveedor) {
			this.proveedor = proveedor;
		}

}
