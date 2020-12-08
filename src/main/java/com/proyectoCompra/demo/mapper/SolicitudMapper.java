package com.proyectoCompra.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.proyectoCompra.demo.models.empleado;
import com.proyectoCompra.demo.models.solicitud;

import org.springframework.jdbc.core.RowMapper;

public class SolicitudMapper implements RowMapper<solicitud> {

    @Override
    public solicitud mapRow(ResultSet rs, int rowNum) throws SQLException {
        solicitud solicitud = new solicitud();
        empleado empleado = new empleado();

        EmpleadoMapper emp = new EmpleadoMapper();
        empleado = emp.mapRow(rs, rowNum);

        solicitud.setIdSolicitud(rs.getLong("id_solicitud"));
        solicitud.setCantidad(rs.getInt("cantidad"));
        solicitud.setNombreArt(rs.getString("nombre_art"));
        solicitud.setUnidad(rs.getString("unidad"));
        solicitud.setEstado(rs.getInt("estado"));
        solicitud.setEmpleado(empleado);
        return solicitud;

    }

}
