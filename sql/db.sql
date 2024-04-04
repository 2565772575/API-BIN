use binapi;

-- 接口信息
create table if not exists binapi.`interface_info`
(
    `id`             bigint                             not null auto_increment comment '主键' primary key,
    `name`           varchar(256)                       not null comment '用户名',
    `description`    varchar(256)                       null comment '用户名',
    `url`            varchar(512)                       not null comment '接口地址',
    `requestParams`  text                               not null comment '请求参数',
    `requestHeader`  text                               not null comment '请求头',
    `responseHeader` text                               not null comment '响应头',
    `method`         varchar(256)                       not null comment '请求类型',
    `userId`         bigint                             not null comment '创建人',
    `status`         int      default 0                 not null comment '接口状态（0-关闭，1-开启）',
    `createTime`     datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `updateTime`     datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `isDeleted`      tinyint  default 0                 not null comment '是否删除(0-未删, 1-已删)'
) comment '接口信息';

insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('蒋嘉懿', '李皓轩', 'www.mitch-shields.org', '薛烨伟', '范越彬', '徐驰', 94, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('余远航', '宋博文', 'www.dodie-sporer.biz', '孙立辉', '武擎宇', '魏鸿煊', 18305050, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('薛思远', '孙浩', 'www.jesus-kreiger.io', '孔越彬', '董子涵', '韩凯瑞', 493, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('吴天磊', '曹文', 'www.deon-collier.co', '王浩轩', '廖鑫磊', '谭智宸', 544889, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('武伟祺', '谢彬', 'www.grover-goldner.io', '田胤祥', '史雨泽', '范致远', 355048688, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('程健雄', '史昊然', 'www.seymour-tremblay.io', '严笑愚', '孔立诚', '韦烨伟', 94058865, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('陈思源', '莫雪松', 'www.kennith-damore.name', '吕晋鹏', '郑潇然', '孔笑愚', 7, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('魏修洁', '姚文轩', 'www.judson-dach.biz', '王瑞霖', '史耀杰', '于瑾瑜', 1085782, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('蒋烨霖', '秦烨华', 'www.nathanial-oconnell.name', '高思聪', '叶越彬', '谢鸿煊', 55, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('陶志泽', '梁文昊', 'www.frieda-rice.org', '郑雪松', '黎博文', '谭晓啸', 27862073, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('汪雨泽', '陶潇然', 'www.priscilla-wiza.name', '林弘文', '冯煜城', '万炎彬', 54591, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('雷晓啸', '傅博文', 'www.anja-pouros.co', '江俊驰', '姚风华', '余越彬', 1, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('郑思源', '金鸿煊', 'www.misha-west.biz', '吕智渊', '林博文', '薛君浩', 62525, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('郝烨霖', '苏峻熙', 'www.jamison-larkin.co', '金皓轩', '阎睿渊', '洪明辉', 8813396050, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('钟昊强', '龚煜城', 'www.stanford-torphy.com', '冯烨伟', '钱梓晨', '赖涛', 455, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('陶胤祥', '蒋昊天', 'www.sibyl-leuschke.name', '武展鹏', '贾哲瀚', '杜健雄', 7088389973, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('石凯瑞', '胡修杰', 'www.percy-marks.biz', '叶文轩', '罗立果', '彭笑愚', 5367, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('董智辉', '邓明杰', 'www.michelle-walsh.info', '黎天宇', '袁子轩', '许乐驹', 70, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('段荣轩', '江凯瑞', 'www.heide-luettgen.name', '邱明', '洪峻熙', '金烨华', 1230, 0);
insert into binapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `method`,
                                     `userId`, `status`)
values ('黄思远', '李健柏', 'www.davis-brakus.com', '李瑾瑜', '萧伟祺', '傅峻熙', 76357961, 0);



CREATE TABLE IF NOT EXISTS binapi.`user_interface_info`
(
    `id`              bigint                             NOT NULL AUTO_INCREMENT COMMENT '主键' primary key,
    `userId`          bigint                             NOT NULL COMMENT '调用用户 id',
    `interfaceInfoId` bigint                             NOT NULL COMMENT '接口 id',
    `totalNum`        int      DEFAULT 0                 NOT NULL COMMENT '总调用次数',
    `leftNum`         int      DEFAULT 0                 NOT NULL COMMENT '剩余调用次数',
    `status`          int      DEFAULT 0                 NOT NULL COMMENT '接口状态（0-关闭，1-开启）',
    `createTime`      datetime DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    `updateTime`      datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `isDeleted`       tinyint  DEFAULT 0                 NOT NULL COMMENT '是否删除(0-未删, 1-已删)'
) COMMENT ='用户调用接口关系';