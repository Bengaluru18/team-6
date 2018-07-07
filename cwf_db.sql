CREATE DATABASE  IF NOT EXISTS `cfw` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `cfw`;
-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: cfw
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin_details`
--

DROP TABLE IF EXISTS `admin_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `admin_details` (
  `username` varchar(100) DEFAULT NULL,
  `pwd` varchar(100) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_details`
--

LOCK TABLES `admin_details` WRITE;
/*!40000 ALTER TABLE `admin_details` DISABLE KEYS */;
INSERT INTO `admin_details` VALUES ('admin','admin','admin@admin.com');
/*!40000 ALTER TABLE `admin_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classroom_environment`
--

DROP TABLE IF EXISTS `classroom_environment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `classroom_environment` (
  `school_id` int(100) DEFAULT NULL,
  `indicators` varchar(200) DEFAULT NULL,
  `total_available` int(8) DEFAULT NULL,
  `req_repair` varchar(100) DEFAULT NULL,
  `new_requirement` varchar(100) DEFAULT NULL,
  `aoir` varchar(1000) DEFAULT NULL,
  KEY `school_id` (`school_id`),
  CONSTRAINT `classroom_environment_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school_details` (`school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classroom_environment`
--

LOCK TABLES `classroom_environment` WRITE;
/*!40000 ALTER TABLE `classroom_environment` DISABLE KEYS */;
/*!40000 ALTER TABLE `classroom_environment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `english_medium`
--

DROP TABLE IF EXISTS `english_medium`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `english_medium` (
  `school_id` int(100) DEFAULT NULL,
  `class` int(4) NOT NULL,
  `boys` varchar(100) DEFAULT NULL,
  `girls` varchar(100) DEFAULT NULL,
  `total` int(4) DEFAULT NULL,
  PRIMARY KEY (`class`),
  KEY `school_id` (`school_id`),
  CONSTRAINT `english_medium_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school_details` (`school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `english_medium`
--

LOCK TABLES `english_medium` WRITE;
/*!40000 ALTER TABLE `english_medium` DISABLE KEYS */;
/*!40000 ALTER TABLE `english_medium` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `individual_donor`
--

DROP TABLE IF EXISTS `individual_donor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `individual_donor` (
  `donor_name` varchar(200) DEFAULT NULL,
  `total_members` int(7) DEFAULT NULL,
  `major_activities` varchar(200) DEFAULT NULL,
  `contact_details` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `individual_donor`
--

LOCK TABLES `individual_donor` WRITE;
/*!40000 ALTER TABLE `individual_donor` DISABLE KEYS */;
/*!40000 ALTER TABLE `individual_donor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kannada_medium`
--

DROP TABLE IF EXISTS `kannada_medium`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `kannada_medium` (
  `school_id` int(100) DEFAULT NULL,
  `class` int(4) NOT NULL,
  `boys` varchar(100) DEFAULT NULL,
  `girls` varchar(100) DEFAULT NULL,
  `total` int(4) DEFAULT NULL,
  PRIMARY KEY (`class`),
  KEY `school_id` (`school_id`),
  CONSTRAINT `kannada_medium_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school_details` (`school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kannada_medium`
--

LOCK TABLES `kannada_medium` WRITE;
/*!40000 ALTER TABLE `kannada_medium` DISABLE KEYS */;
/*!40000 ALTER TABLE `kannada_medium` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login_details`
--

DROP TABLE IF EXISTS `login_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `login_details` (
  `username` varchar(100) DEFAULT NULL,
  `pwd` varchar(100) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login_details`
--

LOCK TABLES `login_details` WRITE;
/*!40000 ALTER TABLE `login_details` DISABLE KEYS */;
INSERT INTO `login_details` VALUES ('user','user','user@xyz.com');
/*!40000 ALTER TABLE `login_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ngo_details`
--

DROP TABLE IF EXISTS `ngo_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ngo_details` (
  `username` varchar(100) DEFAULT NULL,
  `pwd` varchar(100) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ngo_details`
--

LOCK TABLES `ngo_details` WRITE;
/*!40000 ALTER TABLE `ngo_details` DISABLE KEYS */;
INSERT INTO `ngo_details` VALUES ('cwf','cwf','cwf@gmail.com');
/*!40000 ALTER TABLE `ngo_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanitation`
--

DROP TABLE IF EXISTS `sanitation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sanitation` (
  `school_id` int(100) DEFAULT NULL,
  `toilet_details` varchar(200) DEFAULT NULL,
  `availability` varchar(100) DEFAULT NULL,
  `req_repair` varchar(100) DEFAULT NULL,
  `new_requirement` varchar(100) DEFAULT NULL,
  `aoir` varchar(1000) DEFAULT NULL,
  KEY `school_id` (`school_id`),
  CONSTRAINT `sanitation_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school_details` (`school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanitation`
--

LOCK TABLES `sanitation` WRITE;
/*!40000 ALTER TABLE `sanitation` DISABLE KEYS */;
/*!40000 ALTER TABLE `sanitation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sc_st_children`
--

DROP TABLE IF EXISTS `sc_st_children`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sc_st_children` (
  `school_id` int(100) DEFAULT NULL,
  `b_sc` int(3) DEFAULT NULL,
  `b_st` int(3) DEFAULT NULL,
  `g_sc` int(3) DEFAULT NULL,
  `g_st` int(3) DEFAULT NULL,
  KEY `school_id` (`school_id`),
  CONSTRAINT `sc_st_children_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school_details` (`school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sc_st_children`
--

LOCK TABLES `sc_st_children` WRITE;
/*!40000 ALTER TABLE `sc_st_children` DISABLE KEYS */;
/*!40000 ALTER TABLE `sc_st_children` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `school_details`
--

DROP TABLE IF EXISTS `school_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `school_details` (
  `school_id` int(100) NOT NULL AUTO_INCREMENT,
  `school_name` varchar(200) NOT NULL,
  `locality` varchar(20) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  `district` varchar(200) DEFAULT NULL,
  `state` varchar(200) DEFAULT NULL,
  `LPS` int(3) DEFAULT NULL,
  `HPS` int(3) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `total_no_of_students` int(4) DEFAULT NULL,
  `MOI` varchar(25) DEFAULT NULL,
  `DISE` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `school_details`
--

LOCK TABLES `school_details` WRITE;
/*!40000 ALTER TABLE `school_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `school_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `school_environment`
--

DROP TABLE IF EXISTS `school_environment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `school_environment` (
  `school_id` int(100) DEFAULT NULL,
  `room_name` varchar(200) DEFAULT NULL,
  `availablity` varchar(100) DEFAULT NULL,
  `total_no` int(5) DEFAULT NULL,
  `reno_require` varchar(100) DEFAULT NULL,
  `flooring` varchar(100) DEFAULT NULL,
  `plastering` varchar(100) DEFAULT NULL,
  `waterproofing` varchar(100) DEFAULT NULL,
  `electrification` varchar(100) DEFAULT NULL,
  `plumbing` varchar(100) DEFAULT NULL,
  `blackboard` varchar(100) DEFAULT NULL,
  `wall_mount` varchar(100) DEFAULT NULL,
  `safety_grill` varchar(100) DEFAULT NULL,
  `external_painting` varchar(100) DEFAULT NULL,
  `remarks` varchar(500) DEFAULT NULL,
  KEY `school_id` (`school_id`),
  CONSTRAINT `school_environment_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school_details` (`school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `school_environment`
--

LOCK TABLES `school_environment` WRITE;
/*!40000 ALTER TABLE `school_environment` DISABLE KEYS */;
/*!40000 ALTER TABLE `school_environment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stakeholder`
--

DROP TABLE IF EXISTS `stakeholder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `stakeholder` (
  `stakeholder_name` varchar(200) DEFAULT NULL,
  `total_members` int(8) DEFAULT NULL,
  `meeting_duration` varchar(200) DEFAULT NULL,
  `contact_details` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stakeholder`
--

LOCK TABLES `stakeholder` WRITE;
/*!40000 ALTER TABLE `stakeholder` DISABLE KEYS */;
/*!40000 ALTER TABLE `stakeholder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher_count`
--

DROP TABLE IF EXISTS `teacher_count`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `teacher_count` (
  `school_id` int(100) DEFAULT NULL,
  `male` varchar(20) DEFAULT NULL,
  `female` varchar(20) DEFAULT NULL,
  `fulltime` varchar(20) DEFAULT NULL,
  `total` int(4) DEFAULT NULL,
  KEY `school_id` (`school_id`),
  CONSTRAINT `teacher_count_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school_details` (`school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher_count`
--

LOCK TABLES `teacher_count` WRITE;
/*!40000 ALTER TABLE `teacher_count` DISABLE KEYS */;
/*!40000 ALTER TABLE `teacher_count` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher_details`
--

DROP TABLE IF EXISTS `teacher_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `teacher_details` (
  `school_id` int(100) DEFAULT NULL,
  `designation` varchar(200) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `contact_number` int(12) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  KEY `school_id` (`school_id`),
  CONSTRAINT `teacher_details_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school_details` (`school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher_details`
--

LOCK TABLES `teacher_details` WRITE;
/*!40000 ALTER TABLE `teacher_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `teacher_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'cfw'
--

--
-- Dumping routines for database 'cfw'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-07 15:52:40
