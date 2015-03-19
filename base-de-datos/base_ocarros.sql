#  Creado con Kata Kuntur - Modelador de Datos
#  Versión: 2.5.2
#  Sitio Web: http://katakuntur.jeanmazuelos.com/
#  Si usted encuentra algún error le agradeceriamos lo reporte en:
#  http://pm.jeanmazuelos.com/katakuntur/issues/new

#  Administrador de Base de Datos: MySQL/MariaDB
#  Diagrama: ocarros
#  Autor: Jefferson
#  Fecha y hora: 19/03/2015 14:06:17

# GENERANDO TABLAS
CREATE TABLE `historia_clinica` (
	`fecha` DATE NOT NULL,
	`tipo_ingreso` VARCHAR(50) NOT NULL,
	`genero` VARCHAR(50) NOT NULL,
	`edb` VARCHAR(25) NOT NULL,
	`especie` VARCHAR(50) NOT NULL,
	`nombre_comun` VARCHAR(50) NOT NULL,
	`sexo` VARCHAR(20) NOT NULL,
	`identificacion` VARCHAR(25) NOT NULL,
	`medicos_veterinarios_id/mp` INTEGER NOT NULL,
	KEY(`medicos_veterinarios_id/mp`),
	PRIMARY KEY(`identificacion`)
) ENGINE=INNODB;
CREATE TABLE `anamnesicos` (
	`lugar_extraccion` VARCHAR(250) NOT NULL,
	`procedencia` VARCHAR(250) NOT NULL,
	`tiempo_cautiverio` VARCHAR(250) NOT NULL,
	`t_ambiental` VARCHAR(250) NOT NULL,
	`humedad` VARCHAR(250) NOT NULL,
	`especie_contacto` VARCHAR(250) NOT NULL,
	`enfermedad_animales_cercanos` VARCHAR(250) NOT NULL,
	`carac_cautiverio` VARCHAR(250) NOT NULL,
	`tipo_transporte` VARCHAR(250) NOT NULL,
	`tiempo_transporte` VARCHAR(250) NOT NULL,
	`dieta_suministrada` VARCHAR(250) NOT NULL,
	`frecuencia` VARCHAR(250) NOT NULL,
	`consumo` VARCHAR(250) NOT NULL,
	`signos_duracion` VARCHAR(250) NOT NULL,
	`tratamiento_previo_respuesta` VARCHAR(250) NOT NULL,
	`historia_clinica_identificacion` VARCHAR(25) NOT NULL,
	KEY(`historia_clinica_identificacion`)
) ENGINE=INNODB;
CREATE TABLE `examen_clinico` (
	`t` VARCHAR(10) NOT NULL,
	`fc` VARCHAR(10) NOT NULL,
	`fr` VARCHAR(10) NOT NULL,
	`mm` VARCHAR(10) NOT NULL,
	`tllc` VARCHAR(10) NOT NULL,
	`temperamento` VARCHAR(10) NOT NULL,
	`actitud` VARCHAR(10) NOT NULL,
	`peso` VARCHAR(10) NOT NULL,
	`cc` VARCHAR(10) NOT NULL,
	`historia_clinica_identificacion` VARCHAR(25) NOT NULL,
	KEY(`historia_clinica_identificacion`)
) ENGINE=INNODB;
CREATE TABLE `general` (
	`estado_general` VARCHAR(30) NOT NULL,
	`hidratacion` VARCHAR(30) NOT NULL,
	`tegumento` VARCHAR(30) NOT NULL,
	`cardiovascular` VARCHAR(30) NOT NULL,
	`respiratorio` VARCHAR(30) NOT NULL,
	`digestivo` VARCHAR(30) NOT NULL,
	`nervioso` VARCHAR(30) NOT NULL,
	`musculo_esqueletico` VARCHAR(30) NOT NULL,
	`urinario` VARCHAR(30) NOT NULL,
	`reproductivo` VARCHAR(30) NOT NULL,
	`linfoide` VARCHAR(30) NOT NULL,
	`organos_sentidos` VARCHAR(30) NOT NULL,
	`otros` VARCHAR(30) NOT NULL,
	`historia_clinica_identificacion` VARCHAR(25) NOT NULL,
	KEY(`historia_clinica_identificacion`)
) ENGINE=INNODB;
CREATE TABLE `ENTIDAD_5` (
	`esi` VARCHAR(4) NOT NULL,
	`pcp` VARCHAR(1) NOT NULL,
	`plp` VARCHAR(1) NOT NULL,
	`hospitalizado` VARCHAR(1) NOT NULL,
	`pronostico` VARCHAR(50) NOT NULL,
	`cuarentena` VARCHAR(1) NOT NULL,
	`tiempo_cuarentena` VARCHAR(20) NOT NULL,
	`historia_clinica_identificacion` VARCHAR(25) NOT NULL,
	KEY(`historia_clinica_identificacion`)
) ENGINE=INNODB;
CREATE TABLE `movimiento_animal` (
	`fecha` DATE NOT NULL,
	`exhibicion` VARCHAR(200) NOT NULL,
	`historia_clinica_identificacion` VARCHAR(25) NOT NULL,
	KEY(`historia_clinica_identificacion`)
) ENGINE=INNODB;
CREATE TABLE `medicos_veterinarios` (
	`nombre` VARCHAR(50) NOT NULL,
	`id/mp` INTEGER NOT NULL,
	PRIMARY KEY(`id/mp`)
) ENGINE=INNODB;
CREATE TABLE `diagnosticos` (
	`hallazgos_anormales` VARCHAR(500) NOT NULL,
	`diagnosticos_diferenciales` VARCHAR(500) NOT NULL,
	`planes_diagnosticos` VARCHAR(500) NOT NULL,
	`planes_terapeuticos` VARCHAR(500) NOT NULL,
	`otros_planes` VARCHAR(500) NOT NULL,
	`historia_clinica_identificacion` VARCHAR(25) NOT NULL,
	KEY(`historia_clinica_identificacion`)
) ENGINE=INNODB;
CREATE TABLE `marcaje` (
	`marcaje` VARCHAR(50) NOT NULL,
	`historia_clinica_identificacion` VARCHAR(25) NOT NULL,
	KEY(`historia_clinica_identificacion`),
	`tipo_marcaje_id_tipo_marcaje` INTEGER NOT NULL,
	KEY(`tipo_marcaje_id_tipo_marcaje`)
) ENGINE=INNODB;
CREATE TABLE `tipo_marcaje` (
	`id_tipo_marcaje` INTEGER NOT NULL,
	`nombre` VARCHAR(50) NOT NULL,
	PRIMARY KEY(`id_tipo_marcaje`)
) ENGINE=INNODB;
CREATE TABLE `terapeutica_evolucion` (
	`fecha` DATE NOT NULL,
	`evolucion` VARCHAR(2000) NOT NULL,
	`historia_clinica_identificacion` VARCHAR(25) NOT NULL,
	KEY(`historia_clinica_identificacion`)
) ENGINE=INNODB;
CREATE TABLE `examenes_solicitados` (
	`biometria_hematica` VARCHAR(10) NOT NULL,
	`perfil_hepatico` VARCHAR(10) NOT NULL,
	`perfil_renal` VARCHAR(10) NOT NULL,
	`hormonas` VARCHAR(10) NOT NULL,
	`coprologico` VARCHAR(10) NOT NULL,
	`coprocultivo` VARCHAR(10) NOT NULL,
	`hemoparasitos` VARCHAR(10) NOT NULL,
	`rx` VARCHAR(10) NOT NULL,
	`ecografia` VARCHAR(10) NOT NULL,
	`fecha` DATE NOT NULL,
	`historia_clinica_identificacion` VARCHAR(25) NOT NULL,
	KEY(`historia_clinica_identificacion`)
) ENGINE=INNODB;
CREATE TABLE `valoracion_nutricional` (
	`fecha` DATE NOT NULL,
	`peso_actual` VARCHAR(30) NOT NULL,
	`condicion_corporal` VARCHAR(30) NOT NULL,
	`estres` VARCHAR(30) NOT NULL,
	`polidipsia` VARCHAR(30) NOT NULL,
	`poliuria` VARCHAR(30) NOT NULL,
	`polifagia` VARCHAR(30) NOT NULL,
	`depravacion_gusto` VARCHAR(30) NOT NULL,
	`anorexia` VARCHAR(30) NOT NULL,
	`anorexia_selectiva` VARCHAR(30) NOT NULL,
	`inapetencia` VARCHAR(30) NOT NULL,
	`prehension_y_masticacion` VARCHAR(30) NOT NULL,
	`deglucion` VARCHAR(30) NOT NULL,
	`rumia` VARCHAR(30) NOT NULL,
	`emesis` VARCHAR(30) NOT NULL,
	`duracion` VARCHAR(30) NOT NULL,
	`regurgitacion` VARCHAR(30) NOT NULL,
	`heces` VARCHAR(30) NOT NULL,
	`diarrea` VARCHAR(30) NOT NULL,
	`dolor_abdominal` VARCHAR(30) NOT NULL,
	`hematemesis` VARCHAR(30) NOT NULL,
	`melena` VARCHAR(30) NOT NULL,
	`otros` VARCHAR(30) NOT NULL,
	`problemas_medicos_actuales` VARCHAR(30) NOT NULL,
	`tratamientos_medicos_actuales` VARCHAR(200) NOT NULL,
	`apetito_habitual` VARCHAR(200) NOT NULL,
	`apetito_actual` VARCHAR(200) NOT NULL,
	`dieta_ingredientes` VARCHAR(200) NOT NULL,
	`dieta_aceptacion_alimentos` VARCHAR(200) NOT NULL,
	`dieta_suplementacion` VARCHAR(200) NOT NULL,
	`historia_clinica_identificacion` VARCHAR(25) NOT NULL,
	KEY(`historia_clinica_identificacion`)
) ENGINE=INNODB;

# GENERANDO RELACIONES
ALTER TABLE `historia_clinica` ADD CONSTRAINT `historia_clinica_medicos_veterinarios_medicos_veterinarios_id/1` FOREIGN KEY (`medicos_veterinarios_id/mp`) REFERENCES `medicos_veterinarios`(`id/mp`) ON DELETE NO ACTION ON UPDATE CASCADE;
ALTER TABLE `anamnesicos` ADD CONSTRAINT `anamnesicos_historia_clinica_historia_clinica_identificacion` FOREIGN KEY (`historia_clinica_identificacion`) REFERENCES `historia_clinica`(`identificacion`) ON DELETE NO ACTION ON UPDATE CASCADE;
ALTER TABLE `examen_clinico` ADD CONSTRAINT `examen_clinico_historia_clinica_historia_clinica_identificacion` FOREIGN KEY (`historia_clinica_identificacion`) REFERENCES `historia_clinica`(`identificacion`) ON DELETE NO ACTION ON UPDATE CASCADE;
ALTER TABLE `general` ADD CONSTRAINT `general_historia_clinica_historia_clinica_identificacion` FOREIGN KEY (`historia_clinica_identificacion`) REFERENCES `historia_clinica`(`identificacion`) ON DELETE NO ACTION ON UPDATE CASCADE;
ALTER TABLE `ENTIDAD_5` ADD CONSTRAINT `entidad_5_historia_clinica_historia_clinica_identificacion` FOREIGN KEY (`historia_clinica_identificacion`) REFERENCES `historia_clinica`(`identificacion`) ON DELETE NO ACTION ON UPDATE CASCADE;
ALTER TABLE `movimiento_animal` ADD CONSTRAINT `movimiento_animal_historia_clinica_historia_clinica_identifica6` FOREIGN KEY (`historia_clinica_identificacion`) REFERENCES `historia_clinica`(`identificacion`) ON DELETE NO ACTION ON UPDATE CASCADE;
ALTER TABLE `diagnosticos` ADD CONSTRAINT `diagnosticos_historia_clinica_historia_clinica_identificacion` FOREIGN KEY (`historia_clinica_identificacion`) REFERENCES `historia_clinica`(`identificacion`) ON DELETE NO ACTION ON UPDATE CASCADE;
ALTER TABLE `marcaje` ADD CONSTRAINT `marcaje_historia_clinica_historia_clinica_identificacion` FOREIGN KEY (`historia_clinica_identificacion`) REFERENCES `historia_clinica`(`identificacion`) ON DELETE NO ACTION ON UPDATE CASCADE;
ALTER TABLE `marcaje` ADD CONSTRAINT `marcaje_tipo_marcaje_tipo_marcaje_id_tipo_marcaje` FOREIGN KEY (`tipo_marcaje_id_tipo_marcaje`) REFERENCES `tipo_marcaje`(`id_tipo_marcaje`) ON DELETE NO ACTION ON UPDATE CASCADE;
ALTER TABLE `terapeutica_evolucion` ADD CONSTRAINT `terapeutica_evolucion_historia_clinica_historia_clinica_ident10` FOREIGN KEY (`historia_clinica_identificacion`) REFERENCES `historia_clinica`(`identificacion`) ON DELETE NO ACTION ON UPDATE CASCADE;
ALTER TABLE `examenes_solicitados` ADD CONSTRAINT `examenes_solicitados_historia_clinica_historia_clinica_identi11` FOREIGN KEY (`historia_clinica_identificacion`) REFERENCES `historia_clinica`(`identificacion`) ON DELETE NO ACTION ON UPDATE CASCADE;
ALTER TABLE `valoracion_nutricional` ADD CONSTRAINT `valoracion_nutricional_historia_clinica_historia_clinica_iden12` FOREIGN KEY (`historia_clinica_identificacion`) REFERENCES `historia_clinica`(`identificacion`) ON DELETE NO ACTION ON UPDATE CASCADE;
