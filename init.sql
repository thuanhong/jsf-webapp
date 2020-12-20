-- create table Menu
-- (
--     id     int auto_increment
--         primary key,
--     kind   varchar(255) null,
--     name   varchar(255) null,
--     price  varchar(255) null,
--     status varchar(255) null
-- );

-- create table Role
-- (
--     id        int auto_increment
--         primary key,
--     role_name varchar(255) null
-- );

-- create table Staff
-- (
--     id         int auto_increment
--         primary key,
--     address    varchar(255) null,
--     create_at  datetime     null,
--     dob        datetime     null,
--     password   varchar(255) null,
--     staff_name varchar(255) null,
--     role_id    int          null,
--     constraint FKc270scukp9o70yt499swxjqah
--         foreign key (role_id) references Role (id)
-- );

-- create table Tables
-- (
--     id       int auto_increment
--         primary key,
--     capacity int          null,
--     position varchar(255) null,
--     status   varchar(255) null
-- );

-- create table Orders
-- (
--     id       varchar(255) not null
--         primary key,
--     createAt datetime     null,
--     total    int          null,
--     staffId  int          null,
--     tableId  int          null,
--     constraint FK5rptbmu9vfvqnnxlo5illw6m6
--         foreign key (tableId) references Tables (id),
--     constraint FKt61u78ynrfvyyf169eyc1iu1r
--         foreign key (staffId) references Staff (id)
-- );

-- create table OrderAndFood
-- (
--     id         int auto_increment
--         primary key,
--     amount     int          null,
--     food_id    int          null,
--     order_id   varchar(255) null,
--     payment_id varchar(255) null,
--     constraint FK3r23napidu4r5j7yejsee97r8
--         foreign key (order_id) references Orders (id),
--     constraint FKojtfirrskrihuuxt5lge8llj
--         foreign key (payment_id) references Orders (id),
--     constraint FKrv4nnkla2v284eh8omflv0jpf
--         foreign key (food_id) references Menu (id)
-- );

-- create table Payment
-- (
--     id       varchar(255) not null
--         primary key,
--     createAt datetime     null,
--     total    int          null,
--     staffId  int          null,
--     tableId  int          null,
--     constraint FKjxiv2g0at8c5n2nlvb3visc9w
--         foreign key (tableId) references Tables (id),
--     constraint FKlfiskfuiuv91tw320gxo58f0q
--         foreign key (staffId) references Staff (id)
-- );




INSERT INTO javawebtutor.Role(id,role_name )  VALUES (1, 'admin');
INSERT INTO javawebtutor.Role(id, role_name)  VALUES (2, 'staff');


INSERT INTO javawebtutor.Staff (id, address, create_at, dob, password, staff_name, role_id) VALUES (1, 'VN', '2020-11-13 20:21:27', '2020-11-13 20:21:29', '1234231', 'thuanhong',1);
INSERT INTO javawebtutor.Staff (id, address, create_at, dob, password, staff_name, role_id) VALUES (2, 'VN', '2020-11-13 20:21:27', '2020-11-13 20:21:29', '1234231', 'taiho',2);


INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (1, 6, 'Floor 2', 0);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (2, 1, 'Floor 2', 1);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (3, 1, 'Floor 2', 0);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (4, 7, 'Floor 3', 1);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (5, 3, 'Floor 3', 1);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (6, 3, 'Floor 3', 0);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (7, 4, 'Floor 3', 1);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (8, 1, 'Floor 1', 0);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (9, 7, 'Floor 3', 0);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (10, 2, 'Floor 3', 0);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (11, 8, 'Floor 3', 1);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (12, 4, 'Floor 3', 0);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (13, 6, 'Floor 2', 1);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (14, 2, 'Floor 3', 1);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (15, 4, 'Floor 2', 1);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (16, 3, 'Floor 3', 0);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (17, 2, 'Floor 1', 1);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (18, 6, 'Floor 2', 0);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (19, 3, 'Floor 3', 0);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (20, 1, 'Floor 3', 1);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (21, 2, 'Floor 2', 1);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (22, 1, 'Floor 2', 0);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (23, 5, 'Floor 3', 0);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (24, 6, 'Floor 3', 1);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (25, 8, 'Floor 3', 1);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (26, 3, 'Floor 2', 0);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (27, 4, 'Floor 1', 1);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (28, 7, 'Floor 1', 0);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (29, 1, 'Floor 3', 1);
INSERT INTO javawebtutor.Tables (id, capacity, position, status) VALUES (30, 1, 'Floor 3', 0);

INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (1, 'food', 'lemon grass', 25, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (2, 'food', 'squash', 40, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (3, 'food', 'lettuce', 36, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (4, 'food', 'sauerkraut', 40, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (5, 'food', 'spinach', 21, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (6, 'food', 'cream cheese', 10, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (7, 'food', 'garlic', 48, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (8, 'food', 'chile peppers', 31, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (9, 'food', 'vanilla bean', 29, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (10, 'food', 'pumpkins', 9, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (11, 'food', 'green onions', 38, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (12, 'food', 'black olives', 12, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (13, 'food', 'unsweetened chocolate', 44, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (14, 'food', 'beans', 39, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (15, 'food', 'anchovy paste', 25, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (16, 'food', 'Romano cheese', 16, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (17, 'food', 'apricots', 15, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (18, 'food', 'walnuts', 18, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (19, 'food', 'cactus', 31, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (20, 'food', 'carrots', 39, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (21, 'drink', 'avocado', 17, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (22, 'drink', 'pomegranate', 6, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (23, 'drink', 'lemon', 29, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (24, 'drink', 'orange', 10, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (25, 'drink', 'peach', 17, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (26, 'drink', 'raspberry', 22, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (27, 'drink', 'Sidecar', 8, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (28, 'drink', 'Whiskey Sour', 9, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (29, 'drink', 'Gin Gimlet', 9, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (30, 'drink', 'El Presidente', 24, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (31, 'drink', 'Electric Lemonade', 29, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (32, 'drink', 'Mai Tai', 10, 1);
INSERT INTO javawebtutor.Menu (id, kind, name, price, status) VALUES (33, 'drink', 'Hurricane', 6, 1);

INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('1 1', '2020-12-26 14:06:53', 100000, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('2 1', '2020-12-26 14:06:53', 9000, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('3 1', '2020-12-26 14:06:53', 77, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('4 1', '2020-11-26 14:06:53', 7777, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('5 1', '2020-5-26 14:06:53', 7777, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('6 1', '2020-5-26 14:06:53', 7777, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('7 1', '2020-7-26 14:06:53', 100, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('8 1', '2020-6-26 14:06:53', 100, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('9 1', '2020-6-26 14:06:53', 100, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('10 1', '2020-7-26 14:06:53', 100, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('11 1', '2020-7-26 14:06:53', 100300, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('12 1', '2020-8-26 14:06:53', 100100, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('13 1', '2020-9-26 14:06:53', 100100, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('14 1', '2020-9-26 14:06:53', 333, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('15 1', '2020-9-26 14:06:53', 333, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('16 1', '2020-10-26 14:06:53', 333, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('17 1', '2020-10-26 14:06:53', 100000, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('18 1', '2020-10-26 14:06:53', 100000, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('19 1', '2020-10-26 14:06:53', 123, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('20 1', '2020-10-26 14:06:53', 100000, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('21 1', '2020-12-26 14:06:53', 333, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('22 1', '2020-7-26 14:06:53', 100000, 1, 8);
INSERT INTO javawebtutor.Orders (id, createAt, total, staffId, tableId) VALUES ('23 1', '2020-6-26 14:06:53', 222, 1, 8);


INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('1', '2020-12-26 14:06:53', 100000, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('2', '2020-12-26 14:06:53', 9000, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('3', '2020-12-26 14:06:53', 77, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('4', '2020-11-26 14:06:53', 7777, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('5', '2020-5-26 14:06:53', 7777, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('6', '2020-5-26 14:06:53', 7777, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('7', '2020-7-26 14:06:53', 100, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('8', '2020-6-26 14:06:53', 100, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('9', '2020-6-26 14:06:53', 100, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('10', '2020-7-26 14:06:53', 100, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('11', '2020-7-26 14:06:53', 100300, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('12', '2020-8-26 14:06:53', 100100, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('13', '2020-9-26 14:06:53', 100100, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('14', '2020-9-26 14:06:53', 333, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('15', '2020-9-26 14:06:53', 333, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('16', '2020-10-26 14:06:53', 333, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('17', '2020-10-26 14:06:53', 100000, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('18', '2020-10-26 14:06:53', 100000, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('19', '2020-10-26 14:06:53', 123, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('20', '2020-10-26 14:06:53', 100000, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('21', '2020-12-26 14:06:53', 333, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('22', '2020-7-26 14:06:53', 100000, 1, 8);
INSERT INTO javawebtutor.Payment (id, createAt, total, staffId, tableId) VALUES ('23', '2020-6-26 14:06:53', 222, 1, 8);







INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 1,'8 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 2, '8 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 3, '8 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 4, '8 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 5, '8 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 6, '8 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 7, '8 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 8, '8 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 9, '8 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 10, '8 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 11, '8 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 12, '8 1');





INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (70, 1,'10 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (70, 2, '10 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (70, 3, '10 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (1700, 4, '10 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (70, 5, '10 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (70, 6, '10 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (70, 7, '10 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 8, '10 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 9, '10 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 10, '10 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 11, '10 1');
INSERT INTO javawebtutor.OrderAndFood (amount, food_id, order_id) VALUES (10, 12, '10 1');