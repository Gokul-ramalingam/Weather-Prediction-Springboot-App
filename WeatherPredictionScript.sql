CREATE DATABASE weather;

USE weather;

create table City_Details(
cityId INT PRIMARY KEY,
city VARCHAR(50) NOT NULL,
state VARCHAR(50) NOT NULL,
clim VARCHAR(50) NOT NULL,
degh INT NOT NULL,
degl INT NOT NULL,
img VARCHAR(100) NOT NULL
);

INSERT INTO City_Details VALUES (1,'Bangalore','Karnataka','Sunny',35,22,'assets/logos/sunny.svg');
INSERT INTO City_Details VALUES (2,'Chennai','Tamil Nadu','Cloudy',33,22,'assets/logos/cloudy.svg');

SELECT * FROM City_Details;

CREATE TABLE Monday(
cityId INT REFERENCES City_Details (cityId),
degree INT NOT NULL,
celsius INT NOT NULL,
image VARCHAR(100) NOT NULL
);

INSERT INTO Monday VALUES(1,32,22,'assets/logos/cloudy.svg');
INSERT INTO Monday VALUES(2,28,22,'assets/logos/thunder.svg');

Select * FROM Monday;

CREATE TABLE Tuesday(
cityId INT REFERENCES City_Details (cityId),
degree INT NOT NULL,
celsius INT NOT NULL,
image VARCHAR(100) NOT NULL
);

INSERT INTO Tuesday VALUES(1,30,22,'assets/logos/humid.svg');
INSERT INTO Tuesday VALUES(2,23,22,'assets/logos/rainy.svg');

Select * FROM Tuesday;

CREATE TABLE Wednesday(
cityId INT REFERENCES City_Details (cityId),
degree INT NOT NULL,
celsius INT NOT NULL,
image VARCHAR(100) NOT NULL
);

INSERT INTO Wednesday VALUES(1,35,22,'assets/logos/sunny.svg');
INSERT INTO Wednesday VALUES(2,30,22,'assets/logos/cloudy.svg');

Select * FROM Wednesday;

CREATE TABLE Thursday(
cityId INT REFERENCES City_Details (cityId),
degree INT NOT NULL,
celsius INT NOT NULL,
image VARCHAR(100) NOT NULL
);

INSERT INTO Thursday VALUES(1,28,22,'assets/logos/thunder.svg');
INSERT INTO Thursday VALUES(2,32,22,'assets/logos/cloudy.svg');

Select * FROM Thursday;

CREATE TABLE Friday(
cityId INT REFERENCES City_Details (cityId),
degree INT NOT NULL,
celsius INT NOT NULL,
image VARCHAR(100) NOT NULL
);

INSERT INTO Friday VALUES(1,31,22,'assets/logos/cloudy.svg');
INSERT INTO Friday VALUES(2,31,22,'assets/logos/cloudy.svg');

Select * FROM Friday;

CREATE TABLE Saturday(
cityId INT REFERENCES City_Details (cityId),
degree INT NOT NULL,
celsius INT NOT NULL,
image VARCHAR(100) NOT NULL
);

INSERT INTO Saturday VALUES(1,23,22,'assets/logos/rainy.svg');
INSERT INTO Saturday VALUES(2,30,22,'assets/logos/humid.svg');

Select * FROM Saturday;

CREATE TABLE Sunday(
cityId INT REFERENCES City_Details (cityId),
degree INT NOT NULL,
celsius INT NOT NULL,
image VARCHAR(100) NOT NULL
);

INSERT INTO Sunday VALUES(1,30,22,'assets/logos/cloudy.svg');
INSERT INTO Sunday VALUES(2,33,22,'assets/logos/sunny.svg');

Select * FROM Sunday;