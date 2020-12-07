package com.proyectoCompra.demo.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.proyectoCompra.demo.mapper.DetalleCompraMapper;
import com.proyectoCompra.demo.models.detalleCompra;

import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class DetalleCompraRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<detalleCompra> ObtenerDetalleById(int id) {
        Object[] params = new Object[] { id };
        return (List<detalleCompra>) jdbcTemplate.query("select * from detalle_compra dc join compra c "
                + " on dc.compra_idcompra=c.idcompra"
                + " join articulo_proveedor a on a.id_articulo=dc.articulo_id_articulo" + " where compra_idcompra= ? ",
                params, new DetalleCompraMapper());

    }
}
