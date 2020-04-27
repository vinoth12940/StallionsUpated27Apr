USE `web_player_tracker`;

CREATE TABLE `tournament` (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `tournament_Name` varchar(250) DEFAULT NULL,
  `start_Date` DATE NOT NULL,
  `end_Date` DATE NOT NULL,
  `no_Of_Matches` varchar(20) NOT NULL,l
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

INSERT INTO `tournament` VALUES 
	(1,'Chennai Super League (SIVET) 2012','2012-6-04','2012-7-05','20/20','8'),
	(2,'MM CHALLENGER TROPHY 2012','2013-6-04','2013-7-05','20/20','7'),
	(3,'TBSCA 2012 (Blue Sky)','2014-6-04','2014-7-05','20/20','5'),
	(4,'Chennai Super League (SIVET) 2012','2015-6-04','2015-7-05','20/20','6');
	
INSERT INTO `player` VALUES 
	('1','Srini','vasan','srini@stallionscc.com','2005-6-04','chennai','kknagar','srini','righthand','rightarm medium','all roundr','active'),
	('2','kishore','kumar','kishore@stallionscc.com','2008-7-05','chennai','medavakkam','righthand','rigtharm slow','all roundr','Srini','active'),
	('3','sarathy','dk','sarathy@stallionscc.com','2012-5-06','cuddalore','tambaram','dk','righthand','left arm spin','all roundr','active'),
	('4','sathiya','st','sathiya@stallionscc.com','2018-4-07','theni','palavarm','st','lefthand','right arem phase','all roundr','in active');	