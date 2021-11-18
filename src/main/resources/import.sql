---Trainer
---insert into trainers---(apellido,descripcion,dni,fecha_nac,genero,altura,peso,foto,nombre,telefono,disciplinas_id) values ('Ortiz ---Diaz',
---'5 años de experiencia',85848899,'12-11-1997','masculino','1,70m','40kg','12454.img','Melissa Nataly','923456123',1);
-----insert into trainers(apellido,direccion,email,img,nombre,telefono) values ('Ortiz Diaz','San Juan de 
--Miraflores','natalyortiz.401@gmail.com','https://acortar.link/TKjvv','Melissa Nataly','923456123');


--DISCIPLINA

INSERT INTO `disciplinas` ( `descripcion`, `imagen`, `nombre`) VALUES
('Ideal para aquellos que ya han disminuido lo suficiente su porcentaje de grasa', 'nadaPorAhora', 'core training'),
('Es un entrenamiento basado en equilibrio y balance.', 'vacio', 'Bosu'),
('Se basa en realizar ejercicio aeróbico mediante el baile principalmente con música funk, Groove y hip hop', 'vacio', 'BodyJam'),
('Proporciona a sus practicantes coordinación, fuerza, equilibrio, resistencia y flexibilidad.', 'vacio', 'TRX'),
('Proporciona para sus practicantes resistencia cardiovascular y muscular, fuerza, potencia, velocidad, flexibilidad, coordinación, equilibrio y agilidad.', 'vacio', 'CrossFit');

----insert into mensualidad ( fecha_final, fecha_inicio, mes, monto) values ( '2021-03-31', '2021-03-01', 'Marzo', '250');
---INSERT INTO disciplinas(nombre,descripcion,imagen) VALUES ('joga','estiramientos de musculos para una salud mejorada y desestresada', '74542565');
---INSERT INTO disciplinas(nombre,descripcion,imagen) VALUES ('calistenia','estrenamiento de brazos para la salud mejorada y desestresada', '56892565');

-----SALON
---INSERT INTO salon(capacidad,descripcion) VALUES (20,'primer piso');
---INSERT INTO salon(capacidad,descripcion) VALUES (15,'segundo piso');
---INSERT INTO salon(capacidad,descripcion) VALUES (14,'tercer piso');
---INSERT INTO salon(capacidad,descripcion) VALUES (10,'cuarto piso');


INSERT INTO `trainers` (`altura`, `apellido`, `descripcion`, `dni`, `fecha_nac`, `foto`, `genero`, `nombre`, `peso`, `telefono`) VALUES
('1.70', 'De la Cruz', '6 años de gimnacio', 70587797, '1996-1-26', 'EEEE', 'M', 'Carlos', '56', 952548265),
('1.80', 'Galardo', '8 años de gimnasio', 56685878, '1998-10-15', 'EEEE', 'M', 'Juan', '60', 958521546),
('1.75', 'Amparo', '4 años de gimnasio', 20487597, '1997-9-14', 'EEEE', 'F', 'Anayeli', '45', 9898581563);
