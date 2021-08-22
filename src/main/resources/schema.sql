create sequence hibernate_sequence start with 1 increment by 1;


create table role (
   oid bigint not null,
description varchar(255),
name varchar(255),
updated_at timestamp,
updated_by varchar(255),
primary key (oid)
);


create table role_cap_x (
   role_oid bigint not null,
role_capabilities_oid bigint not null
);


create table role_capability (
   oid bigint not null,
capability varchar(255),
updated_at timestamp,
updated_by varchar(255),
primary key (oid)
);


create table user (
   oid bigint not null,
email varchar(255),
first_name varchar(255),
hotel_id bigint,
id varchar(255),
is_active boolean not null,
last_name varchar(255),
password varchar(255),
primary key (oid)
);


create table user_hotels (
   oid bigint not null,
primary key (oid)
);


create table user_role_x (
   users_oid bigint not null,
roles_oid bigint not null,
primary key (users_oid, roles_oid)
);


alter table role_cap_x 
   add constraint role_cap 
   foreign key (role_capabilities_oid) 
   references role_capability;


alter table role_cap_x 
   add constraint role_cap1 
   foreign key (role_oid) 
   references role;


alter table user_role_x 
   add constraint user_role 
   foreign key (roles_oid) 
   references role;


alter table user_role_x 
   add constraint user_role1 
   foreign key (users_oid) 
   references user;

   
   
INSERT INTO ROLE(oid,name,updated_At,updated_By,description)  
VALUES(1,'USER',SYSDATE,'3030','USER ROLE');

INSERT INTO ROLE(oid,name,updated_At,updated_By,description)  
VALUES(2,'ADMIN',SYSDATE,'3030','ADMIN ROLE');

INSERT INTO ROLE_CAPABILITY(oid,updated_At,updated_By,capability)
VALUES(1,SYSDATE,'3030','USER_CAPABILITY');

INSERT INTO ROLE_CAPABILITY(oid,updated_At,updated_By,capability)
VALUES(2,SYSDATE,'3030','ADMIN_CAPABILITY');

INSERT INTO ROLE_CAP_X VALUES(1,1);
INSERT INTO ROLE_CAP_X VALUES(2,1);
INSERT INTO ROLE_CAP_X VALUES(2,2);

INSERT INTO USER(oid,id,password,first_Name,last_Name,email,is_Active,hotel_id) VALUES(1,'3030','pass','VENKAT','MADALA','VMADALA@PKGLOBAL.COM',1,1);

INSERT INTO USER_ROLE_X VALUES(1,1);
INSERT INTO USER_ROLE_X VALUES(1,2);