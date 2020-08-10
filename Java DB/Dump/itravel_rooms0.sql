-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: itravel
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `rooms`
--

DROP TABLE IF EXISTS `rooms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rooms` (
  `Room_Number` int(11) NOT NULL AUTO_INCREMENT,
  `Max_Customer` int(11) DEFAULT NULL,
  `Room_price` int(11) DEFAULT NULL,
  `Type` varchar(45) DEFAULT NULL,
  `HSN` int(10) unsigned NOT NULL,
  `Reservation_number` int(11) DEFAULT NULL,
  PRIMARY KEY (`Room_Number`),
  KEY `fk_Reservation_number_idx` (`Reservation_number`),
  KEY `fk_Hotel_serial_idx` (`HSN`),
  CONSTRAINT `fk_Hotel_serial` FOREIGN KEY (`HSN`) REFERENCES `hotels_information` (`Serial_number`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Reservation_number` FOREIGN KEY (`Reservation_number`) REFERENCES `reservation` (`Reservation_number`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=604 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rooms`
--

LOCK TABLES `rooms` WRITE;
/*!40000 ALTER TABLE `rooms` DISABLE KEYS */;
INSERT INTO `rooms` VALUES (100,1,600,'one_Bedroom',6,11006),(101,1,1200,'one_Bedroom',2,11002),(200,2,2300,'Two_Bedroom',3,11003),(204,2,900,'Two_Bedroom',1,11001),(301,1,1000,'one_Bedroom',8,11008),(306,2,350,'Two_Bedroom',5,11005),(401,2,2430,'Two_Bedroom',10,12000),(500,2,615,'Two Bedroom',9,12002),(504,1,1300,'one_Bedroom',7,11007);
/*!40000 ALTER TABLE `rooms` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-23  8:32:50
