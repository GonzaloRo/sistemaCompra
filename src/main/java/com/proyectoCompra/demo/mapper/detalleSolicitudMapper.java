package com.proyectoCompra.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.proyectoCompra.demo.models.articuloProveedor;
import com.proyectoCompra.demo.models.detalleSolicitud;
import com.proyectoCompra.demo.models.solicitud;

import org.springframework.jdbc.core.RowMapper;

public class detalleSolicitudMapper implements RowMapper<detalleSolicitud> {

    @Override
    public detalleSolicitud mapRow(ResultSet rs, int rowNum) throws SQLException {
        detalleSolicitud detalle_solicitud = new detalleSolicitud();
        articuloProveedor articuloProveedor = new articuloProveedor();

        ArticuloMapper art = new ArticuloMapper();
        articuloProveedor = art.mapRow(rs, rowNum);

        detalle_solicitud.setIdDetalleSolicitud(rs.getInt("id_detalle_solicitud"));
        detalle_solicitud.setCantidad(rs.getInt("cantidad"));
        detalle_solicitud.setArticulo(articuloProveedor);
        return detalle_solicitud;
    }

}
