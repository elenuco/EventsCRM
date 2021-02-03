-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-02-2021 a las 07:07:35
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `events_crm`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eventos`
--

CREATE TABLE `eventos` (
  `Id_Eventos` int(11) NOT NULL,
  `Eventos_Tipo_Id` int(11) NOT NULL,
  `Eventos_Fecha` date NOT NULL,
  `Eventos_Cantidad_Asistentes` int(11) NOT NULL,
  `Eventos_Menu_Id` int(11) NOT NULL,
  `Eventos_Local_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `local`
--

CREATE TABLE `local` (
  `Id_Local` int(11) NOT NULL,
  `Local_Nombre` varchar(50) NOT NULL,
  `Local_Sillas` int(11) NOT NULL,
  `Local_Mesas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menu_evento`
--

CREATE TABLE `menu_evento` (
  `Id_Menu` int(11) NOT NULL,
  `Menu_Evento_Nombre` varchar(50) DEFAULT NULL,
  `Menu_Evento_Descripción` text DEFAULT NULL,
  `Menu_Evento_Precio` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `oportunidad`
--

CREATE TABLE `oportunidad` (
  `Id_Oportunidad` int(11) NOT NULL,
  `Oportunidad` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_clientes`
--

CREATE TABLE `registro_clientes` (
  `Id_Cliente` int(11) NOT NULL,
  `Cliente_Nombre` varchar(50) DEFAULT NULL,
  `Cliente_Apellido` varchar(50) DEFAULT NULL,
  `Cliente_Telefono` varchar(50) DEFAULT NULL,
  `Cliente_Correo` varchar(50) DEFAULT NULL,
  `Cliente_Descripción_Rregistro` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_evento`
--

CREATE TABLE `tipo_evento` (
  `Id_Evento` int(11) NOT NULL,
  `Evento_Evento` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedores`
--

CREATE TABLE `vendedores` (
  `id_Vendedor` int(11) NOT NULL,
  `Vendedor_Nombre` varchar(50) DEFAULT NULL,
  `Vendedor_Apellido` varchar(50) DEFAULT NULL,
  `Vendedor_comision` float DEFAULT NULL,
  `Vendedor_Sucursal_id` int(11) DEFAULT NULL,
  `Fecha_De_Contrato` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `Id_Venta` int(11) NOT NULL,
  `Venta_Oporunidad_Id` int(11) NOT NULL,
  `Venta_Evento_Id` int(11) NOT NULL,
  `Venta_Vendedor_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta_cliente`
--

CREATE TABLE `venta_cliente` (
  `Id_Venta_Cliente` int(11) NOT NULL,
  `Venta_Id` int(11) NOT NULL,
  `Venta_Resgistro_Id` int(11) NOT NULL,
  `Venta_Costo_Total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `eventos`
--
ALTER TABLE `eventos`
  ADD PRIMARY KEY (`Id_Eventos`),
  ADD KEY `Eventos_Tipo_Id` (`Eventos_Tipo_Id`,`Eventos_Menu_Id`,`Eventos_Local_Id`),
  ADD KEY `Eventos_Menu_Id` (`Eventos_Menu_Id`),
  ADD KEY `Eventos_Local_Id` (`Eventos_Local_Id`);

--
-- Indices de la tabla `local`
--
ALTER TABLE `local`
  ADD PRIMARY KEY (`Id_Local`);

--
-- Indices de la tabla `menu_evento`
--
ALTER TABLE `menu_evento`
  ADD PRIMARY KEY (`Id_Menu`);

--
-- Indices de la tabla `oportunidad`
--
ALTER TABLE `oportunidad`
  ADD PRIMARY KEY (`Id_Oportunidad`);

--
-- Indices de la tabla `registro_clientes`
--
ALTER TABLE `registro_clientes`
  ADD PRIMARY KEY (`Id_Cliente`);

--
-- Indices de la tabla `tipo_evento`
--
ALTER TABLE `tipo_evento`
  ADD PRIMARY KEY (`Id_Evento`);

--
-- Indices de la tabla `vendedores`
--
ALTER TABLE `vendedores`
  ADD PRIMARY KEY (`id_Vendedor`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`Id_Venta`),
  ADD KEY `Venta_Oporunidad_Id` (`Venta_Oporunidad_Id`,`Venta_Evento_Id`,`Venta_Vendedor_Id`),
  ADD KEY `Venta_Vendedor_Id` (`Venta_Vendedor_Id`),
  ADD KEY `Venta_Evento_Id` (`Venta_Evento_Id`);

--
-- Indices de la tabla `venta_cliente`
--
ALTER TABLE `venta_cliente`
  ADD PRIMARY KEY (`Id_Venta_Cliente`),
  ADD KEY `Venta_Id` (`Venta_Id`,`Venta_Resgistro_Id`),
  ADD KEY `Venta_Resgistro_Id` (`Venta_Resgistro_Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `local`
--
ALTER TABLE `local`
  MODIFY `Id_Local` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `menu_evento`
--
ALTER TABLE `menu_evento`
  MODIFY `Id_Menu` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `oportunidad`
--
ALTER TABLE `oportunidad`
  MODIFY `Id_Oportunidad` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `registro_clientes`
--
ALTER TABLE `registro_clientes`
  MODIFY `Id_Cliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_evento`
--
ALTER TABLE `tipo_evento`
  MODIFY `Id_Evento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `vendedores`
--
ALTER TABLE `vendedores`
  MODIFY `id_Vendedor` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `Id_Venta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `venta_cliente`
--
ALTER TABLE `venta_cliente`
  MODIFY `Id_Venta_Cliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `eventos`
--
ALTER TABLE `eventos`
  ADD CONSTRAINT `eventos_ibfk_1` FOREIGN KEY (`Eventos_Tipo_Id`) REFERENCES `tipo_evento` (`Id_Evento`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `eventos_ibfk_2` FOREIGN KEY (`Eventos_Menu_Id`) REFERENCES `menu_evento` (`Id_Menu`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `eventos_ibfk_3` FOREIGN KEY (`Eventos_Local_Id`) REFERENCES `local` (`Id_Local`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`Venta_Oporunidad_Id`) REFERENCES `oportunidad` (`Id_Oportunidad`),
  ADD CONSTRAINT `venta_ibfk_2` FOREIGN KEY (`Venta_Vendedor_Id`) REFERENCES `vendedores` (`id_Vendedor`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `venta_ibfk_3` FOREIGN KEY (`Venta_Evento_Id`) REFERENCES `eventos` (`Id_Eventos`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `venta_cliente`
--
ALTER TABLE `venta_cliente`
  ADD CONSTRAINT `venta_cliente_ibfk_1` FOREIGN KEY (`Venta_Resgistro_Id`) REFERENCES `registro_clientes` (`Id_Cliente`),
  ADD CONSTRAINT `venta_cliente_ibfk_2` FOREIGN KEY (`Venta_Id`) REFERENCES `venta` (`Id_Venta`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
