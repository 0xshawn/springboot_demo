CREATE TABLE IF NOT EXISTS `address` (
   `address_id　` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
   `user_id` BIGINT UNSIGNED NOT NULL ,
   `province` VARCHAR(30) DEFAULT NULL COMMENT '省份',
     `city`  VARCHAR(30) DEFAULT NULL COMMENT '城市',
     `region`  VARCHAR(30) DEFAULT NULL COMMENT '区域',
     `street`  VARCHAR(30) DEFAULT NULL COMMENT '街道',
     `addressee` VARCHAR(30) DEFAULT NULL COMMENT '收件人',
     `addressee_phone` VARCHAR(255) NULL COMMENT '收件人手机',
   `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`address_id`)
    )
    ENGINE = InnoDB;