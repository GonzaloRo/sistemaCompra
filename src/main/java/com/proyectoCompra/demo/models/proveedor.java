package com.proyectoCompra.demo.models;
import javax.persistence.*;	

@Entity
@Table(name = "proveedor")

public class proveedor {
    public proveedor() {
		super();
	}
	public proveedor(long idProveedor, String nombre, String municipio) {
		super();
		this.idProveedor = idProveedor;
		this.nombre = nombre;
		this.municipio = municipio;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) private long idProveedor;
    @Column(name = "nombre") private String nombre;  
    @Column(name = "municipio") private String municipio;
	public long getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(long idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}  
}
