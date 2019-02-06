-- create table product
CREATE TABLE IF NOT EXISTS `product` (
  `product_id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL COMMENT '商品名称',
  `description` VARCHAR(255) NULL COMMENT '描述',
  `price` BIGINT NULL COMMENT '单位为分',
  `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`product_id`),
  UNIQUE INDEX `product_name_uiq` (`name` ASC),
  INDEX `product_price_idx` (`price` ASC))
ENGINE = InnoDB;