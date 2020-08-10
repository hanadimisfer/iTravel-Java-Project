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
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservation` (
  `Reservation_number` int(11) NOT NULL AUTO_INCREMENT,
  `Room_number` int(11) DEFAULT NULL,
  `Arrival_date` date DEFAULT NULL,
  `Departure_date` date DEFAULT NULL,
  `Serial_number` int(10) unsigned NOT NULL,
  `Customer_ID` int(11) NOT NULL,
  PRIMARY KEY (`Reservation_number`),
  UNIQUE KEY `Reservation_number_UNIQUE` (`Reservation_number`),
  KEY `fk_Hoel_serial_idx` (`Serial_number`),
  KEY `fk_Customer_ID_idx` (`Customer_ID`),
  CONSTRAINT `fk_Customer_ID` FOREIGN KEY (`Customer_ID`) REFERENCES `customer_information` (`Customer_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Hoel_serial` FOREIGN KEY (`Serial_number`) REFERENCES `hotels_information` (`Serial_number`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12003 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation`
--

LOCK TABLES `reservation` WRITE;
/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
INSERT INTO `reservation` VALUES (11001,1,'2018-04-21','2018-04-25',1,212001),(11002,2,'2018-03-25','2018-03-26',2,212002),(11003,1,'2018-03-22','2018-03-29',3,212005),(11005,3,'2018-04-04','2018-04-09',5,212007),(11006,1,'2018-03-20','2018-04-01',6,212003),(11007,3,'2018-03-20','2018-03-24',7,212008),(11008,4,'2018-05-05','2018-05-10',8,212009),(11009,3,'2018-02-08','2018-02-10',9,212004),(12000,1,'2018-01-10','2018-01-11',10,212006),(12001,3,'2018-02-10','2018-02-20',4,212001),(12002,2,'2018-03-02','2018-03-10',9,212001);
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-23  6:11:02
