CREATE TABLE IF NOT EXISTS `login` (
   `login_id　` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
   `user_id` BIGINT UNSIGNED NOT NULL ,
   `type` TINYINT DEFAULT NULL COMMENT '0-手机,1-网页',
     `password`  VARCHAR(30) NULL COMMENT '密码',
   `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`login_id`),
      foreign key(`user_id　`) references `user`(`user_id`)
    )
    ENGINE = InnoDB;
