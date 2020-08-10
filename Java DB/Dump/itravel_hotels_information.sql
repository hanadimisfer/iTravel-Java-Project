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
-- Table structure for table `hotels_information`
--

DROP TABLE IF EXISTS `hotels_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hotels_information` (
  `Serial_number` int(10) unsigned NOT NULL,
  `Hotel_name` varchar(45) DEFAULT NULL,
  `User_name` varchar(45) DEFAULT NULL,
  `Number_of_Room` int(11) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  `Price` int(11) DEFAULT NULL,
  `Location` varchar(45) DEFAULT NULL,
  `Administrator_User_name` varchar(45) NOT NULL DEFAULT 'LamaM',
  PRIMARY KEY (`Serial_number`),
  KEY `fk_Administorator_UserName_idx` (`Administrator_User_name`),
  CONSTRAINT `fk_Administorator_UserName` FOREIGN KEY (`Administrator_User_name`) REFERENCES `administrator` (`User_name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hotels_information`
--

LOCK TABLES `hotels_information` WRITE;
/*!40000 ALTER TABLE `hotels_information` DISABLE KEYS */;
INSERT INTO `hotels_information` VALUES (1,'Radisson Blu','Rblu',20,'RB1212',900,'Dammam','LamaM'),(2,'Atlantis The Palm','AtPalm',25,'AP3011',1200,'Dammam','HanadiA'),(3,'The Ritz-Carlton','RitzC',28,'RC2342',2300,'Dubai','Beshayer'),(4,'Hyatt Regency','HyattR',15,'HR0110',400,'Dubai','Ahmad'),(5,'Sofitel ','SofH',12,'SF2312',350,'Riyadh','saad'),(6,'Ramada Plaza','Rplaza',20,'RP4324',600,'Riyadh','abdullah'),(7,'Wyndham Marina','WMarina',30,'W12322',1300,'Bahrain','raghad'),(8,'JW Marriott','JMarriott',40,'JWM320',1000,'Bahrain','fahad'),(9,'Four seasons','FShotel',35,'Four4231',2500,'Jeddah','bader'),(10,'Crowne Plaza','CRplaza',32,'Plaza2011',2430,'Jeddah','amjad'),(11,' Kembenisky','Sofia',40,'s12s34s56',2000,'Jeddah','LamaM');
/*!40000 ALTER TABLE `hotels_information` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-23  6:11:03
