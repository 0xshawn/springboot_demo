
CREATE TABLE IF NOT EXISTS `order` (
   `order_id　` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
   `user_id` BIGINT UNSIGNED NOT NULL ,
   `product_id` BIGINT UNSIGNED NOT NULL ,
   `order_no` BIGINT DEFAULT NULL COMMENT '订单号',
   `payment` int(30) DEFAULT NULL COMMENT '实际付款金额,单位是元,保留两位小数',
   `payment_type` int(4)  DEFAULT NULL COMMENT '支付类型,1-在线支付',
   `postage` int(10) DEFAULT NULL COMMENT '运费,单位是元',
   `status` int(10) DEFAULT NULL COMMENT '订单状态:0-已取消,10-未付款,20-已付款,40-已发货,50-交易成功,60-交易关闭',
   `payment_time` DATETIME DEFAULT NULL COMMENT '支付时间',
   `send_time` DATETIME DEFAULT NULL COMMENT '发货时间',
   `end_time` DATETIME DEFAULT NULL COMMENT '交易完成时间',
   `close_time` DATETIME DEFAULT NULL COMMENT '交易关闭时间',
   `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`order_id`),
   foreign key(`user_id　`) references `user`(`user_id`),
  foreign key(`product_id　`) references `product`(`product_id`)
    )
    ENGINE = InnoDB;