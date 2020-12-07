package com.proyectoCompra.demo.repository;

import java.util.List;

import com.proyectoCompra.demo.mapper.CompraMapper;
import com.proyectoCompra.demo.models.compra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CompraRepository {

        @Autowired
        private JdbcTemplate jdbcTemplate;

        public List<compra> findAll(Pageable pageable) {
                List<compra> db = jdbcTemplate.query(
                                "select * from compra c " + "join solicitud s "
                                                + " on c.solicitud_id_solicitud = s.id_solicitud "
                                                + " join empleado e on s.empleado_id_empleado=e.id_empleado"
                                                + " join departamento d on e.depto_id_depto=d.id_depto",
                                new CompraMapper());
                return db;
        }

        public compra findById(int id) {
                Object[] params = new Object[] { id };
                return jdbcTemplate.queryForObject("select * from compra c"
                                + " join solicitud s on c.solicitud_id_solicitud=s.id_solicitud"
                                + " join empleado e on e.id_empleado=s.empleado_id_empleado"
                                + " join departamento d on d.id_depto=e.depto_id_depto" + " where idcompra= ? ", params,
                                new CompraMapper());

        }

}
