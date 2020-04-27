CREATE DATABASE  IF NOT EXISTS `player_tracker`;
USE `player_tracker`;


CREATE TABLE IF NOT EXISTS `player_tracker`.`player` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL DEFAULT NULL,
  `last_name` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `birth_Date` DATE NOT NULL,
  `born_place` VARCHAR(70) NOT NULL,
  `address` VARCHAR(70) NOT NULL,
  `nick_Name` VARCHAR(70) NOT NULL,
  `batting_style` VARCHAR(70) NOT NULL,
  `bowling_style` VARCHAR(70) NOT NULL,
  `role` VARCHAR(70) NOT NULL,
  `status` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = latin1


INSERT INTO `player` VALUES 
	('1','Srini','vasan','srini@stallionscc.com','2005-6-04','chennai','kknagar','srini','righthand','rightarm medium','all roundr','1'),
	('2','kishore','kumar','kishore@stallionscc.com','2008-7-05','chennai','medavakkam','ki','rigtharm slow','all roundr','Batesman','0'),
	('3','sarathy','dk','sarathy@stallionscc.com','2012-5-06','cuddalore','tambaram','dk','righthand','left arm spin','all roundr','1'),
	('4','sathiya','st','sathiya@stallionscc.com','2018-4-07','theni','palavarm','st','lefthand','right arem phase','all roundr','1');


create TABLE IF NOT EXISTS `player_tracker`.`tournament` (
  `id` INT(15) NOT NULL AUTO_INCREMENT,
  `tournament_Name` VARCHAR(250) NULL DEFAULT NULL,
  `start_Date` DATE NOT NULL,
  `end_Date` DATE NOT NULL,
  `match_type` VARCHAR(70) NOT NULL,
  `no_Of_Matches` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = latin1

insert INTO `tournament` VALUES 
	(1,'Chennai Super League (SIVET) 2012','2012-6-04','2012-7-05','20/20','8'),
	(2,'MM CHALLENGER TROPHY 2012','2013-6-04','2013-7-05','20/20','7'),
	(3,'TBSCA 2012 (Blue Sky)','2014-6-04','2014-7-05','20/20','5'),
	(4,'Chennai Super League (SIVET) 2012','2015-6-04','2015-7-05','20/20','6');
