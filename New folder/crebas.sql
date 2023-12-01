/*==============================================================*/
/* DBMS name:      PostgreSQL 9.x                               */
/* Created on:     1/12/2023 11:22:43                           */
/*==============================================================*/


drop table VEHICLE;

drop table VEHICLE_REGISTER;

drop sequence SEQUENCE_1;

drop sequence SEQUENCE_2;

create sequence SEQUENCE_1;

create sequence SEQUENCE_2;

/*==============================================================*/
/* Table: VEHICLE                                               */
/*==============================================================*/
create table VEHICLE (
   VEHICLE_CODE         SERIAL not null,
   VEHICLE_MODEL        VARCHAR(36)          null,
   VEHICLE_YEAR         INT4                 null,
   constraint PK_VEHICLE primary key (VEHICLE_CODE)
);

/*==============================================================*/
/* Table: VEHICLE_REGISTER                                      */
/*==============================================================*/
create table VEHICLE_REGISTER (
   VREG_CODE            SERIAL not null,
   VEHICLE_CODE         INT4                 null,
   VREG_PURCHASE        DATE                 null,
   VREG_COMMENTS        VARCHAR(200)         null,
   constraint PK_VEHICLE_REGISTER primary key (VREG_CODE)
);

alter table VEHICLE_REGISTER
   add constraint FK_VEHICLE__FK_VR_VEH_VEHICLE foreign key (VEHICLE_CODE)
      references VEHICLE (VEHICLE_CODE)
      on delete restrict on update restrict;

