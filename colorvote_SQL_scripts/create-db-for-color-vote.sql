DROP SCHEMA IF EXISTS `colorvoteschema`;

CREATE SCHEMA `colorvoteschema`;

use `colorvoteschema`;

DROP TABLE IF EXISTS `colors`;

CREATE TABLE `colors` (
  `id` int NOT NULL AUTO_INCREMENT,
  `color` varchar(45),
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `votes`;

CREATE TABLE `votes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `city` varchar(45),
  `color` varchar(45),
  `votes` int,
  PRIMARY KEY (`id`)
);

INSERT INTO colors VALUES 
  	(1,'red'),
    (2,'orange'),
    (3,'yellow'),
    (4,'green'),
    (5,'blue'),
    (6,'indigo'),
    (7,'violet');

INSERT INTO votes VALUES
  #votetable id city color votes
  (1,'Anchorage','blue',10000),
  (2,'Anchorage','yellow',15000),
  (3,'Brooklyn','red',100000),
  (4,'Brooklyn','blue',250000),
  (5,'Detroit','red',160000),
  (6,'Selma','yellow',15000),
  (7,'Selma','violet',5000);