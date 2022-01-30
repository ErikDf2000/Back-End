
--
insert into mensualidad ( fecha_final, fecha_inicio, mes, monto) values ( '2022-01-31', '2022-01-01', 'Enero', '35');
insert into mensualidad ( fecha_final, fecha_inicio, mes, monto) values ( '2022-02-28', '2022-02-01', 'Febrero', '35');
insert into mensualidad ( fecha_final, fecha_inicio, mes, monto) values ( '2022-03-31', '2022-03-01', 'Marzo', '35');
insert into mensualidad ( fecha_final, fecha_inicio, mes, monto) values ( '2022-04-30', '2022-04-01', 'Abril', '35');
insert into mensualidad ( fecha_final, fecha_inicio, mes, monto) values ( '2022-05-31', '2022-05-01', 'Mayo', '35');
insert into mensualidad ( fecha_final, fecha_inicio, mes, monto) values ( '2022-06-30', '2022-06-01', 'Junio', '35');
insert into mensualidad ( fecha_final, fecha_inicio, mes, monto) values ( '2022-07-31', '2022-07-01', 'Julio', '35');
insert into mensualidad ( fecha_final, fecha_inicio, mes, monto) values ( '2022-08-31', '2022-08-01', 'Agosto', '35');
insert into mensualidad ( fecha_final, fecha_inicio, mes, monto) values ( '2022-09-30', '2022-09-01', 'Septiembre', '35');
insert into mensualidad ( fecha_final, fecha_inicio, mes, monto) values ( '2022-10-31', '2022-10-01', 'Octubre', '35');
insert into mensualidad ( fecha_final, fecha_inicio, mes, monto) values ( '2022-11-30', '2022-11-01', 'Noviembre', '35');
insert into mensualidad ( fecha_final, fecha_inicio, mes, monto) values ( '2022-12-31', '2022-12-01', 'Diciembre', '35');


INSERT INTO disciplinas (id,descripcion,imagen,nombre) VALUES (1,'Ideal para aquellos que ya han disminuido lo suficiente su porcentaje de grasa','https://i.imgur.com/fyp7d3m.jpg', 'core training');
INSERT INTO disciplinas (id,descripcion,imagen,nombre) VALUES (2,'Es un entrenamiento basado en equilibrio y balance', 'https://i.imgur.com/vPU7OiC.jpg', 'Bosu');
INSERT INTO disciplinas (id,descripcion,imagen,nombre) VALUES (3,'Se basa en realizar ejercicio aeróbico mediante el baile principalmente con música funk, Groove y hip hop', 'https://i.imgur.com/NtPAFN3.jpg', 'BodyJam');
INSERT INTO disciplinas (id,descripcion,imagen,nombre) VALUES (4,'Proporciona a sus practicantes coordinación, fuerza, equilibrio, resistencia y flexibilidad', 'https://i.imgur.com/aFDr24p.jpg', 'TRX');
INSERT INTO disciplinas (id,descripcion,imagen,nombre) VALUES (5,'Proporciona para sus practicantes resistencia cardiovascular y muscular, fuerza, potencia, velocidad, flexibilidad, coordinación, equilibrio y agilidad', 'https://i.imgur.com/YBDeDCN.jpg', 'CrossFit');



-- SALON

INSERT INTO salon (capacidad,descripcion) VALUES (20,'primer piso');
INSERT INTO salon (capacidad,descripcion) VALUES (15,'segundo piso');
INSERT INTO salon (capacidad,descripcion) VALUES (14,'tercer piso');
INSERT INTO salon (capacidad,descripcion) VALUES (10,'cuarto piso');

--- trainers
INSERT INTO trainers (id,altura,apellido,descripcion,dni,fecha_nac,foto,genero,nombre,peso,telefono) VALUES (1,'1.70', 'De la Cruz', '6 años de gimnacio', 70587797, '1996-1-26', 'https://i.imgur.com/qpgHr6A.jpg', 'M', 'Carlos', '56', 952548265);
INSERT INTO trainers (id,altura,apellido,descripcion,dni,fecha_nac,foto,genero,nombre,peso,telefono) VALUES (2,'1.80', 'Galardo', '8 años de gimnasio', 56685878, '1998-10-15', 'https://i.imgur.com/pMTKt20.jpg', 'M', 'Juan', '60', 958521546);
INSERT INTO trainers (id,altura,apellido,descripcion,dni,fecha_nac,foto,genero,nombre,peso,telefono) VALUES (3,'1.75', 'Amparo', '4 años de gimnasio', 20487597, '1997-9-14', 'https://i.imgur.com/F2op4qE.jpg', 'F', 'Anayeli', '45', 9898581563);

-- UNION
INSERT INTO disciplinas_de_trainers (id_disciplina,id_trainer) VALUES (2,1);
INSERT INTO disciplinas_de_trainers (id_disciplina,id_trainer) VALUES (3,2);
INSERT INTO disciplinas_de_trainers (id_disciplina,id_trainer) VALUES (1,3);



---`cliente`
INSERT INTO cliente (id, apellido, celular, correo,foto, nombre, sexo,dni) VALUES (1, 'Palacios', 987456525, 'Gloria@gmail.com',NULL, 'Gloria', 'Femenino', '75584477');
INSERT INTO cliente (id, apellido, celular, correo,foto, nombre, sexo,dni) VALUES (2, 'Cabrera', 987456525, 'Hugo@gmail.com',NULL, 'Hugo', 'Masculino', '68745814');




--- `planpago`
INSERT INTO planpago (id, costo, disciplinas, estado, finn, inicio, nombre) VALUES (1,150, 2, 'True', '2021-11-27', '2021-11-27', 'Plan Gold');
INSERT INTO planpago (id, costo, disciplinas, estado, finn, inicio, nombre) VALUES (2,200, 2, 'True', '2021-11-27', '2021-11-27', 'Plan Plata');
INSERT INTO planpago (id, costo, disciplinas, estado, finn, inicio, nombre) VALUES (3,250, 3, 'True', '2021-2-15', '2021-1-15', 'Plan Diamond');


---RESERVA---
insert into reserva (id, cliente_id , fecha ,estado ,planpago_id ) values (null, 1 , '2022-01-14', true , 1);
insert into reserva (id, cliente_id , fecha ,estado ,planpago_id ) values (null, 2 , '2022-01-14', true , 3);

---CLASE---
INSERT INTO clase (id, cuposmax, hora_fin,hora_ini, disciplina_id, salon_id, trainers_id) VALUES (null, 10, '2022-02-01 02:09:40', '2022-01-20 02:08:00', 1, 1, 1);
INSERT INTO clase (id, cuposmax, hora_fin,hora_ini, disciplina_id, salon_id, trainers_id) VALUES (null, 10, '2022-02-01 02:11:00', '2022-01-20 02:10:00', 2, 2, 2);
INSERT INTO clase (id, cuposmax, hora_fin,hora_ini, disciplina_id, salon_id, trainers_id) VALUES (null, 10, '2022-02-01 02:12:30', '2022-01-20 02:11:00', 3, 3, 3);

INSERT INTO clase (id, cuposmax, hora_fin,hora_ini, disciplina_id, salon_id, trainers_id) VALUES (null, 15, '2022-02-02 02:09:00', '2022-01-21 02:07:00', 2, 2, 3);
INSERT INTO clase (id, cuposmax, hora_fin,hora_ini, disciplina_id, salon_id, trainers_id) VALUES (null, 15, '2022-02-02 02:11:30', '2022-01-21 02:10:00', 3, 1, 2);

INSERT INTO clase (id, cuposmax, hora_fin,hora_ini, disciplina_id, salon_id, trainers_id) VALUES (null, 13, '2022-02-03 02:09:30', '2022-01-22 02:07:30', 3, 4, 2);
INSERT INTO clase (id, cuposmax, hora_fin,hora_ini, disciplina_id, salon_id, trainers_id) VALUES (null, 12, '2022-02-04 02:10:00', '2022-01-29 02:11:00', 1, 2, 2);

---PAGO---

INSERT INTO pago VALUES (null, 'pago completado', 'Pendiente', '2021-11-27', 1, 1 );
INSERT INTO pago  VALUES (null, 'pago completado2', 'Pendiente', '2021-11-27', 2, 1 );
INSERT INTO pago  VALUES (null, 'pago completado II', 'Pendiente', '2021-11-27', 3, 1 );
INSERT INTO pago VALUES (null, 'pago completado IV', 'Pendiente', '2021-11-27', 4, 1 );
INSERT INTO pago  VALUES (null, 'pago completado V', 'Pendiente', '2021-11-27',5, 1 );
INSERT INTO pago  VALUES (null, 'pago completado VI', 'Pendiente', '2021-11-27', 6, 1 );
INSERT INTO pago VALUES (null, 'pago completado VII', 'Pendiente', '2021-11-27', 7, 1 );
INSERT INTO pago  VALUES (null, 'pago completado', 'Pendiente', '2021-11-27', 8, 1 );
INSERT INTO pago  VALUES (null, 'pago completado', 'Pendiente', '2021-11-27', 9, 1 );
INSERT INTO pago VALUES (null, 'pago completado', 'Pendiente', '2021-11-27', 10, 1 );
INSERT INTO pago  VALUES (null, 'pago completado', 'Pendiente', '2021-11-27', 11, 1 );
INSERT INTO pago  VALUES (null, 'pago completado', 'Pendiente', '2021-11-27', 12, 1 );

INSERT INTO pago VALUES (null, '', 'Pendiente', '2022-02-27', 1, 2 );
INSERT INTO pago  VALUES (null, '', 'Pendiente', '2022-03-27', 2, 2 );
INSERT INTO pago  VALUES (null, '', 'Pendiente', '2022-04-27', 3, 2 );
INSERT INTO pago VALUES (null, '', 'Pendiente', '2022-05-27', 4, 2 );
INSERT INTO pago  VALUES (null, '', 'Pendiente', '2022-06-27',5, 2 );
INSERT INTO pago  VALUES (null, '  ', 'Pendiente', '2022-07-27', 6, 2 );
INSERT INTO pago VALUES (null, '  ', 'Pendiente', '2021-08-27', 7, 2 );
INSERT INTO pago  VALUES (null, ' ', 'Pendiente', '2021-09-27', 8, 2 );
INSERT INTO pago  VALUES (null, ' ', 'Pendiente', '2021-10-27', 9, 2 );
INSERT INTO pago VALUES (null, ' ', 'Pendiente', '2021-11-27', 10, 2 );
INSERT INTO pago  VALUES (null, ' ', 'Pendiente', '2021-12-27', 11, 2 );
INSERT INTO pago  VALUES (null, ' ', 'Pendiente', '2021-13-27', 12, 2 );



---ROL
insert into rol values (null,'EMPLEADO');
insert into rol values (null,'ADMIN');
insert into rol values (null,'CLIENTE');

---ADMIN
insert into admin values (null, 'Paul Lorem', 'Rojas Castillo');
insert into admin values (null, 'Lorenzo Deam', 'Ambrose Leiya');
---ADMIN usuario
INSERT INTO usuario VALUES (null, 'admin001', 'admin01', 1, NULL, 2);
INSERT INTO usuario VALUES (null, 'admin002', 'admin02', 2, NULL, 2);


---Cliente usuario
INSERT INTO `usuario` VALUES (null, '12345678', 'Gloria', NULL, 1, 3);
INSERT INTO `usuario` VALUES (null, '123456789', 'Hugo', NULL, 2, 3);


