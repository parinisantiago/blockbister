-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Sep 30, 2018 at 08:53 AM
-- Server version: 5.7.22
-- PHP Version: 7.1.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `blockbister`
--

-- --------------------------------------------------------

--
-- Table structure for table `Blockbister`
--

CREATE TABLE `Blockbister` (
  `idBlockbister` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Blockbister`
--

INSERT INTO `Blockbister` (`idBlockbister`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `Catalogo`
--

CREATE TABLE `Catalogo` (
  `idCatalogo` bigint(20) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `catalogos` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Pelicula`
--

CREATE TABLE `Pelicula` (
  `idPelicula` bigint(20) NOT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `sinopsis` varchar(255) DEFAULT NULL,
  `estreno` datetime DEFAULT NULL,
  `peliculas` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Pelicula`
--

INSERT INTO `Pelicula` (`idPelicula`, `titulo`, `sinopsis`, `estreno`, `peliculas`) VALUES
(1, 'Banasco, la verganza', 'Hay que cojerlo', '2018-01-01 00:00:00', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `Persona`
--

CREATE TABLE `Persona` (
  `idPersona` bigint(20) NOT NULL,
  `dni` int(11) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `personas` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Persona`
--

INSERT INTO `Persona` (`idPersona`, `dni`, `nombre`, `telefono`, `mail`, `direccion`, `personas`) VALUES
(1, 0, 'pepe', 0, 'pepe@gmail.com', 'calle false 123', 1),
(2, 37304168, 'sarasa', 12312312, 'putito@putito.com', 'calle false 123', 1);

-- --------------------------------------------------------

--
-- Table structure for table `Renta`
--

CREATE TABLE `Renta` (
  `idRenta` bigint(20) NOT NULL,
  `alquiler` datetime DEFAULT NULL,
  `devolucion` datetime DEFAULT NULL,
  `ganancia` float DEFAULT NULL,
  `rentas` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `TipoPelicula`
--

CREATE TABLE `TipoPelicula` (
  `idTipoPelicula` bigint(20) NOT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `tipospelicula` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Blockbister`
--
ALTER TABLE `Blockbister`
  ADD PRIMARY KEY (`idBlockbister`);

--
-- Indexes for table `Catalogo`
--
ALTER TABLE `Catalogo`
  ADD PRIMARY KEY (`idCatalogo`),
  ADD KEY `FKrohcrwjxl5a1eg5g04er19hmr` (`catalogos`);

--
-- Indexes for table `Pelicula`
--
ALTER TABLE `Pelicula`
  ADD PRIMARY KEY (`idPelicula`),
  ADD KEY `FKlaedeki1up2f6o73l1avkg2k9` (`peliculas`);

--
-- Indexes for table `Persona`
--
ALTER TABLE `Persona`
  ADD PRIMARY KEY (`idPersona`),
  ADD KEY `FKb8w6k0ukbt3hbqvrdey7dhwdr` (`personas`);

--
-- Indexes for table `Renta`
--
ALTER TABLE `Renta`
  ADD PRIMARY KEY (`idRenta`),
  ADD KEY `FKfcsyl0tey3gg3390tmvsrfrt4` (`rentas`);

--
-- Indexes for table `TipoPelicula`
--
ALTER TABLE `TipoPelicula`
  ADD PRIMARY KEY (`idTipoPelicula`),
  ADD KEY `FKrvnm6eyukasi0wfn6ud9dk1v8` (`tipospelicula`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Catalogo`
--
ALTER TABLE `Catalogo`
  ADD CONSTRAINT `FKrohcrwjxl5a1eg5g04er19hmr` FOREIGN KEY (`catalogos`) REFERENCES `Blockbister` (`idBlockbister`);

--
-- Constraints for table `Pelicula`
--
ALTER TABLE `Pelicula`
  ADD CONSTRAINT `FKlaedeki1up2f6o73l1avkg2k9` FOREIGN KEY (`peliculas`) REFERENCES `Blockbister` (`idBlockbister`);

--
-- Constraints for table `Persona`
--
ALTER TABLE `Persona`
  ADD CONSTRAINT `FKb8w6k0ukbt3hbqvrdey7dhwdr` FOREIGN KEY (`personas`) REFERENCES `Blockbister` (`idBlockbister`);

--
-- Constraints for table `Renta`
--
ALTER TABLE `Renta`
  ADD CONSTRAINT `FKfcsyl0tey3gg3390tmvsrfrt4` FOREIGN KEY (`rentas`) REFERENCES `Blockbister` (`idBlockbister`);

--
-- Constraints for table `TipoPelicula`
--
ALTER TABLE `TipoPelicula`
  ADD CONSTRAINT `FKrvnm6eyukasi0wfn6ud9dk1v8` FOREIGN KEY (`tipospelicula`) REFERENCES `Blockbister` (`idBlockbister`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
