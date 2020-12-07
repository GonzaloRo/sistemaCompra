package com.proyectoCompra.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.proyectoCompra.demo.models.articuloProveedor;

import org.springframework.jdbc.core.RowMapper;

public class ArticuloMapper implements RowMapper<articuloProveedor> {

    @Override
    public articuloProveedor mapRow(ResultSet rs, int rowNum) throws SQLException {
        articuloProveedor articuloProveedor = new articuloProveedor();

        articuloProveedor.setIdArticulo(rs.getInt("id_articulo"));
        articuloProveedor.setNombre(rs.getString("nombre"));
        articuloProveedor.setPrecio(rs.getFloat("precio"));
        return articuloProveedor;
    }

}
