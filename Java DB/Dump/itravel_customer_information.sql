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
-- Table structure for table `customer_information`
--

DROP TABLE IF EXISTS `customer_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_information` (
  `User_name` varchar(45) DEFAULT NULL,
  `Customer_ID` int(10) NOT NULL AUTO_INCREMENT,
  `Fname` varchar(45) DEFAULT NULL,
  `Lname` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Date_of_birth` date DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  `Post_code` int(11) DEFAULT NULL,
  `Phone_number` int(10) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Customer_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=212011 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_information`
--

LOCK TABLES `customer_information` WRITE;
/*!40000 ALTER TABLE `customer_information` DISABLE KEYS */;
INSERT INTO `customer_information` VALUES ('HanadiM',212001,'Hanadi','Misfer','hanadim@outlook.com','1996-04-20','Jubail',31951,552480407,'HM3011'),('Lama_A',212002,'Lama','Abdullah','L-ama@hotmail.com','1997-11-11','Khobar',31952,565503456,'Lm2000'),('B_ahmad',212003,'Bashayer','Ahmad','BeshAh@hotmail.com','1987-04-22','jeddah',21442,550766014,'B_a3200'),('AbdullahM',212004,'Abdullah','Mohammad','abdm@hotmail.com','1979-05-20','Riyadh',11461,534330150,'Abd2231'),('Fahad_D',212005,'Fahad','Aldossary','fahadi_D@gmail.com','1990-01-10','Dharan',31932,566601500,'F4043H'),('R_alqahtani',212006,'Raghad','alqahtani','raghad_A@hotmail.com','1982-09-28',' Dammam',31146,556601234,'RA_3145'),('AlotaibiR',212007,'Rami','Alotaibi','ramialotaibi@hotmail.com','1986-12-04','Dammam',31146,599755195,'rami9000'),('SaadMO',212008,'Saad','Mohammad','Smohammad@outlook.com','1996-02-20','Taif',21944,536613456,'S123456'),('S_nawaf',212009,'Suliman','Nawaf','Snawaf@hotmail.com','1989-06-17','Tabuk',71411,551350307,'naw_f121'),('bashayerA',212010,'bashayer','ahmad','','1997-03-05','khobar',35461,563610409,'NULL');
/*!40000 ALTER TABLE `customer_information` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-23  6:11:00
