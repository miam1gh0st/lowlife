CREATE DATABASE `sc` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;
USE `sc`;

CREATE TABLE student(
	sno char(9) NOT NULL PRIMARY KEY,
	sname char(20) NULL,
	ssex char(2) NULL,
	sage smallint NOT NULL,
	sdept char(50) NULL,
	sno2 varchar(10) NULL
);


CREATE TABLE course(
	cno char(4) NOT NULL PRIMARY KEY,
	cname char(20) NULL,
	cpno char(4) NULL,
	ccredit smallint NULL
);

CREATE TABLE sc(
	sno char(9) NOT NULL,
	cno char(4) NOT NULL,
	grade int NULL,
    PRIMARY KEY(sno, cno),
    foreign key(sno) references student(sno),
    foreign key(cno) references course(cno)
);

