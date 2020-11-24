create table Menu
(
    id     int auto_increment
        primary key,
    kind   varchar(255) null,
    name   varchar(255) null,
    price  int          null,
    status tinyint(1)   null
);

create table Staff
(
    id         int auto_increment
        primary key,
    address    varchar(255) null,
    create_at  datetime     null,
    dob        datetime     null,
    password   varchar(255) null,
    staff_name varchar(255) null
);

create table Tables
(
    id       int auto_increment
        primary key,
    capacity int          null,
    position varchar(255) null,
    status   tinyint(1)   null
);

create table Orders
(
    id       int auto_increment
        primary key,
    createAt datetime null,
    total    int      null,
    staffId  int      null,
    tableId  int      null,
    constraint FK5rptbmu9vfvqnnxlo5illw6m6
        foreign key (tableId) references Tables (id),
    constraint FKt61u78ynrfvyyf169eyc1iu1r
        foreign key (staffId) references Staff (id)
);

create table OrderAndFood
(
    id       int auto_increment
        primary key,
    amount   int null,
    food_id  int null,
    order_id int null,
    constraint FK3r23napidu4r5j7yejsee97r8
        foreign key (order_id) references Orders (id),
    constraint FKrv4nnkla2v284eh8omflv0jpf
        foreign key (food_id) references Menu (id)
);

