CREATE TABLE `payment` (
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `serial` VARCHAR(200) DEFAULT NULL COMMENT '流水',
  PRIMARY KEY (`id`)
) 