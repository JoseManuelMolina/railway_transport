CREATE DATABASE  IF NOT EXISTS `railway_company` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `railway_company`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: railway_company
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `passenger`
--

DROP TABLE IF EXISTS `passenger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passenger` (
  `id` int NOT NULL AUTO_INCREMENT,
  `phone_number` varchar(40) DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `surname` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `date_birth` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passenger`
--

LOCK TABLES `passenger` WRITE;
/*!40000 ALTER TABLE `passenger` DISABLE KEYS */;
INSERT INTO `passenger` VALUES (1,'(957) 435-0727','Neville','Roach','1977-04-22'),(2,'(511) 474-4635','Colleen','Harding','1969-10-31'),(3,'1-253-425-1526','Yardley','Terry','1975-01-08'),(4,'(723) 798-5952','Hedwig','Salas','1972-01-19'),(5,'(933) 771-1382','Yolanda','Schroeder','1970-07-07'),(6,'(573) 252-4496','Aquila','Odom','1957-08-27'),(7,'1-564-337-4755','Marsden','Winters','1955-09-28'),(8,'(854) 335-5470','Kaye','Ewing','1976-08-28'),(9,'1-582-673-2331','Kelly','Sherman','1928-12-30'),(10,'1-626-314-9527','Ezra','Bright','1962-12-29'),(11,'1-436-627-1749','Grady','Townsend','1960-05-05'),(12,'1-977-550-8582','Liberty','Snider','1966-08-25'),(13,'1-160-931-8517','Aquila','Gardner','1997-04-12'),(14,'1-425-422-3851','Laith','Farrell','1972-02-13'),(15,'(365) 384-6426','Aiko','Hurst','1998-04-23'),(16,'(274) 222-6367','Erica','Barker','1921-01-15'),(17,'(731) 585-4228','Eagan','Lynch','1992-01-10'),(18,'(924) 617-5218','Frances','Moody','1976-05-01'),(19,'(878) 969-6246','Geraldine','Reeves','2007-09-04'),(20,'1-758-491-2949','Ivy','Mooney','1998-09-30'),(21,'1-245-582-6998','Linus','Jensen','1952-04-28'),(22,'1-796-711-1071','Andrew','Harper','1959-03-10'),(23,'1-658-349-7531','Jermaine','Adams','1994-03-16'),(24,'(521) 573-5358','Thane','Gill','1980-07-10'),(25,'1-363-638-9122','Charissa','Luna','1977-04-10');
/*!40000 ALTER TABLE `passenger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `train`
--

DROP TABLE IF EXISTS `train`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `train` (
  `number` int NOT NULL AUTO_INCREMENT,
  `seats_total` int DEFAULT NULL,
  `seats_occupied` int DEFAULT NULL,
  PRIMARY KEY (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=120 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `train`
--

LOCK TABLES `train` WRITE;
/*!40000 ALTER TABLE `train` DISABLE KEYS */;
INSERT INTO `train` VALUES (100,303,462),(101,169,147),(102,396,236),(103,493,437),(104,338,261),(105,453,239),(106,100,2),(107,163,101),(108,456,335),(109,390,180),(110,438,369),(111,336,306),(112,343,224),(113,192,72),(114,412,438),(115,346,232),(116,385,83),(117,320,354),(118,201,55),(119,258,238);
/*!40000 ALTER TABLE `train` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `station`
--

DROP TABLE IF EXISTS `station`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `station` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `station`
--

LOCK TABLES `station` WRITE;
/*!40000 ALTER TABLE `station` DISABLE KEYS */;
INSERT INTO `station` VALUES (1,'Green Bay'),(2,'Lafayette'),(3,'Salt Lake City'),(4,'Hattiesburg'),(5,'Bear'),(6,'New Haven'),(7,'New Haven'),(8,'Austin'),(9,'Pike Creek'),(10,'Portland');
/*!40000 ALTER TABLE `station` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `schedule`
--

DROP TABLE IF EXISTS `schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `schedule` (
  `time` time NOT NULL,
  `station_id` int NOT NULL,
  `train_number` int NOT NULL,
  PRIMARY KEY (`time`,`station_id`,`train_number`),
  KEY `fk_schedule_station1_idx` (`station_id`),
  KEY `fk_schedule_train1_idx` (`train_number`),
  CONSTRAINT `fk_schedule_station1` FOREIGN KEY (`station_id`) REFERENCES `station` (`id`),
  CONSTRAINT `fk_schedule_train1` FOREIGN KEY (`train_number`) REFERENCES `train` (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedule`
--

LOCK TABLES `schedule` WRITE;
/*!40000 ALTER TABLE `schedule` DISABLE KEYS */;
INSERT INTO `schedule` VALUES ('05:46:34',1,109),('11:30:19',1,107),('12:06:36',1,114),('01:27:15',2,101),('09:49:34',2,102),('14:36:00',2,113),('19:37:41',2,104),('20:26:15',2,114),('20:55:00',2,111),('21:23:03',2,102),('22:28:04',2,101),('09:40:55',3,116),('11:23:59',3,118),('13:21:00',3,100),('17:55:08',3,104),('19:40:36',3,113),('03:22:42',4,118),('05:13:27',4,114),('07:40:31',4,104),('11:27:10',4,107),('17:54:39',4,117),('18:01:38',4,117),('21:56:30',4,114),('07:04:26',5,109),('10:31:43',5,108),('11:07:53',5,118),('11:16:24',5,117),('14:22:35',5,118),('02:20:49',6,110),('08:32:29',6,107),('10:44:09',6,105),('11:02:06',6,116),('18:38:31',6,103),('22:05:45',6,116),('05:23:11',7,110),('08:15:03',7,102),('08:40:06',7,102),('14:06:21',7,115),('14:47:10',7,104),('15:24:15',7,117),('15:43:35',7,117),('18:42:33',7,111),('05:54:52',8,114),('06:08:39',8,101),('09:06:16',8,109),('11:05:35',9,115),('13:41:29',9,110),('21:11:19',9,112),('00:29:04',10,116),('21:29:56',10,109);
/*!40000 ALTER TABLE `schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `station`
--

DROP TABLE IF EXISTS `station`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `station` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `station`
--

LOCK TABLES `station` WRITE;
/*!40000 ALTER TABLE `station` DISABLE KEYS */;
INSERT INTO `station` VALUES (1,'Green Bay'),(2,'Lafayette'),(3,'Salt Lake City'),(4,'Hattiesburg'),(5,'Bear'),(6,'New Haven'),(7,'New Haven'),(8,'Austin'),(9,'Pike Creek'),(10,'Portland');
/*!40000 ALTER TABLE `station` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket` (
  `train_number` int NOT NULL,
  `passenger_id` int NOT NULL,
  `date_time_buy` datetime NOT NULL,
  PRIMARY KEY (`train_number`,`passenger_id`,`date_time_buy`),
  KEY `fk_ticket_passenger1_idx` (`passenger_id`),
  CONSTRAINT `fk_ticket_passenger1` FOREIGN KEY (`passenger_id`) REFERENCES `passenger` (`id`),
  CONSTRAINT `fk_ticket_train` FOREIGN KEY (`train_number`) REFERENCES `train` (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES (102,1,'2022-06-14 11:11:03'),(103,1,'2023-02-07 15:22:11'),(102,2,'2023-06-09 13:37:31'),(111,2,'2022-07-21 10:10:15'),(111,2,'2023-08-30 05:18:43'),(114,2,'2023-12-11 04:38:53'),(119,2,'2023-11-28 23:42:28'),(101,3,'2022-05-26 13:05:45'),(101,3,'2023-08-11 18:38:49'),(102,3,'2023-09-02 12:48:36'),(113,3,'2023-04-08 10:49:38'),(119,3,'2023-12-17 19:35:41'),(101,4,'2022-08-08 04:53:47'),(104,4,'2022-12-24 02:50:51'),(109,4,'2023-12-18 19:58:38'),(113,4,'2023-02-01 20:40:41'),(119,4,'2023-01-22 02:48:26'),(104,5,'2022-04-05 13:19:32'),(104,6,'2022-04-30 01:20:06'),(107,6,'2023-09-13 03:45:32'),(109,6,'2022-03-09 03:02:37'),(110,6,'2023-10-29 19:06:27'),(106,7,'2023-08-19 05:54:15'),(114,7,'2022-08-23 13:40:08'),(115,7,'2022-12-18 06:20:14'),(104,8,'2023-07-02 09:16:32'),(107,8,'2022-06-15 13:45:01'),(108,8,'2023-10-25 03:09:02'),(110,8,'2023-10-07 16:34:23'),(106,9,'2022-12-05 16:29:19'),(108,9,'2022-08-17 07:41:52'),(109,9,'2023-01-29 00:29:13'),(100,10,'2023-08-14 19:59:58'),(108,10,'2022-12-28 23:32:48'),(115,10,'2023-12-04 00:41:53'),(119,10,'2022-10-13 11:12:41'),(103,11,'2024-01-24 17:49:35'),(106,12,'2022-04-30 07:41:50'),(113,12,'2023-09-22 08:39:37'),(114,12,'2023-04-26 18:53:06'),(118,12,'2022-11-14 13:34:42'),(104,13,'2023-08-05 11:43:54'),(105,13,'2023-05-14 07:26:15'),(103,14,'2022-11-07 01:21:16'),(114,14,'2022-10-11 00:38:52'),(116,14,'2023-10-17 14:00:12'),(102,15,'2023-05-08 18:25:22'),(107,15,'2022-07-08 23:57:33'),(107,15,'2022-08-13 23:55:49'),(114,15,'2023-05-23 10:42:43'),(115,15,'2022-03-20 17:06:10'),(116,15,'2024-01-16 13:42:22'),(118,15,'2022-08-26 07:44:57'),(104,16,'2022-05-02 14:50:00'),(106,16,'2022-06-26 23:54:29'),(112,16,'2023-10-21 09:44:04'),(112,16,'2024-02-12 14:55:56'),(119,16,'2022-08-28 01:17:25'),(101,17,'2023-09-21 01:14:47'),(106,17,'2022-11-20 14:46:57'),(109,17,'2023-10-28 22:56:25'),(114,17,'2023-04-13 21:03:04'),(114,17,'2023-05-23 05:57:40'),(117,17,'2022-04-13 15:47:47'),(117,17,'2022-06-11 06:47:15'),(102,18,'2022-10-27 06:44:27'),(103,18,'2023-11-23 09:58:15'),(111,18,'2022-07-31 05:17:53'),(117,18,'2023-09-26 06:50:41'),(101,19,'2023-01-26 20:42:45'),(104,19,'2022-09-24 11:36:38'),(105,19,'2024-02-21 02:29:50'),(117,19,'2022-11-01 02:17:25'),(103,20,'2022-06-28 03:33:31'),(104,20,'2024-01-30 17:46:38'),(113,20,'2023-09-18 12:22:01'),(100,21,'2022-08-14 20:13:10'),(102,21,'2022-10-09 11:25:32'),(104,21,'2022-04-23 13:06:42'),(104,21,'2024-01-27 03:39:47'),(108,21,'2022-07-02 05:04:32'),(109,21,'2023-02-19 12:58:35'),(113,21,'2023-04-03 07:12:55'),(115,21,'2023-07-20 20:23:02'),(115,21,'2023-12-01 17:50:44'),(117,21,'2022-04-15 04:12:42'),(110,22,'2022-07-06 00:02:03'),(116,22,'2024-01-22 01:59:44'),(102,23,'2023-11-02 19:43:48'),(103,23,'2022-07-31 12:20:14'),(104,23,'2023-06-21 00:01:56'),(112,23,'2022-07-21 15:28:54'),(113,23,'2024-01-01 16:23:11'),(109,24,'2023-03-05 14:59:08'),(109,24,'2023-09-03 02:17:35'),(110,24,'2023-01-07 06:18:41'),(111,24,'2023-11-15 16:56:04'),(102,25,'2022-07-10 22:46:31'),(103,25,'2023-03-16 19:55:47'),(107,25,'2022-09-05 14:20:49');
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;



--
-- Dumping events for database 'railway_company'
--

--
-- Dumping routines for database 'railway_company'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-06 21:47:28
