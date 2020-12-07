package com.proyectoCompra.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.proyectoCompra.demo.models.departamento;

import org.springframework.jdbc.core.RowMapper;

public class DepartamentoMapper implements RowMapper<departamento> {

    @Override
    public departamento mapRow(ResultSet rs, int rowNum) throws SQLException {
        departamento departamento = new departamento();

        departamento.setIdDepto(rs.getInt("id_depto"));
        departamento.setnombre_depto(rs.getString("nombre_depto"));
        return departamento;
    }

}
