-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: library
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `bookID` int NOT NULL AUTO_INCREMENT,
  `code` varchar(45) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `publisher` varchar(100) DEFAULT NULL,
  `publishedDate` date DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `categoryID` int DEFAULT NULL,
  PRIMARY KEY (`bookID`),
  UNIQUE KEY `code_UNIQUE` (`code`),
  KEY `categoryID_idx` (`categoryID`),
  CONSTRAINT `categoryID` FOREIGN KEY (`categoryID`) REFERENCES `category` (`categoryID`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'B001','To Kill a Mockingbird','Harper Lee','J.B. Lippincott & Co.','1960-07-11','A novel about the serious issues of rape and racial inequality.',11,1),(2,'B002','1984','George Orwell','Secker & Warburg','1949-06-08','A dystopian social science fiction novel and cautionary tale.',15,1),(3,'B003','Sapiens: A Brief History of Humankind','Yuval Noah Harari','Harvill Secker','2011-09-04','A book about the history of the human species.',12,2),(4,'B004','The Immortal Life of Henrietta Lacks','Rebecca Skloot','Crown Publishing Group','2010-02-02','The story of Henrietta Lacks and the immortal cell line, HeLa.',10,2),(5,'B005','A Brief History of Time','Stephen Hawking','Bantam Books','1988-03-01','An overview of cosmology for the general reader.',8,3),(6,'B006','The Selfish Gene','Richard Dawkins','Oxford University Press','1976-03-01','A book on evolution and the gene-centered view of evolution.',6,3),(7,'B007','The Diary of a Young Girl','Anne Frank','Contact Publishing','1947-06-25','The writings of a Jewish girl hiding during World War II.',12,4),(8,'B008','Guns, Germs, and Steel','Jared Diamond','W.W. Norton & Company','1997-03-01','A book that attempts to explain why Eurasian civilizations have survived and conquered others.',10,4),(9,'B009','Steve Jobs','Walter Isaacson','Simon & Schuster','2011-10-24','The biography of Apple co-founder Steve Jobs.',7,5),(10,'B010','The Diary of a Young Girl','Anne Frank','Contact Publishing','1947-06-25','The writings of a Jewish girl hiding during World War II.',12,4),(11,'B011','The Innovators','Walter Isaacson','Simon & Schuster','2014-10-07','How a group of hackers, geniuses, and geeks created the digital revolution.',6,6),(12,'B012','Hooked: How to Build Habit-Forming Products','Nir Eyal','Portfolio','2014-11-04','A guide to creating products that people can\'t put down.',8,6),(13,'B013','The Art of War','Sun Tzu','Shambhala','2005-11-01','An ancient Chinese military treatise.',20,7),(14,'B014','Ways of Seeing','John Berger','Penguin Books','1972-01-01','A book that explores how we perceive art.',10,7),(15,'B015','The Music of the Primes','Marcus du Sautoy','HarperCollins','2003-04-22','A history of mathematics and the quest to understand prime numbers.',5,8),(16,'B016','Life','Keith Richards','Little, Brown and Company','2010-10-26','An autobiography of Keith Richards, the guitarist of The Rolling Stones.',7,8),(17,'B017','The Great Railway Bazaar','Paul Theroux','Houghton Mifflin','1975-01-01','A travelogue of a train journey through Asia.',10,9),(18,'B018','Into the Wild','Jon Krakauer','Villard','1996-01-13','The story of Christopher McCandless\'s travels in the Alaskan wilderness.',12,9),(19,'B019','How to Win Friends and Influence People','Dale Carnegie','Simon & Schuster','1936-10-01','A self-help book that provides guidance on personal development.',15,10),(20,'B020','The Power of Habit','Charles Duhigg','Random House','2012-02-28','A book that explores the science behind habit formation and change.',10,10);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `categoryID` int NOT NULL AUTO_INCREMENT,
  `code` varchar(45) DEFAULT NULL,
  `categoryName` varchar(100) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`categoryID`),
  UNIQUE KEY `code_UNIQUE` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'C001','Fiction','Books that contain fictional stories'),(2,'C002','Non-Fiction','Books that are based on factual information'),(3,'C003','Science','Books related to science and scientific discoveries'),(4,'C004','History','Books that describe historical events and figures'),(5,'C005','Biography','Books that detail the life stories of individuals'),(6,'C006','Technology','Books about technology and advancements in tech'),(7,'C007','Art','Books about art and artistic expressions'),(8,'C008','Music','Books about music and musicians'),(9,'C009','Travel','Books that describe travel destinations and experiences'),(10,'C010','Self-Help','Books that provide guidance on personal development');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fine`
--

DROP TABLE IF EXISTS `fine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fine` (
  `fineID` int NOT NULL AUTO_INCREMENT,
  `transactionID` int DEFAULT NULL,
  `amount` decimal(10,0) DEFAULT NULL,
  `paid` tinyint DEFAULT NULL,
  PRIMARY KEY (`fineID`),
  KEY `transactionID_idx` (`transactionID`),
  CONSTRAINT `transactionID` FOREIGN KEY (`transactionID`) REFERENCES `transaction` (`transactionID`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fine`
--

LOCK TABLES `fine` WRITE;
/*!40000 ALTER TABLE `fine` DISABLE KEYS */;
INSERT INTO `fine` VALUES (1,1,100,0),(2,3,50,1),(3,5,75,0),(4,7,20,1),(5,9,30,0),(6,11,40,1),(7,13,60,0),(8,15,80,1),(9,17,90,0),(10,18,25,1),(33,1,3940,1);
/*!40000 ALTER TABLE `fine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `memberID` int NOT NULL AUTO_INCREMENT,
  `code` varchar(45) DEFAULT NULL,
  `firstName` varchar(100) DEFAULT NULL,
  `lastName` varchar(100) DEFAULT NULL,
  `phone` varchar(12) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`memberID`),
  UNIQUE KEY `code_UNIQUE` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'M001','John','Doe','1234567890','123 Elm Street'),(2,'M002','Jane','Smith','2345678901','456 Oak Avenue'),(3,'M003','Alice','Johnson','3456789012','789 Pine Road'),(4,'M004','Bob','Brown','4567890123','101 Maple Lane'),(5,'M005','Charlie','Davis','5678901234','202 Birch Boulevard'),(6,'M006','David','Wilson','6789012345','303 Cedar Street'),(7,'M007','Eve','Clark','7890123456','404 Spruce Avenue'),(8,'M008','Frank','Miller','8901234567','505 Chestnut Road'),(9,'M009','Grace','Lee','9012345678','606 Fir Lane'),(10,'M010','Henry','Taylor','0123456789','707 Walnut Street');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transaction` (
  `transactionID` int NOT NULL AUTO_INCREMENT,
  `code` varchar(45) DEFAULT NULL,
  `bookID` int DEFAULT NULL,
  `memberID` int DEFAULT NULL,
  `borrowDate` date DEFAULT NULL,
  `dueDate` date DEFAULT NULL,
  `returnDate` date DEFAULT NULL,
  `fine` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`transactionID`),
  UNIQUE KEY `code_UNIQUE` (`code`),
  KEY `bookID_idx` (`bookID`),
  KEY `memberID_idx` (`memberID`),
  CONSTRAINT `bookID` FOREIGN KEY (`bookID`) REFERENCES `book` (`bookID`),
  CONSTRAINT `memberID` FOREIGN KEY (`memberID`) REFERENCES `member` (`memberID`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` VALUES (1,'T001',1,1,'2024-01-01','2024-01-15','2024-07-30','-1'),(2,'T002',2,1,'2024-01-02','2024-01-16','2024-01-14','0'),(3,'T003',3,2,'2024-02-01','2024-02-15',NULL,NULL),(4,'T004',4,2,'2024-02-03','2024-02-17','2024-02-16','0'),(5,'T005',5,3,'2024-03-01','2024-03-15',NULL,NULL),(6,'T006',6,3,'2024-03-02','2024-03-16','2024-03-14','0'),(7,'T007',7,4,'2024-04-01','2024-04-15',NULL,NULL),(8,'T008',8,4,'2024-04-02','2024-04-16','2024-04-14','0'),(9,'T009',9,5,'2024-05-01','2024-05-15',NULL,NULL),(10,'T010',10,5,'2024-05-02','2024-05-16','2024-05-14','0'),(11,'T011',11,6,'2024-06-01','2024-06-15',NULL,NULL),(12,'T012',12,6,'2024-06-02','2024-06-16','2024-06-14','0'),(13,'T013',13,7,'2024-07-01','2024-07-15',NULL,NULL),(14,'T014',14,7,'2024-07-02','2024-07-16','2024-07-14','0'),(15,'T015',15,8,'2024-08-01','2024-08-15',NULL,NULL),(16,'T016',16,8,'2024-08-02','2024-08-16','2024-08-14','0'),(17,'T017',17,9,'2024-09-01','2024-09-15',NULL,NULL),(18,'T018',18,9,'2024-09-02','2024-09-16','2024-09-14','0');
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `userID` int NOT NULL AUTO_INCREMENT,
  `code` varchar(45) DEFAULT NULL,
  `firstName` varchar(100) DEFAULT NULL,
  `lastName` varchar(100) DEFAULT NULL,
  `userName` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`userID`),
  UNIQUE KEY `code_UNIQUE` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'001','Avishka','Gihan','Admin','abc123'),(2,'002','Kanishka','Gayan','Gayan','abc123'),(3,'003','Hirusha','Costa','Costa','123');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-31 12:53:03
