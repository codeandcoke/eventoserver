-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 22, 2015 at 12:55 AM
-- Server version: 5.5.39
-- PHP Version: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `opiniones`
--

-- --------------------------------------------------------

--
-- Table structure for table `opiniones`
--

CREATE TABLE IF NOT EXISTS `opiniones` (
`id` int(11) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `texto` varchar(500) NOT NULL,
  `fecha` datetime NOT NULL,
  `puntuacion` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `opiniones`
--

INSERT INTO `opiniones` (`id`, `titulo`, `texto`, `fecha`, `puntuacion`) VALUES
(1, 'nada', 'nada mas', '2015-11-21 21:36:13', -1),
(2, 'nada', 'nada mas', '2015-11-21 21:36:18', -1),
(3, 'nada', 'nada mas', '2015-11-21 22:07:30', -1),
(4, 'dfgdfg', 'dfg', '2015-11-21 22:13:49', 7),
(5, 'hola hola', 'que pasa', '2015-11-21 22:14:04', 4),
(6, 'dsd', 'sf', '2015-11-21 22:20:13', 4),
(7, 'vjg', 'ghjg', '2015-11-21 22:22:00', 6);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `opiniones`
--
ALTER TABLE `opiniones`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `opiniones`
--
ALTER TABLE `opiniones`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
