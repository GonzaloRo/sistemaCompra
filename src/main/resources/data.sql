
        INSERT INTO cargo(id_cargo, descripcion, nombre) VALUES (1,'Encargado de compras', 'Gestionar compras');
        
        INSERT INTO cargo(id_cargo, descripcion, nombre) VALUES (2, 'Administrador', 'Encargado de empleados');
        INSERT INTO departamento(id_depto, nombre_depto) VALUES (1, 'Produccion ');
        INSERT INTO departamento(id_depto, nombre_depto) VALUES (2, 'Compras ');
        INSERT INTO departamento(id_depto, nombre_depto) VALUES (3, 'Tecnologia Informatica ');
        INSERT INTO departamento(id_depto, nombre_depto) VALUES (4, 'Administracion ');
        
        INSERT INTO empleado(id_empleado, nombre, cargo_id_cargo, depto_id_depto) VALUES (1, 'Yessica Rivera', 1, 2);
        
        INSERT INTO empleado(id_empleado, nombre, cargo_id_cargo, depto_id_depto) VALUES (2, 'Nathaly Rodriguez', 2, 4);
        
        INSERT INTO empleado(id_empleado, nombre, cargo_id_cargo, depto_id_depto) VALUES (3, 'Gonzalo Rodriguez', 2, 1);
        
        INSERT INTO public.proveedor(id_proveedor, municipio, nombre) VALUES (1,'La  Palma', 'Pedro Valle');
        
        INSERT INTO articulo_proveedor(id_articulo, fecha_ingreso, nombre, precio, fecha_final, fecha_inicio, periodo_gracia, porcentaje_desc, empleado_id_empleado, proveedor_id_proveedor) VALUES (1, '12/07/2020', 'Impresora', 37.99, '30/08/2020', '15/08/2020', 5, 1.0, 1, 1);
        
        INSERT INTO articulo_proveedor(id_articulo, fecha_ingreso, nombre, precio, fecha_final, fecha_inicio, periodo_gracia, porcentaje_desc, empleado_id_empleado, proveedor_id_proveedor) VALUES (2, '12/07/2020', 'Papel Bond', 3.99, '10/09/2020', '15/10/2020', 5, 15.0, 1, 1);
        
        INSERT INTO articulo_proveedor(id_articulo, fecha_ingreso, nombre, precio, fecha_final, fecha_inicio, periodo_gracia, porcentaje_desc, empleado_id_empleado, proveedor_id_proveedor) VALUES (3, '12/07/2020', 'Tinta para impresora', 7.50, '07/08/2020', '30/08/2020', 5, 20.0, 1, 1);
        
        INSERT INTO solicitud(id_solicitud, cantidad, estado, nombre_art, unidad, empleado_id_empleado) VALUES (1, 100, 1, 'Articulos de oficina', 'Lotes', 1);
        INSERT INTO compra(idcompra, solicitud_id_solicitud) VALUES (1,1);
        INSERT INTO compra(idcompra, solicitud_id_solicitud) VALUES (2,1);
        
        INSERT INTO detalle_compra(id_detalle_compra, cantidad, total, articulo_id_articulo, compra_idcompra) VALUES (1, 10, 300.97, 1, 1);
        
        INSERT INTO detalle_compra(id_detalle_compra, cantidad, total, articulo_id_articulo, compra_idcompra) VALUES (2, 100, 399, 2, 1);
        
        INSERT INTO detalle_compra(id_detalle_compra, cantidad, total, articulo_id_articulo, compra_idcompra) VALUES (3, 50, 375, 3, 2);
        
        INSERT INTO detalle_compra(id_detalle_compra, cantidad, total, articulo_id_articulo, compra_idcompra) VALUES (4, 100, 399, 2, 2);
