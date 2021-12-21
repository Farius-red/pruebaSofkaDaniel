-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 21-12-2021 a las 07:54:26
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pruebaDaniel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuestas`
--

CREATE TABLE `respuestas` (
  `id_respuesta` int(11) NOT NULL,
  `respuesta` varchar(255) DEFAULT NULL,
  `id_pregunta` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `respuestas`
--

INSERT INTO `respuestas` (`id_respuesta`, `respuesta`, `id_pregunta`) VALUES
(1, 'who', 1),
(2, 'what', 1),
(3, 'When', 3),
(4, 'Why', 2),
(5, 'Where', 4),
(6, 'Whose', 1),
(7, 'Which', 5),
(8, 'How', 2),
(9, 'How often', 20),
(10, 'How fast', 18),
(11, 'How long ', 18),
(12, 'How many', 18),
(13, 'how much', 19),
(14, 'how old are you', 8),
(15, 'what time it is', 8),
(16, 'What do you do?', 17),
(17, 'Where do you work?', 17),
(18, 'What’s your boss’ name?', 7),
(19, 'Do you enjoy your job?', 9),
(20, 'Do you like living in Spain?', 9),
(21, 'Are you married?', 9),
(22, 'Do you have a boyfriend / girlfriend?', 22),
(23, ' Do you have any brothers or sisters?', 22),
(24, 'What are you doing?', 10),
(25, 'Where do you live?', 23),
(26, 'What’s your address?', 7),
(27, 'What neighborhood do you live in?', 23),
(28, 'Do you live in a house, or a flat?', 24),
(29, 'How big is your house?', 24),
(30, 'Do you have any flatmates?', 24),
(31, ' Do you live alone?', 11),
(32, 'How many bedrooms do you have?', 25),
(33, 'How are you?', 11),
(34, 'How do you feel?', 11),
(35, 'What’s up?', 15),
(36, 'Are you okay?', 12),
(37, 'What’s wrong?', 12),
(38, 'Are you feeling better?', 13),
(39, 'Do you need to go to the doctor?', 14),
(40, 'Could I please have a cup of coffee?', 13),
(41, 'Would you like some coffee?', 16),
(42, 'Could I have some more wine?', 17),
(43, 'Would you mind making me a sandwich?', 18),
(44, 'Do you mind if I open the window?', 19),
(45, ' Could you help me translate this into English?', 20),
(46, 'Do you want to go out sometime?', 13),
(47, 'Would you like to have dinner on Friday?', 15),
(48, 'Do you like white wine?', 21),
(49, 'What’s your favorite band?', 22),
(50, 'What’s your favorite food?', 10),
(51, 'What kind of music do you like?', 6),
(52, 'Where do you usually go on vacation?', 6),
(53, 'Do you prefer going to the the beach or to the mountains?', 23),
(54, 'What do you like doing in your free time?', 24),
(55, 'Do you have any pets?', 14),
(56, 'Could you please repeat that?', 25),
(57, 'Could you please speak slower?', 25),
(58, 'I apologize, but English isn’t my first language. Could you repeat that for me?', 25),
(59, 'Could you please spell that?', 10),
(60, 'What time is it?', 21),
(61, 'Excuse me! Where’s the bus station?', 21),
(62, 'Could you please help me?', 20),
(63, 'How tall are you?', 29),
(64, 'How long have you been living here?', 21),
(65, 'Why did you decide to move to Spain?', 20),
(66, 'What are you going to do this weekend?', 22),
(67, 'What did you study at university?', 19),
(68, 'Are you hungry?', 14),
(69, ' Where are you going?', 16),
(70, 'Who do you live with?', 17),
(71, 'Where did you get those shoes?', 19),
(72, 'add', 17),
(73, 'apologise', 15),
(74, 'apologised', 15),
(75, 'sleep', 15),
(76, 'slept', 16),
(77, 'smell', 16),
(78, 'smelled', 7),
(79, 'speak', 13),
(80, 'spoke', 12),
(81, 'spoken', 13),
(82, 'spend', 7),
(83, 'spent', 12),
(84, 'start', 6),
(85, 'started', 14),
(86, 'stay', 8),
(87, 'stayed', 11),
(88, 'steal', 11),
(89, 'stop', 5),
(90, 'stole', 10),
(91, 'stolen', 8),
(92, 'stopped', 5),
(93, 'stopped', 5),
(94, 'study', 2),
(95, 'studied', 3),
(96, 'survive', 3),
(97, 'survived', 3),
(98, 'swim', 2),
(99, 'swam', 1),
(100, 'What is your name?', 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `score`
--

CREATE TABLE `score` (
  `id_juego` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `score` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  ADD PRIMARY KEY (`id_respuesta`);

--
-- Indices de la tabla `score`
--
ALTER TABLE `score`
  ADD PRIMARY KEY (`id_juego`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  MODIFY `id_respuesta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT de la tabla `score`
--
ALTER TABLE `score`
  MODIFY `id_juego` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
