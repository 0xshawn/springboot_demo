-- create db
create database demo２６ default character set utf8mb4 collate utf8mb4_unicode_ci;

-- create table user
CREATE TABLE IF NOT EXISTS `user` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL COMMENT '商品名称',
  `description` VARCHAR(255) NULL COMMENT '描述',
  `price` BIGINT NULL COMMENT '单位为分',
  `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `user_name_uiq` (`name` ASC),
  INDEX `user_price_idx` (`price` ASC))
ENGINE = InnoDB;