CREATE TABLE IF NOT EXISTS `order_sku` (
    `id　` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    `order_id` BIGINT UNSIGNED NOT NULL ,
    `sku_id` BIGINT UNSIGNED NOT NULL ,
     `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
   foreign key(`order_id　`) references `order`(`order_id`),
  foreign key(`sku_id　`) references `sku`(`sku_id`)
    )
    ENGINE = InnoDB;