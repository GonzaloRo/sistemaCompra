package com.proyectoCompra.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.proyectoCompra.demo.models.articuloProveedor;
import com.proyectoCompra.demo.models.detalleCompra;

import org.springframework.jdbc.core.RowMapper;

public class DetalleCompraMapper implements RowMapper<detalleCompra> {

    @Override
    public detalleCompra mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        detalleCompra detalle_compra = new detalleCompra();
        articuloProveedor articuloProveedor = new articuloProveedor();

        ArticuloMapper art = new ArticuloMapper();
        articuloProveedor = art.mapRow(rs, rowNum);

        detalle_compra.setIdDetalleCompra(rs.getInt("id_detalle_compra"));
        detalle_compra.setCantidad(rs.getInt("cantidad"));
        detalle_compra.setTotal(rs.getFloat("total"));
        detalle_compra.setArticulo(articuloProveedor);
        return detalle_compra;
    }

}
