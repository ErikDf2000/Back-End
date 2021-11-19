-- DISCIPLINAs

INSERT INTO disciplinas (id,descripcion,imagen,nombre) VALUES (1,'Ideal para aquellos que ya han disminuido lo suficiente su porcentaje de grasa','nadaPorAhora', 'core training');
INSERT INTO disciplinas (id,descripcion,imagen,nombre) VALUES (2,'Es un entrenamiento basado en equilibrio y balance', 'vacio', 'Bosu');
INSERT INTO disciplinas (id,descripcion,imagen,nombre) VALUES (3,'Se basa en realizar ejercicio aeróbico mediante el baile principalmente con música funk, Groove y hip hop', 'vacio', 'BodyJam');
INSERT INTO disciplinas (id,descripcion,imagen,nombre) VALUES (4,'Proporciona a sus practicantes coordinación, fuerza, equilibrio, resistencia y flexibilidad', 'vacios', 'TRX');
INSERT INTO disciplinas (id,descripcion,imagen,nombre) VALUES (5,'Proporciona para sus practicantes resistencia cardiovascular y muscular, fuerza, potencia, velocidad, flexibilidad, coordinación, equilibrio y agilidad', 'vacio', 'CrossFit');



-- SALON

INSERT INTO salon (capacidad,descripcion) VALUES (20,'primer piso');
INSERT INTO salon (capacidad,descripcion) VALUES (15,'segundo piso');
INSERT INTO salon (capacidad,descripcion) VALUES (14,'tercer piso');
INSERT INTO salon (capacidad,descripcion) VALUES (10,'cuarto piso');

-- trainers
INSERT INTO trainers (id,altura,apellido,descripcion,dni,fecha_nac,foto,genero,nombre,peso,telefono) VALUES (1,'1.70', 'De la Cruz', '6 años de gimnacio', 70587797, '1996-1-26', 'EEEE', 'M', 'Carlos', '56', 952548265);
INSERT INTO trainers (id,altura,apellido,descripcion,dni,fecha_nac,foto,genero,nombre,peso,telefono) VALUES (2,'1.80', 'Galardo', '8 años de gimnasio', 56685878, '1998-10-15', 'EEEE', 'M', 'Juan', '60', 958521546);
INSERT INTO trainers (id,altura,apellido,descripcion,dni,fecha_nac,foto,genero,nombre,peso,telefono) VALUES (3,'1.75', 'Amparo', '4 años de gimnasio', 20487597, '1997-9-14', 'EEEE', 'F', 'Anayeli', '45', 9898581563);

-- UNION
INSERT INTO disciplinas_de_trainers (id_disciplina,id_trainer) VALUES (2,1);
INSERT INTO disciplinas_de_trainers (id_disciplina,id_trainer) VALUES (3,2);
INSERT INTO disciplinas_de_trainers (id_disciplina,id_trainer) VALUES (4,3);