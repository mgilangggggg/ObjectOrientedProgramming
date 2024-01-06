-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 29, 2022 at 01:38 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbtugasbesar`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kodeBarang` varchar(10) NOT NULL,
  `namaBarang` varchar(25) NOT NULL,
  `perusahaanProduksi` varchar(50) NOT NULL,
  `jumlahBarang` varchar(10) NOT NULL,
  `tglMasuk` varchar(25) NOT NULL,
  `tglExpired` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kodeBarang`, `namaBarang`, `perusahaanProduksi`, `jumlahBarang`, `tglMasuk`, `tglExpired`) VALUES
('B001', 'NABATI', 'PT KALDU SARI NABATI', '100', '25-11-2018', '25-112024'),
('B002', 'OREO', 'PT MONDELEZ', '150', '25-11-2018', '25-11-2025'),
('B003', 'ABC SAMBAL EXTRA PEDAS', 'PT ABC HEINZ', '20', '25-12-2018', '22-06-2025'),
('B004', 'ABC SAOS PEDAS', 'PT ABC HEINZ', '50', '25-12-2018', '22-06-2025'),
('B005', 'ABC SAMBAL TOMAT', 'PT ABC HEINZ', '30', '25-12-2018', '22-06-2025'),
('B006', 'BANGO KECAP MANIS', 'PT ANUGRAH MUTU BERSAMA', '50', '02-12-2018', '14-04-2023'),
('B007', 'CUSION SOMENTINC', 'PT NOSE HERBALINDO', '100', '25-12-2019', '25-01-2023'),
('B008', 'CIMORY SQUEEZE', 'PT CISARUA MOUNTAIN DAIRY', '150', '27-12-2019', '25-11-2025'),
('B009', 'SOSIS KENZLER', 'PT MACROPRIMA', '100', '11-02-2020', '25-12-2027'),
('B010', 'BODY LTN SCARLETT WHITENE', 'PT OPTO LUMBUNG SEJAHTERA', '150', '26-04-2020', '15-07-2025'),
('B011', 'NESCAFE COFFE', 'PT NESTLE INDONESIA', '100', '25-08-2020', '25-03-2024');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `USERNAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`USERNAME`, `PASSWORD`) VALUES
('admin', 'admin123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kodeBarang`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`USERNAME`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
