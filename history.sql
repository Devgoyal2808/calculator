-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 01, 2019 at 08:06 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `calculator`
--

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `number1` varchar(20) NOT NULL,
  `number2` varchar(20) NOT NULL,
  `operand` varchar(20) NOT NULL,
  `result` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`number1`, `number2`, `operand`, `result`) VALUES
('8', '2', '10', '+'),
('8', '2', '10', '+'),
('8', '2', '+', '10'),
('8', '2', '+', '10'),
('99', '9', '-', '90'),
('99', '66', '-', '33'),
('5', '2', '-', '3'),
('3', '5', '*', '15'),
('0', '5', '/', '0'),
('8', '2', '+', '10'),
('10', '3', '-', '7'),
('8', '2', '*', '16'),
('16', '3', '-', '13'),
('8', '2', '+', '10'),
('8', '2', '-', '6'),
('8', '2', '-', '6'),
('6', '6', '*', '36'),
('8', '2', '*', '16'),
('8', '2', '-', '6'),
('6', '3', '*', '18');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
