


CREATE TABLE IF NOT EXISTS `cart` (
  `cart_id　` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
   `user_id` BIGINT UNSIGNED NOT NULL ,
`product_id` BIGINT UNSIGNED NOT NULL ,
   `selected_item_count`  int(30) COMMENT '选中的商品总数',
   `total_price` int(30) COMMENT '购物车选中的商品实际总价格',
   `real_toal_price` int(30) COMMENT '购物车选中的商品优惠后的价格',
    `order_count` int(30) COMMENT '购物车中订单数量',
   `select_order_count` int(30) COMMENT '购物车中勾选的订单数量',
     `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`cart_id`),
   foreign key(`user_id　`) references `user`(`user_id`),
  foreign key(`product_id　`) references `product`(`product_id`)
    )
    ENGINE = InnoDB;