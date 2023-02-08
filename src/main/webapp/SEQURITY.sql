create table tbl_member
(
    userid varchar(50) not null primary key,
    userpw varchar(100) not null,
    username varchar(100) not null,
    regdate DATETIME default CURRENT_TIMESTAMP,
    updatedate DATETIME default CURRENT_TIMESTAMP,
    enabled char(1) default '1'
);
-- Role ¿˙¿Â
create table tbl_member_auth(
    userid varchar(50) not null,
    auth varchar(50) not null,
    constraint fk_member_auth foreign key(userid) references tbl_member(userid)
);

create table persistent_logins 
(
    username varchar(64) not null,
    series varchar(64) primary key,
    token varchar(64) not null,
    last_used timestamp not null
);