package com.proyectoCompra.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.proyectoCompra.demo.models.departamento;
import com.proyectoCompra.demo.models.empleado;

import org.springframework.jdbc.core.RowMapper;

public class EmpleadoMapper implements RowMapper<empleado> {

    @Override
    public empleado mapRow(ResultSet rs, int rowNum) throws SQLException {
        empleado empleado = new empleado();
        departamento depto = new departamento();

        DepartamentoMapper dep = new DepartamentoMapper();
        depto = dep.mapRow(rs, rowNum);

        empleado.setIdEmpleado(rs.getInt("id_empleado"));
        empleado.setNombre(rs.getString("nombre"));
        empleado.setDepto(depto);

        return empleado;
    }

}
