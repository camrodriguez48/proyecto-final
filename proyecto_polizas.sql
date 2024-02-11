-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-02-2024 a las 23:15:32
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto_polizas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asegurados`
--

CREATE TABLE `asegurados` (
  `NumAsegurados` int(11) NOT NULL,
  `NomAseg` varchar(20) NOT NULL,
  `FechaNac` varchar(10) NOT NULL,
  `Categoria` varchar(20) NOT NULL,
  `Hospital` varchar(20) NOT NULL,
  `Estado` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `asegurados`
--

INSERT INTO `asegurados` (`NumAsegurados`, `NomAseg`, `FechaNac`, `Categoria`, `Hospital`, `Estado`) VALUES
(1, 'null', '21/02/1997', 'Categoria A', 'La Misericordia', 'Activo'),
(2, 'null', '10/02/1994', 'Categoria A', 'La Misericordia', 'Activo'),
(3, 'Luis Rodrigo', '10/02/1994', 'Categoria C', 'San Rafael', 'null'),
(4, 'CAMILO', '21/8/22', 'Categoria B', 'Santa Clara', 'Inactivo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asegurados`
--
ALTER TABLE `asegurados`
  ADD PRIMARY KEY (`NumAsegurados`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asegurados`
--
ALTER TABLE `asegurados`
  MODIFY `NumAsegurados` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
