-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-02-2015 a las 02:55:50
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `historias_clinicas_los_ocarros`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `anestesia`
--

CREATE TABLE IF NOT EXISTS `anestesia` (
  `id_anestesia` int(11) NOT NULL,
  `dosis` double DEFAULT NULL,
  `dosis_total` double DEFAULT NULL,
  `hora` varchar(30) DEFAULT NULL,
  `registro_id_registro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `constantes_fisiologicas`
--

CREATE TABLE IF NOT EXISTS `constantes_fisiologicas` (
  `id_constantes_fisiologicas` int(11) NOT NULL,
  `fc` varchar(50) NOT NULL,
  `fr` varchar(50) NOT NULL,
  `t` varchar(50) NOT NULL,
  `pulso` varchar(50) NOT NULL,
  `tllc` varchar(50) NOT NULL,
  `peso` varchar(50) NOT NULL,
  `registro_id_registro` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `constantes_fisiologicas`
--

INSERT INTO `constantes_fisiologicas` (`id_constantes_fisiologicas`, `fc`, `fr`, `t`, `pulso`, `tllc`, `peso`, `registro_id_registro`) VALUES
(1, 'fc', 'fr', 't', 'pulso', 'tllc', 'peso', 7),
(2, 'fc', 'fr', 't', 'pulso', 'tllc', 'peso', 7),
(3, 'fc2', 'fr2', 't2', 'pulso2', 'tllc2', 'peso2', 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuadro_hematico`
--

CREATE TABLE IF NOT EXISTS `cuadro_hematico` (
  `id_cuadro_hematico` int(11) NOT NULL,
  `fecha_resultado` date DEFAULT NULL,
  `hemo_parasitos` varchar(3) DEFAULT NULL,
  `eritrositos` double DEFAULT NULL,
  `hcg` double DEFAULT NULL,
  `htc` double DEFAULT NULL,
  `vcm` double DEFAULT NULL,
  `plq` double DEFAULT NULL,
  `leuco` double DEFAULT NULL,
  `neutrofilos` double DEFAULT NULL,
  `lifoncitos` double DEFAULT NULL,
  `esosin` double DEFAULT NULL,
  `monoc` double DEFAULT NULL,
  `basof` double DEFAULT NULL,
  `bandas` double DEFAULT NULL,
  `registro_id_registro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `diagnostico`
--

CREATE TABLE IF NOT EXISTS `diagnostico` (
  `id_diagnostico` int(11) NOT NULL,
  `observacion_clinicas` varchar(200) NOT NULL,
  `diagnostico_presuntivo` varchar(200) NOT NULL,
  `diagnostico_diferencial` varchar(200) NOT NULL,
  `pronostico` varchar(200) NOT NULL,
  `registro_id_registro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `diagnostico`
--

INSERT INTO `diagnostico` (`id_diagnostico`, `observacion_clinicas`, `diagnostico_presuntivo`, `diagnostico_diferencial`, `pronostico`, `registro_id_registro`) VALUES
(1, 'observaciones', 'presuntivo', 'diferencial', 'pronostico', 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entidad_1_reptiles_cuelonios`
--

CREATE TABLE IF NOT EXISTS `entidad_1_reptiles_cuelonios` (
  `estado_general` varchar(50) NOT NULL,
  `cabeza` varchar(50) NOT NULL,
  `pico` varchar(50) NOT NULL,
  `plastron_o_peto` varchar(50) NOT NULL,
  `caparax_o_caparazon` varchar(50) NOT NULL,
  `sistema_muscular` varchar(50) NOT NULL,
  `sistema_oseo` varchar(50) NOT NULL,
  `organos_de_sentidos` varchar(50) NOT NULL,
  `sistema_urogenital` varchar(50) NOT NULL,
  `sistema_cardiopulmonar` varchar(50) NOT NULL,
  `hidratacion` varchar(50) NOT NULL,
  `registro_id_registro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `entidad_1_reptiles_cuelonios`
--

INSERT INTO `entidad_1_reptiles_cuelonios` (`estado_general`, `cabeza`, `pico`, `plastron_o_peto`, `caparax_o_caparazon`, `sistema_muscular`, `sistema_oseo`, `organos_de_sentidos`, `sistema_urogenital`, `sistema_cardiopulmonar`, `hidratacion`, `registro_id_registro`) VALUES
('N', 'AN', 'NE', 'N', 'AN', 'NE', 'N', 'AN', 'NE', 'N', 'AN', 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entidad_8_aves_mamiferos`
--

CREATE TABLE IF NOT EXISTS `entidad_8_aves_mamiferos` (
  `estado_general` varchar(200) NOT NULL,
  `tegumento` varchar(50) NOT NULL,
  `mucosas` varchar(50) NOT NULL,
  `tracto_gastrointestinal` varchar(50) NOT NULL,
  `sistema_lifantico` varchar(50) NOT NULL,
  `sistema_cardiopulmonar` varchar(50) NOT NULL,
  `sistema_muscular` varchar(50) NOT NULL,
  `sistema_oseo` varchar(50) NOT NULL,
  `sistema_urogenital` varchar(50) NOT NULL,
  `organos_de_sentidos` varchar(50) NOT NULL,
  `sistema_nervioso` varchar(50) NOT NULL,
  `comportamiento` varchar(50) NOT NULL,
  `hidratacion` varchar(50) NOT NULL,
  `registro_id_registro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `entidad_8_aves_mamiferos`
--

INSERT INTO `entidad_8_aves_mamiferos` (`estado_general`, `tegumento`, `mucosas`, `tracto_gastrointestinal`, `sistema_lifantico`, `sistema_cardiopulmonar`, `sistema_muscular`, `sistema_oseo`, `sistema_urogenital`, `organos_de_sentidos`, `sistema_nervioso`, `comportamiento`, `hidratacion`, `registro_id_registro`) VALUES
('N', 'AN', 'NE', 'AN', 'N', 'AN', 'NE', 'AN', 'N', 'AN', 'NE', 'AN', 'N', 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entidad_13_reptiles_crocodylus`
--

CREATE TABLE IF NOT EXISTS `entidad_13_reptiles_crocodylus` (
  `estado_general` varchar(200) NOT NULL,
  `cabeza` varchar(50) NOT NULL,
  `maxilares` varchar(50) NOT NULL,
  `boca` varchar(50) NOT NULL,
  `cuello` varchar(50) NOT NULL,
  `region_dorsal` varchar(50) NOT NULL,
  `region_caudal` varchar(50) NOT NULL,
  `sistema_muscular` varchar(50) NOT NULL,
  `sistema_oseo` varchar(50) NOT NULL,
  `organos_de_sentidos` varchar(50) NOT NULL,
  `sistema_urogenital` varchar(50) NOT NULL,
  `sistema_cardiopulmonar` varchar(50) NOT NULL,
  `hidratacion` varchar(50) NOT NULL,
  `registro_id_registro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `entidad_13_reptiles_crocodylus`
--

INSERT INTO `entidad_13_reptiles_crocodylus` (`estado_general`, `cabeza`, `maxilares`, `boca`, `cuello`, `region_dorsal`, `region_caudal`, `sistema_muscular`, `sistema_oseo`, `organos_de_sentidos`, `sistema_urogenital`, `sistema_cardiopulmonar`, `hidratacion`, `registro_id_registro`) VALUES
('N', 'AN', 'NE', 'AN', 'N', 'AN', 'NE', 'AN', 'N', 'AN', 'NE', 'AN', 'N', 7),
('N', 'AN', 'NE', 'AN', 'N', 'AN', 'NE', 'AN', 'AN', 'AN', 'N', 'AN', 'NE', 7),
('NE', 'NE', 'NE', 'NE', 'NE', 'NE', 'NE', 'NE', 'NE', 'NE', 'NE', 'NE', 'NE', 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `examen`
--

CREATE TABLE IF NOT EXISTS `examen` (
  `id_examen` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `examen`
--

INSERT INTO `examen` (`id_examen`, `nombre`) VALUES
(1, 'Biometria Hepatica'),
(2, 'Rx-Ecografia'),
(3, 'Perfil Hepatico'),
(4, 'Ecografia'),
(5, 'Perfil Renal');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `examen_medico`
--

CREATE TABLE IF NOT EXISTS `examen_medico` (
  `id_examen_medico` int(11) NOT NULL,
  `precio_total` double DEFAULT NULL,
  `imagen` longblob,
  `observaciones` text,
  `registro_id_registro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `examen_solicitado`
--

CREATE TABLE IF NOT EXISTS `examen_solicitado` (
  `id_examen_solicitado` int(11) NOT NULL,
  `nombre_examen` varchar(50) NOT NULL,
  `registro_id_registro` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `examen_solicitado2`
--

CREATE TABLE IF NOT EXISTS `examen_solicitado2` (
  `id_examen` int(11) NOT NULL,
  `id_registro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `examen_solicitado2`
--

INSERT INTO `examen_solicitado2` (`id_examen`, `id_registro`) VALUES
(1, 6),
(2, 6),
(3, 6),
(4, 6),
(1, 7),
(2, 7),
(3, 7),
(5, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historia_clinica`
--

CREATE TABLE IF NOT EXISTS `historia_clinica` (
  `fecha_ingreso` date NOT NULL,
  `ficha_ingreso` varchar(40) NOT NULL,
  `especie` varchar(100) NOT NULL,
  `historia_clinica` varchar(20) NOT NULL,
  `fecha_historia_clinica` date NOT NULL,
  `nit_chip` varchar(50) NOT NULL,
  `recinto_n_ctna` varchar(50) NOT NULL,
  `recinto_n_exh` varchar(50) NOT NULL,
  `nombre_comun` varchar(70) NOT NULL,
  `sexo` varchar(15) NOT NULL,
  `edb` varchar(50) NOT NULL,
  `edad_aprox` date NOT NULL,
  `antecedentes` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `historia_clinica`
--

INSERT INTO `historia_clinica` (`fecha_ingreso`, `ficha_ingreso`, `especie`, `historia_clinica`, `fecha_historia_clinica`, `nit_chip`, `recinto_n_ctna`, `recinto_n_exh`, `nombre_comun`, `sexo`, `edb`, `edad_aprox`, `antecedentes`) VALUES
('2015-02-01', '', 'Anfibios', '', '2015-02-02', '', '', '', '', 'Macho', 'N', '2015-02-03', 'antecedentes'),
('2015-02-01', '', 'Anfibios', 'historiaCLinica', '2015-02-02', 'nitchip', 'ctna', 'exh', 'nombnre comun', 'Macho', 'N', '2015-02-03', 'antecedentes'),
('2015-02-01', 'fecha ingreso', 'Anfibios', 'historiaCLinica2', '2015-02-02', 'nitchip', 'ctna', 'exh', 'nombnre comun', 'Macho', 'N', '2015-02-03', 'antecedentes');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marcaje`
--

CREATE TABLE IF NOT EXISTS `marcaje` (
  `marcaje` varchar(50) DEFAULT NULL,
  `tipo_marcaje_id_tipo_marcaje` int(11) NOT NULL,
  `historia_clinica_historia_clinica` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicamento`
--

CREATE TABLE IF NOT EXISTS `medicamento` (
  `id_medicamento` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `medicamento` varchar(100) DEFAULT NULL,
  `dosis` varchar(150) DEFAULT NULL,
  `dosis_total` double DEFAULT NULL,
  `unidad` varchar(100) DEFAULT NULL,
  `via_admin` varchar(20) DEFAULT NULL,
  `dias_aplicacion` varchar(50) DEFAULT NULL,
  `precio_total` double DEFAULT NULL,
  `registro_id_registro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `origen`
--

CREATE TABLE IF NOT EXISTS `origen` (
  `id_origen` int(11) NOT NULL,
  `tipo_origen` varchar(50) NOT NULL,
  `historia_clinica_historia_clinica` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE IF NOT EXISTS `registro` (
  `id_registro` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `responsable` varchar(50) DEFAULT NULL,
  `clinico` varchar(50) DEFAULT NULL,
  `historia_clinica_historia_clinica` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `registro`
--

INSERT INTO `registro` (`id_registro`, `fecha`, `responsable`, `clinico`, `historia_clinica_historia_clinica`) VALUES
(1, '2015-02-05', 'responsable1', 'clinico1', 'historiaCLinica'),
(2, '2015-02-06', 'responsable2', 'clinico2', 'historiaCLinica2'),
(3, '2015-02-05', '', '', 'historiaCLinica2'),
(4, '2015-02-04', '', '', 'historiaCLinica2'),
(5, '2015-02-05', '', '', 'historiaCLinica2'),
(6, '2015-02-06', 'responsavble', 'clinico', 'historiaCLinica'),
(7, '2015-02-06', 'sf', 'asd', 'historiaCLinica2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_marcaje`
--

CREATE TABLE IF NOT EXISTS `tipo_marcaje` (
  `id_tipo_marcaje` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `anestesia`
--
ALTER TABLE `anestesia`
 ADD PRIMARY KEY (`id_anestesia`), ADD KEY `registro_id_registro` (`registro_id_registro`);

--
-- Indices de la tabla `constantes_fisiologicas`
--
ALTER TABLE `constantes_fisiologicas`
 ADD PRIMARY KEY (`id_constantes_fisiologicas`), ADD KEY `registro_id_registro` (`registro_id_registro`);

--
-- Indices de la tabla `cuadro_hematico`
--
ALTER TABLE `cuadro_hematico`
 ADD PRIMARY KEY (`id_cuadro_hematico`), ADD KEY `registro_id_registro` (`registro_id_registro`);

--
-- Indices de la tabla `diagnostico`
--
ALTER TABLE `diagnostico`
 ADD PRIMARY KEY (`id_diagnostico`), ADD KEY `registro_id_registro` (`registro_id_registro`);

--
-- Indices de la tabla `entidad_1_reptiles_cuelonios`
--
ALTER TABLE `entidad_1_reptiles_cuelonios`
 ADD KEY `registro_id_registro` (`registro_id_registro`);

--
-- Indices de la tabla `entidad_8_aves_mamiferos`
--
ALTER TABLE `entidad_8_aves_mamiferos`
 ADD KEY `registro_id_registro` (`registro_id_registro`);

--
-- Indices de la tabla `entidad_13_reptiles_crocodylus`
--
ALTER TABLE `entidad_13_reptiles_crocodylus`
 ADD KEY `registro_id_registro` (`registro_id_registro`);

--
-- Indices de la tabla `examen`
--
ALTER TABLE `examen`
 ADD PRIMARY KEY (`id_examen`);

--
-- Indices de la tabla `examen_medico`
--
ALTER TABLE `examen_medico`
 ADD PRIMARY KEY (`id_examen_medico`), ADD KEY `registro_id_registro` (`registro_id_registro`);

--
-- Indices de la tabla `examen_solicitado`
--
ALTER TABLE `examen_solicitado`
 ADD PRIMARY KEY (`id_examen_solicitado`), ADD KEY `registro_id_registro` (`registro_id_registro`);

--
-- Indices de la tabla `examen_solicitado2`
--
ALTER TABLE `examen_solicitado2`
 ADD PRIMARY KEY (`id_examen`,`id_registro`), ADD KEY `id_registro` (`id_registro`);

--
-- Indices de la tabla `historia_clinica`
--
ALTER TABLE `historia_clinica`
 ADD PRIMARY KEY (`historia_clinica`);

--
-- Indices de la tabla `marcaje`
--
ALTER TABLE `marcaje`
 ADD KEY `tipo_marcaje_id_tipo_marcaje` (`tipo_marcaje_id_tipo_marcaje`), ADD KEY `historia_clinica_historia_clinica` (`historia_clinica_historia_clinica`);

--
-- Indices de la tabla `medicamento`
--
ALTER TABLE `medicamento`
 ADD PRIMARY KEY (`id_medicamento`), ADD KEY `registro_id_registro` (`registro_id_registro`);

--
-- Indices de la tabla `origen`
--
ALTER TABLE `origen`
 ADD PRIMARY KEY (`id_origen`), ADD KEY `historia_clinica_historia_clinica` (`historia_clinica_historia_clinica`);

--
-- Indices de la tabla `registro`
--
ALTER TABLE `registro`
 ADD PRIMARY KEY (`id_registro`), ADD KEY `historia_clinica_historia_clinica` (`historia_clinica_historia_clinica`);

--
-- Indices de la tabla `tipo_marcaje`
--
ALTER TABLE `tipo_marcaje`
 ADD PRIMARY KEY (`id_tipo_marcaje`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `anestesia`
--
ALTER TABLE `anestesia`
ADD CONSTRAINT `anestesia_registro_registro_id_registro` FOREIGN KEY (`registro_id_registro`) REFERENCES `registro` (`id_registro`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `constantes_fisiologicas`
--
ALTER TABLE `constantes_fisiologicas`
ADD CONSTRAINT `constantes_fisiologicas_registro_registro_id_registro` FOREIGN KEY (`registro_id_registro`) REFERENCES `registro` (`id_registro`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `cuadro_hematico`
--
ALTER TABLE `cuadro_hematico`
ADD CONSTRAINT `cuadro_hematico_registro_registro_id_registro` FOREIGN KEY (`registro_id_registro`) REFERENCES `registro` (`id_registro`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `diagnostico`
--
ALTER TABLE `diagnostico`
ADD CONSTRAINT `diagnosticos_registro_registro_id_registro` FOREIGN KEY (`registro_id_registro`) REFERENCES `registro` (`id_registro`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `entidad_1_reptiles_cuelonios`
--
ALTER TABLE `entidad_1_reptiles_cuelonios`
ADD CONSTRAINT `entidad_1_reptiles_cuelonios_registro_registro_id_registro` FOREIGN KEY (`registro_id_registro`) REFERENCES `registro` (`id_registro`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `entidad_8_aves_mamiferos`
--
ALTER TABLE `entidad_8_aves_mamiferos`
ADD CONSTRAINT `entidad_8_aves_mamiferos_registro_registro_id_registro` FOREIGN KEY (`registro_id_registro`) REFERENCES `registro` (`id_registro`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `entidad_13_reptiles_crocodylus`
--
ALTER TABLE `entidad_13_reptiles_crocodylus`
ADD CONSTRAINT `entidad_13_reptiles_crocodylus_registro_registro_id_registro` FOREIGN KEY (`registro_id_registro`) REFERENCES `registro` (`id_registro`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `examen_medico`
--
ALTER TABLE `examen_medico`
ADD CONSTRAINT `examen_medico_registro_registro_id_registro` FOREIGN KEY (`registro_id_registro`) REFERENCES `registro` (`id_registro`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `examen_solicitado`
--
ALTER TABLE `examen_solicitado`
ADD CONSTRAINT `examenes_solicitados_registro_registro_id_registro` FOREIGN KEY (`registro_id_registro`) REFERENCES `registro` (`id_registro`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `examen_solicitado2`
--
ALTER TABLE `examen_solicitado2`
ADD CONSTRAINT `examen_solicitado2_ibfk_1` FOREIGN KEY (`id_examen`) REFERENCES `examen` (`id_examen`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `examen_solicitado2_ibfk_2` FOREIGN KEY (`id_registro`) REFERENCES `registro` (`id_registro`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `marcaje`
--
ALTER TABLE `marcaje`
ADD CONSTRAINT `marcaje_historia_clinica_historia_clinica_historia_clinica` FOREIGN KEY (`historia_clinica_historia_clinica`) REFERENCES `historia_clinica` (`historia_clinica`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `marcaje_tipo_marcaje_tipo_marcaje_id_tipo_marcaje` FOREIGN KEY (`tipo_marcaje_id_tipo_marcaje`) REFERENCES `tipo_marcaje` (`id_tipo_marcaje`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `medicamento`
--
ALTER TABLE `medicamento`
ADD CONSTRAINT `medicamento_registro_registro_id_registro` FOREIGN KEY (`registro_id_registro`) REFERENCES `registro` (`id_registro`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `origen`
--
ALTER TABLE `origen`
ADD CONSTRAINT `origen_historia_clinica_historia_clinica_historia_clinica` FOREIGN KEY (`historia_clinica_historia_clinica`) REFERENCES `historia_clinica` (`historia_clinica`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `registro`
--
ALTER TABLE `registro`
ADD CONSTRAINT `registro_historia_clinica_historia_clinica_historia_clinica` FOREIGN KEY (`historia_clinica_historia_clinica`) REFERENCES `historia_clinica` (`historia_clinica`) ON DELETE NO ACTION ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
