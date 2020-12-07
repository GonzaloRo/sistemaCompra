package com.proyectoCompra.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.proyectoCompra.demo.models.compra;
import com.proyectoCompra.demo.models.departamento;
import com.proyectoCompra.demo.models.empleado;
import com.proyectoCompra.demo.models.solicitud;

import org.springframework.jdbc.core.RowMapper;

public class CompraMapper implements RowMapper<compra> {

    @Override
    public compra mapRow(ResultSet rs, int rowNum) throws SQLException {

        compra compra = new compra();
        solicitud solicitud = new solicitud();
        empleado empleado = new empleado();

        EmpleadoMapper emp = new EmpleadoMapper();
        empleado = emp.mapRow(rs, rowNum);

        solicitud.setEmpleado(empleado);

        compra.setIdcompra(rs.getInt("idcompra"));
        compra.setSolicitud(solicitud);

        return compra;
    }

}
