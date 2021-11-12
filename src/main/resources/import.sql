---Trainer
insert into trainers(apellido,descripcion,dni,fecha_nac,genero,altura,peso,foto,nombre,telefono,disciplinas_id) values ('Ortiz Diaz',
'5 años de experiencia',85848899,'12-11-1997','masculino','1,70m','40kg','12454.img','Melissa Nataly','923456123',1);
--insert into trainers(apellido,direccion,email,img,nombre,telefono) values ('Ortiz Diaz','San Juan de 
--Miraflores','natalyortiz.401@gmail.com','https://acortar.link/TKjvv','Melissa Nataly','923456123');


--DISCIPLINA
INSERT INTO disciplinas(nombre,descripcion,imagen) VALUES ('joga','estiramientos de musculos para una salud mejorada y desestresada', '74542565');
INSERT INTO disciplinas(nombre,descripcion,imagen) VALUES ('calistenia','estrenamiento de brazos para la salud mejorada y desestresada', '56892565');

--SALON
INSERT INTO salon(capacidad,descripcion) VALUES (20,'primer piso');
INSERT INTO salon(capacidad,descripcion) VALUES (15,'segundo piso');
INSERT INTO salon(capacidad,descripcion) VALUES (14,'tercer piso');
INSERT INTO salon(capacidad,descripcion) VALUES (10,'cuarto piso');
