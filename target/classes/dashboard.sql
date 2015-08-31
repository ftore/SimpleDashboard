CREATE TABLE `board` (
  `boardid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `contents` text,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator` varchar(50) NOT NULL,
  `published` tinyint(1) DEFAULT '1',
  `hits` int(11) DEFAULT '0',
  PRIMARY KEY (`boardid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;