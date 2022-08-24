-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: my_app
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `userdata`
--

DROP TABLE IF EXISTS `userdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userdata` (
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `nid` varchar(45) DEFAULT NULL,
  `birthdate` varchar(45) DEFAULT NULL,
  `bloodgroup` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `usertype` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userdata`
--

LOCK TABLES `userdata` WRITE;
/*!40000 ALTER TABLE `userdata` DISABLE KEYS */;
INSERT INTO `userdata` VALUES ('ABONTIKA DEBNATH','abontika@gmail.com','1234567899912345','14-Feb-2001','O+','01795590811','Rangpur','Donor','Female','120qwe@D'),('Admin','admin@gmail.com','0000000000000','00-Dec-00','O+','00000000000','world','Admin','Male','1234567890'),('Anik dash','anik@email.edu','09876543234567','20-Aug-95','O-','01700000000','Kurigram','Donor','Male','VARCHAR(45)'),('Binty Karmokar','binty@gmail.com','10012809186223','20-May-98','B+','01709876202','Saidpur,Near  Libarty chinema Hall','Donor','Female','Binty9173'),('DEB','deb1@aiub.edu','11111111111111','01-Jun-98','AB-','01900000000','Chittagong','Donner','Male','123'),('DEB','deb2@aiub.edu','11111111111111','01-Jun-98','AB-','01900000000','Chittagong','Donner','Male','123'),('Deboraj roy','deboraj@gmail.com','1234567890987','01-Jan-01','B+','01708119550','Rangpur','Donner','Male','12345'),('Nobonita Saha','nobonita@email.edu','0987654321123','19-Mar-98','B+','01809829292','Kumilla','Donor','Female','120qwe'),('Raghab Roy','raghab@email.net','17293761427','19-Jun-98','AB+','019027439390','Chankharpull,Dhaka','Donor','Male','09876'),('Rahim Mahajon','rahim@mail.net','1357924680123','05-Dec-99','AB+','01800990099','Gibandha','Donor','Male','12345'),('Rakibul Hassan ','rakib@email.com','1701925281098','19-May-97','B-','01925281098','Saidpur, Nilphamary','Donor','Male','Rakib1234'),('SAKIL','salik@aiub.edu','1235346456','04-Jun-96','B-','019000382029','satkhira','Claient','Male','12345'),('shafiul wahild','shafiul@gmail.com','9876543210987','02-Feb-97','AB+','01798377283','Rajshahi','Claient','Male','67890'),('Sukonna Debi','sukonna@email.edu','1234509876476','07-May-98','O+','01508735297','INDIA','Client','Female','09876'),('supria osman','supria@gmail.com','5432167890183','03-Mar-99','A+','01693872638','Bikrampur','Claient','Female','1234'),('wahid','wahid@gmail.com','27492938765634','15-Dec-1997','O+','01734642764','dhaka','Donor','male','12345');
/*!40000 ALTER TABLE `userdata` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-24 19:53:31
