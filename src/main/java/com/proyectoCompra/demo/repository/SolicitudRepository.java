package com.proyectoCompra.demo.repository;

import java.util.List;

import com.proyectoCompra.demo.mapper.SolicitudMapper;
import com.proyectoCompra.demo.mapper.detalleSolicitudMapper;
import com.proyectoCompra.demo.models.detalleSolicitud;
import com.proyectoCompra.demo.models.solicitud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SolicitudRepository {
        @Autowired
        private JdbcTemplate jdbcTemplate;

        public List<solicitud> findAll(Pageable pageable) {
                List<solicitud> db = jdbcTemplate.query(
                                "select * from solicitud s "
                                                + " join empleado e on s.empleado_id_empleado=e.id_empleado"
                                                + " join departamento d on e.depto_id_depto=d.id_depto",
                                new SolicitudMapper());
                return db;
        }

        public solicitud findById(int id) {
                Object[] params = new Object[] { id };
                return jdbcTemplate.queryForObject("select * from solicitud s "
                                + " join empleado e on e.id_empleado=s.empleado_id_empleado"
                                + " join departamento d on d.id_depto=e.depto_id_depto" + " where id_solicitud= ? ",
                                params, new SolicitudMapper());

        }

        public List<detalleSolicitud> ObtenerById(int id) {
                Object[] params = new Object[] { id };
                return (List<detalleSolicitud>) jdbcTemplate
                                .query("select * from detalle_solicitud ds join solicitud s "
                                                + " on ds.solicitud_id_solicitud=s.id_solicitud"
                                                + " join articulo_proveedor a on a.id_articulo=ds.articulo_id_articulo"
                                                + " where id_solicitud= ? ", params, new detalleSolicitudMapper());

        }
}
