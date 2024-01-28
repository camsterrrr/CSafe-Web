----------------------------------------------------------------------------------------------------------
DROP SCHEMA IF EXISTS `csafe` ;
CREATE SCHEMA IF NOT EXISTS `csafe` DEFAULT CHARACTER SET utf8 ;
USE `csafe` ;


----------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS `csafe`.`passwordentry` ;

CREATE TABLE IF NOT EXISTS `csafe`.`passwordentry` (
  `passwordentryId` INT NOT NULL,
  `userID` INT NOT NULL,
  `timestampID` INT NOT NULL,
  `entryTitle` VARCHAR(64) NOT NULL,
  `notes` LONGTEXT NULL,
  `plaintextPassword` VARCHAR(255) NULL,
  `url` VARCHAR(255) NULL,
  `username` VARCHAR(255) NULL,
  PRIMARY KEY (`passwordentryId`, `userID`, `timestampID`),
  INDEX `fk_password_user_idx` (`userID` ASC) VISIBLE,
  INDEX `fk_password_timestamp1_idx` (`timestampID` ASC) VISIBLE,
  CONSTRAINT `fk_password_user`
    FOREIGN KEY (`userID`)
    REFERENCES `csafe`.`user` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_password_timestamp1`
    FOREIGN KEY (`timestampID`)
    REFERENCES `csafe`.`timestamp` (`timestampId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO passwordentry VALUES(123456, 900001, 900001, 'Gmail', '', 'password123', '', 'example@gmail.com');
INSERT INTO passwordentry VALUES(734561, 888888, 888888, 'YouTube', '', 'letmein!', '', 'example@gmail.com');
INSERT INTO passwordentry VALUES(558761, 654321, 654321, 'Twitch', '', 'qwerty!', '', 'nouser');


----------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS `csafe`.`timestamp` ;

CREATE TABLE IF NOT EXISTS `csafe`.`timestamp` (
  `timestampId` INT NOT NULL,
  `userID` INT NOT NULL,
  `lastAccessed` DATETIME NULL,
  `lastModified` DATETIME NULL,
  `timeCreated` DATETIME NULL,
  PRIMARY KEY (`timestampId`, `userID`),
  INDEX `fk_timestamp_user1_idx` (`userID` ASC) VISIBLE,
  CONSTRAINT `fk_timestamp_user1`
    FOREIGN KEY (`userID`)
    REFERENCES `csafe`.`user` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO timestamp VALUES(900002, 900001, null, null, null);
INSERT INTO timestamp VALUES(888889, 888888, null, null, null);
INSERT INTO timestamp VALUES(654322, 654321, null, null, null);


----------------------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS `csafe`.`user` ;

CREATE TABLE IF NOT EXISTS `csafe`.`user` (
  `userId` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(64) NOT NULL,
  `masterPasswordHash` VARCHAR(64) NOT NULL,
  `phone` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`userId`))
ENGINE = InnoDB;

INSERT INTO user VALUES(900001, 'example1@gamil.com', 'hashed password', '123456');
INSERT INTO user VALUES(888888, 'example2@gamil.com', 'asdfasqwerqwevzxcv', '123456');
INSERT INTO user VALUES(654321, 'example3@gamil.com', 'wjertlhn;hviuasdvpa', '123456');