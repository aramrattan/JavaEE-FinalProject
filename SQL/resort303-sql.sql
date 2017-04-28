/* Drop everything and recreate/create Database (schema) and use it */
DROP SCHEMA IF EXISTS resort303db;
CREATE SCHEMA resort303db;
USE resort303db;
DROP TABLE IF EXISTS CUSTOMER;
DROP TABLE IF EXISTS ROOM;
DROP TABLE IF EXISTS RESERVATION;
/* Create Customer, Room, Reservation tables */
CREATE TABLE CUSTOMER (
	id int(9) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	fullname varchar(255) NOT NULL,
	email varchar(255) NOT NULL,
	passphrase varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE ROOM (
	id int(9) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	roomname varchar(255) NOT NULL,
	roomdesc varchar(255) NOT NULL,
	roomimage varchar(255) NOT NULL,
	price decimal(16,2) NOT NULL
);
CREATE TABLE RESERVATION (
	id int(9) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	roomId int(9) NOT NULL,
	startDate int(11) NOT NULL,
	endDate int(11) NOT NULL,
	roomService tinyint(1) NOT NULL,
	miniBar tinyint(1) NOT NULL,
	cardname varchar(255) NOT NULL,
	cc varchar(16) NOT NULL,
	cvv2 varchar(3) NOT NULL,
	exp varchar(4) NOT NULL,
	userId int(9) NOT NULL,
	FOREIGN KEY (userId) REFERENCES CUSTOMER(id)
);
/* Insert default values */
INSERT INTO CUSTOMER (fullname, email, passphrase) VALUES
	("Gordon Stevens", "gsteven5@my.centennialcollege.ca", "mongoose"),
	("Riley Alexander King", "rileyking@devnull.com", "firebasery"),
	("Erik Taylor", "etaylo@devnull.com", "brodoyouevenlift"),
	("Yuning Wang", "yuningwang@devnull.com", "instantclick"),
	("Justine McCabe", "jmccabe@devnull.com", "friendsneverforgotten"),
	("Sherry Hu", "shu@devnull.com", "shanghai"),
	("Thomas Bergersen", "tbergersen@music.com", "threnodyforeurope");
INSERT INTO ROOM (roomname, roomdesc, roomimage, price) VALUES
	("Governor", "A beautiful room ready for your perfect getaway.", "room1", 199.00),
	("Overnight Student", "Includes a desk, ready for work and play.", "room2", 77.00),
	("View Master", "An excellent view outside is the best reason to get this room.", "room3", 101.10),
	("The Budgetor", "A converted janitorial closet.", "room4", 9.87),
	("Paddedington", "This room has extra padding to ensure a private experience.", "room5", 77.00),
	("Patio Room", "Room has a patio with barbeque.", "room6", 99.99),
	("Greenery", "Environmentally friendly room, without air-conditioning, with potted-plant.", "room7", 199.00),
	("Secret Getaway", "Discrete separate entrance for your discrete meetings.", "room8", 199.00),
	("The International", "This room is decorated to please a Global Citizen.", "room9", 399.00),
	("Made-Man Room", "You have made it in the world of business, now reward yourself!", "room10", 666.66),
	("Majesty", "This room is fit for a King and a Queen for their honeymoon affairs.", "room11", 777.77),
	("Royal", "Our best room, can host up to 11 people in the style of royals.", "room12", 999.99);
INSERT INTO RESERVATION (roomId, startDate, endDate, roomService, miniBar, cardname, cc, cvv2, exp, userId) VALUES
	(2, UNIX_TIMESTAMP('2017-03-21 12:00:00'), UNIX_TIMESTAMP('2017-04-17 12:00:00'), 1, 0, "GORDON STEVENS", "4681432144489992", "777", "0919", 1),
	(1, UNIX_TIMESTAMP('2017-03-20 12:00:00'), UNIX_TIMESTAMP('2017-04-07 12:00:00'), 1, 1, "THOMAS BERGERSEN", "4681439132187452", "192", "0218", 7),
	(9, UNIX_TIMESTAMP('2017-05-20 12:00:00'), UNIX_TIMESTAMP('2017-07-07 12:00:00'), 0, 1, "JUSTINE MCCABE", "4681221382327414", "615", "1218", 5),
	(3, UNIX_TIMESTAMP('2017-03-21 12:00:00'), UNIX_TIMESTAMP('2017-04-17 12:00:00'), 0, 1, "RILEY ALEXANDER KING", "4992453656456877", "999", "1219", 2),
	(5, UNIX_TIMESTAMP('2018-01-20 12:00:00'), UNIX_TIMESTAMP('2018-02-20 12:00:00'), 0, 1, "SHERRY HU", "4689997773332211", "672", "0718", 6);