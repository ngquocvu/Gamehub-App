-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th4 22, 2019 lúc 11:40 AM
-- Phiên bản máy phục vụ: 10.1.38-MariaDB
-- Phiên bản PHP: 7.1.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `gamehub`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `genre`
--

CREATE TABLE `genre` (
  `genreID` varchar(12) NOT NULL,
  `genreName` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `genre`
--

INSERT INTO `genre` (`genreID`, `genreName`) VALUES
('1', 'Action'),
('2', 'Adventure'),
('3', 'Role Playing'),
('4', 'Stimulate'),
('5', 'Strategy'),
('6', 'Sport');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ordereditems`
--

CREATE TABLE `ordereditems` (
  `orderID` int(11) NOT NULL,
  `productID` varchar(16) NOT NULL,
  `quantity` int(11) NOT NULL,
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `ordereditems`
--

INSERT INTO `ordereditems` (`orderID`, `productID`, `quantity`, `createdAt`, `updatedAt`) VALUES
(2, '1', 2, '2019-04-01 18:35:13', '2019-04-22 08:13:55'),
(4, '1', 9, '2019-04-02 10:52:27', '2019-04-02 03:52:27'),
(5, '2', 12, '2019-04-02 10:59:27', '2019-04-02 03:59:27'),
(12, '1', 14, '2019-04-22 15:40:06', '2019-04-22 08:40:06'),
(12, '2', 17, '2019-04-22 15:40:06', '2019-04-22 08:40:06');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `staffID` int(11) DEFAULT NULL,
  `userID` int(11) DEFAULT NULL,
  `createdAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `state` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `orders`
--

INSERT INTO `orders` (`id`, `staffID`, `userID`, `createdAt`, `updatedAt`, `state`) VALUES
(1, 12, 1, '2019-04-22 09:16:21', '2019-04-22 09:24:09', 'Processing'),
(2, 2, 2, '2019-04-22 09:16:24', '2019-04-22 09:32:15', 'Processing'),
(3, 2, 2, '2019-04-22 09:36:47', '2019-04-22 09:36:47', 'Processing'),
(4, 1, 2, '2019-04-22 09:36:51', '2019-04-22 09:36:51', 'Processing');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `products`
--

CREATE TABLE `products` (
  `id` varchar(16) NOT NULL,
  `name` varchar(64) NOT NULL,
  `description` text NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `publisherID` varchar(12) NOT NULL,
  `genreID` varchar(12) NOT NULL,
  `platform` varchar(16) NOT NULL,
  `releaseDate` varchar(16) NOT NULL,
  `quantity` int(11) NOT NULL,
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `products`
--

INSERT INTO `products` (`id`, `name`, `description`, `price`, `publisherID`, `genreID`, `platform`, `releaseDate`, `quantity`, `createdAt`, `updatedAt`) VALUES
('1', 'Minecraft', 'none', '89.00', '1', '3', 'Steam', '12', 5, '2019-04-21 22:27:34', '2019-04-22 08:54:20'),
('2', 'EA', 'none', '17.00', '2', '2', 'Steam', '1999', 42, '2019-04-22 15:40:43', '2019-04-22 08:54:37'),
('3', 'ea', 'none', '12.00', '2', '4', 'Steam', '1999', 0, '2019-04-22 16:11:46', '2019-04-22 09:11:46'),
('4', 'ea', 'none', '12.00', '2', '4', 'PC', '1999', 0, '2019-04-22 16:12:28', '2019-04-22 09:12:28');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `staffs`
--

CREATE TABLE `staffs` (
  `id` int(11) NOT NULL,
  `firstname` varchar(32) NOT NULL,
  `lastname` varchar(32) NOT NULL,
  `email` varchar(128) NOT NULL,
  `password` varchar(128) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phonenumber` varchar(16) NOT NULL,
  `role` varchar(12) NOT NULL,
  `sex` varchar(12) NOT NULL,
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `staffs`
--

INSERT INTO `staffs` (`id`, `firstname`, `lastname`, `email`, `password`, `address`, `phonenumber`, `role`, `sex`, `createdAt`, `updatedAt`) VALUES
(1, 'Nguyen', 'Quoc', 'nguyenquocvu@mail.com', '124215', '421 Vuon Chuoi', '0967852575', '1', '1', '2019-04-22 12:24:56', '2019-04-22 09:38:00');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `firstname` varchar(32) NOT NULL,
  `lastname` varchar(32) NOT NULL,
  `email` varchar(128) NOT NULL,
  `password` varchar(128) NOT NULL,
  `phonenumber` varchar(16) NOT NULL,
  `createdAt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `firstname`, `lastname`, `email`, `password`, `phonenumber`, `createdAt`, `updatedAt`) VALUES
(1, 'Vu', 'Nguyen', 'nguyenquocvu2861999@gmail.com', '$2y$10$nP7iZlf5o6sRhmbaBws//.k48SA2M70wBG1ci5rqjjcrStIY5nAsu', '0967852575', '2019-04-01 18:05:08', '2019-04-22 05:13:58');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `genre`
--
ALTER TABLE `genre`
  ADD PRIMARY KEY (`genreID`);

--
-- Chỉ mục cho bảng `ordereditems`
--
ALTER TABLE `ordereditems`
  ADD PRIMARY KEY (`orderID`,`productID`),
  ADD KEY `productID` (`productID`);

--
-- Chỉ mục cho bảng `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `staffID` (`staffID`),
  ADD KEY `userID` (`userID`);

--
-- Chỉ mục cho bảng `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `staffs`
--
ALTER TABLE `staffs`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2122223;

--
-- AUTO_INCREMENT cho bảng `staffs`
--
ALTER TABLE `staffs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
