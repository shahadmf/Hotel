Create database DataBaseForTheHotel;
use DataBaseForTheHotel;
CREATE TABLE admin (
  AD_Username varchar(45) NOT NULL,
  AD_Password varchar(45) NOT NULL,
  PRIMARY KEY (AD_Username)
);


INSERT INTO admin VALUES ('BSH04',3557),
('GH07',3117),('REEM46',0000),
('SHA93',5555),('SHM',1111),('WED',3333);

CREATE TABLE bill (
  Bill_ID int NOT NULL,
  no_Rooms varchar(45) NOT NULL,
  Total_Price int DEFAULT NULL,
  PRIMARY KEY (Bill_ID)
) ;

INSERT INTO bill VALUES (2000,'2',3000),(2100,'1',1500),
(2200,'2',3000),(2300,'3',4500),(2400,'1',2000),
(2500,'2',4000),(2600,'2',6000),(2700,'1',3000);


CREATE TABLE user (
  User_Name varchar(20) NOT NULL,
  name varchar(45) DEFAULT NULL,
  Phone_num varchar(45) DEFAULT NULL,
  Password varchar(45) NOT NULL,
  City varchar(45) NOT NULL,
  PRIMARY KEY (User_Name),
  UNIQUE KEY User_Name_UNIQUE (User_Name)
);


INSERT INTO user VALUES ('AHM','AHMAD','0555555553','4444','RIYADH'),
('ALJ','ALGHALA','0555555554','0000','LONDON'),
('HAD3','SHAHAD','0555555558','5555','DAMMAM'),
('HRB04','BASHAYER','0555555557','3557','KHOBAR'),
('KRY','KAREEM','0555555552','6666','KHOBAR'),
('LEO','LEONIEL','0555555559','3333','LONDON'),
('SAR','SARA','0555555555','7777','DAMMAM');


CREATE TABLE room (
  Room_ID int NOT NULL,
  Room_Type varchar(45) NOT NULL,
  Room_Price varchar(45) NOT NULL,
  PRIMARY KEY (Room_ID)
);


INSERT INTO room VALUES 
(100,'Deluxe','1500'),(110,'Deluxe','1500'),
(120,'Deluxe','1500'),(130,'Family','2000'),
(140,'Family','2000'),(150,'Suite','3000'),
(160,'Suite','3000');

CREATE TABLE reservation (
  Reservation_Id int NOT NULL,
  Description varchar(100) DEFAULT NULL,
  Check_IN_Date date DEFAULT NULL,
  Check_OUT_Date date DEFAULT NULL,
  username varchar(45) DEFAULT NULL,
  Room_ID int DEFAULT NULL,
  PRIMARY KEY (Reservation_Id),
  KEY room_idx (Room_ID),
  KEY user_idx (username),
  CONSTRAINT room FOREIGN KEY (Room_ID) REFERENCES room (Room_ID),
  CONSTRAINT user FOREIGN KEY (username) REFERENCES user (User_Name)
);


INSERT INTO reservation VALUES 
(1110,'Deluxe Twin bed with Rooftop','2021-03-30','2021-04-04','HRB04',100),
(1111,'Deluxe Twin bed with Rooftop','2021-04-29','2021-05-01','HAD3',110),
(1112,'Deluxe Twin bed with Ocean view','2021-04-05','2021-04-10','LEO',120),
(1113,'Deluxe Twin bed with Ocean view','2021-06-06','2021-06-08','KRY',120),
(1114,'Family capacity 4-6 people with ocean balcony','2021-04-15','2021-04-18','ALJ',130),
(1115,'Family capacity 4-6 people with city view','2021-04-26','2021-05-02','AHM',140),
(1116,'Suite capacity 2 people extra large double bed with city view','2021-05-16','2021-05-17','SAR',150),
(1117,'Suite capacity 2 people extra large double bed with ocean view','2021-05-06','2021-05-09','HRB04',160),
(1118,'Family capacity 4-6 people with ocean balcony','2021-06-06','2021-06-09','HRB04',140);

CREATE TABLE bill_reservation (
  Bill_ID int NOT NULL,
  User_Name varchar(40) NOT NULL,
  Reservation_ID int NOT NULL,
  Room_ID int NOT NULL,
  Total_Price int NOT NULL,
  PRIMARY KEY (Bill_ID),
  UNIQUE KEY Reservation_ID (Reservation_ID),
  KEY room_idx (Room_ID)
);

INSERT INTO bill_reservation VALUES 
(1110,'HRB04',2000,100,1500),
 (1111,'HAD3',2001,110,1500),
 (1112,'LEO',2002,170,1500),
 (1113,'KRY',2003,120,1500),
 (1114,'ALJ',2004,130,2000),
 (1115,'AHM',2005,140,2000),
 (1116,'SAR',2006,150,3000),
 (1117,'HRB04',2007,160,3000);









