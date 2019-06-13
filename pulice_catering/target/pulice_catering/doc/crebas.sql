/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/6/11 17:30:42                           */
/*==============================================================*/


drop table if exists Account_status;

drop table if exists Acquisition_Methods;

drop table if exists Closing_the_list;

drop table if exists Cost_of_ingredients;

drop table if exists Food_category;

drop table if exists Food_list;

drop table if exists Information_desk;

drop table if exists Inventory_management;

drop table if exists Menu_statistics;

drop table if exists Prepaid_phone_list;

drop table if exists Purchase_audit;

drop table if exists Queue_set;

drop table if exists Raw_material_information;

drop table if exists Reserve_tables_list;

drop table if exists State_of_tables;

drop table if exists Stocktaking_manage;

drop table if exists Stores_information;

drop table if exists TangKou_information;

drop table if exists Temporary_inventory;

drop table if exists asset_information;

drop table if exists connect_message;

drop table if exists discount_coupon;

drop table if exists discount_coupon_record;

drop table if exists expenditure;

drop table if exists headquarters;

drop table if exists income;

drop table if exists kind;

drop table if exists marketing_plan;

drop table if exists member_management;

drop table if exists menu_management;

drop table if exists order_management;

drop table if exists order_status;

drop table if exists other_expenses;

drop table if exists personal_information;

drop table if exists procurement_plan;

drop table if exists promotion;

drop table if exists purchase_note;

drop table if exists queue_state;

drop table if exists queuing_management;

drop table if exists receipts_message;

drop table if exists role;

drop table if exists stock_management;

drop table if exists take_out;

drop table if exists unit;

/*==============================================================*/
/* Table: Account_status                                        */
/*==============================================================*/
create table Account_status
(
   asid                 int auto_increment,
   name                 varchar(20)
);

/*==============================================================*/
/* Table: Acquisition_Methods                                   */
/*==============================================================*/
create table Acquisition_Methods
(
   id                   int not null auto_increment,
   sid                  int,
   picture              varchar(20),
   piid                 int,
   business_hours       varchar(20),
   phone                varchar(20),
   email                varchar(20),
   site                 varchar(20),
   QR_code              varchar(20),
   Acquisition_Methods  varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: Closing_the_list                                      */
/*==============================================================*/
create table Closing_the_list
(
   id                   int not null auto_increment,
   this_time            varchar(20),
   last_time            varchar(20),
   number               varchar(20),
   connect              varchar(20),
   reception            varchar(20),
   remark               varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: Cost_of_ingredients                                   */
/*==============================================================*/
create table Cost_of_ingredients
(
   id                   int not null,
   sid                  int,
   starting_time        varchar(20),
   deadline             varchar(20),
   rmiid                int,
   cost                 double,
   primary key (id)
);

/*==============================================================*/
/* Table: Food_category                                         */
/*==============================================================*/
create table Food_category
(
   fcid                 int not null auto_increment,
   name                 varchar(20),
   primary key (fcid)
);

/*==============================================================*/
/* Table: Food_list                                             */
/*==============================================================*/
create table Food_list
(
   flid                 int not null auto_increment,
   picture              varchar(20),
   name                 varchar(20),
   fcid                 int,
   rmiid                int,
   quantity             double,
   unit                 varchar(20),
   producer             varchar(20),
   phone                varchar(20),
   unit_price           double,
   remark               varchar(20),
   time                 varchar(20),
   primary key (flid)
);

/*==============================================================*/
/* Table: Information_desk                                      */
/*==============================================================*/
create table Information_desk
(
   ldid                 int not null,
   number               varchar(20),
   name                 varchar(20),
   capacity             varchar(20),
   type                 varchar(20),
   location             varchar(20),
   sotid                int,
   primary key (ldid)
);

/*==============================================================*/
/* Table: Inventory_management                                  */
/*==============================================================*/
create table Inventory_management
(
   id                   int not null auto_increment,
   sid                  int,
   data                 varchar(20),
   rmiid                int,
   kid                  int,
   model                varchar(20),
   uid                  int,
   Current_Inventory    varchar(20),
   physical_inventory   varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: Menu_statistics                                       */
/*==============================================================*/
create table Menu_statistics
(
   id                   int not null auto_increment,
   sid                  int,
   mmid                 int,
   time                 double,
   primary key (id)
);

/*==============================================================*/
/* Table: Prepaid_phone_list                                    */
/*==============================================================*/
create table Prepaid_phone_list
(
   id                   int not null auto_increment,
   account_number       varchar(20),
   hid                  int,
   piid                 int,
   phone                varchar(20),
   email                varchar(20),
   site                 varchar(20),
   money                double,
   time                 varchar(20),
   expire               varchar(20),
   asid                 int,
   remark               varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: Purchase_audit                                        */
/*==============================================================*/
create table Purchase_audit
(
   id                   int not null auto_increment,
   serial_number        int,
   time                 varchar(20),
   rmiid                int,
   kid                  int,
   model                varchar(20),
   quantity             double,
   uid                  int,
   total_prices         double,
   way                  varchar(20),
   remark               varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: Queue_set                                             */
/*==============================================================*/
create table Queue_set
(
   d                    int not null auto_increment,
   type                 varchar(20),
   capacity             varchar(20),
   remark               varchar(20),
   update_data          varchar(20),
   primary key (d)
);

/*==============================================================*/
/* Table: Raw_material_information                              */
/*==============================================================*/
create table Raw_material_information
(
   rmiid                int not null auto_increment,
   name                 varchar(20),
   picture              varchar(20),
   kid                  int,
   model                varchar(20),
   unit_price           double,
   uid                  int,
   remark               varchar(20),
   primary key (rmiid)
);

/*==============================================================*/
/* Table: Reserve_tables_list                                   */
/*==============================================================*/
create table Reserve_tables_list
(
   订桌id                 int not null auto_increment,
   number               varchar(20),
   name                 varchar(20),
   people               int,
   reserved             varchar(20),
   order_date           varchar(20),
   scheduled_time       varchar(20),
   qsid                 int,
   remark               varchar(20),
   primary key (订桌id)
);

/*==============================================================*/
/* Table: State_of_tables                                       */
/*==============================================================*/
create table State_of_tables
(
   sotid                int not null auto_increment,
   name                 varchar(20),
   primary key (sotid)
);

/*==============================================================*/
/* Table: Stocktaking_manage                                    */
/*==============================================================*/
create table Stocktaking_manage
(
   id                   int not null auto_increment,
   sid                  int,
   rmiid                int,
   kid                  int,
   model                varchar(20),
   uid                  int,
   Current_Inventory    varchar(20),
   physical_inventory   varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: Stores_information                                    */
/*==============================================================*/
create temporary table Stores_information
(
   sid                  int not null,
   shop_name            varchar(20),
   picture              varchar(20),
   manager              int,
   business_hours       varchar(20),
   phone                varchar(20),
   email                varchar(20),
   shop_site            varchar(20),
   QR_code              varchar(20),
   update_data          varchar(20),
   primary key (sid)
);

/*==============================================================*/
/* Table: TangKou_information                                   */
/*==============================================================*/
create table TangKou_information
(
   id                   int not null auto_increment,
   name                 varchar(20),
   category             varchar(20),
   printer              varchar(20),
   executive_chef       varchar(20),
   remarks              varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: Temporary_inventory                                   */
/*==============================================================*/
create table Temporary_inventory
(
   id                   int not null auto_increment,
   sid                  int,
   rmiid                int,
   kid                  int,
   model                varchar(20),
   unit_price           double,
   uid                  int,
   quantity             double,
   primary key (id)
);

/*==============================================================*/
/* Table: asset_information                                     */
/*==============================================================*/
create table asset_information
(
   id                   int not null auto_increment,
   raw_material         varchar(20),
   kind                 varchar(20),
   specification        varchar(20),
   inventory            double,
   consume              double,
   unit                 varchar(20),
   suggest              varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: connect_message                                       */
/*==============================================================*/
create table connect_message
(
   id                   int not null auto_increment,
   time                 varchar(20),
   way                  varchar(20),
   gathering            double,
   practical_gathering  double,
   heir                 varchar(20),
   accepter             varchar(20),
   "Handover date"      varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: discount_coupon                                       */
/*==============================================================*/
create table discount_coupon
(
   dcid                 int not null auto_increment,
   name                 varchar(20),
   code                 varchar(20),
   money                double,
   "condition"          varchar(20),
   start_time           varchar(20),
   end_time             varchar(20),
   remark               varchar(20),
   scope                varchar(20),
   primary key (dcid)
);

/*==============================================================*/
/* Table: discount_coupon_record                                */
/*==============================================================*/
create table discount_coupon_record
(
   id                   int not null auto_increment,
   hid                  int,
   dcid                 int,
   form                 varchar(20),
   quantity             double,
   minimum              varchar(20),
   maximum              varchar(20),
   time                 varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: expenditure                                           */
/*==============================================================*/
create table expenditure
(
   id                   int not null auto_increment,
   name                 varchar(20),
   money                double,
   remark               varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: headquarters                                          */
/*==============================================================*/
create table headquarters
(
   hid                  int not null auto_increment,
   name                 varchar(20),
   manager              int,
   picture              varchar(20),
   business_hours       varchar(20),
   site                 varchar(20),
   QR_code              varchar(20),
   Administrator        int,
   uptate_data          varchar(20),
   primary key (hid)
);

/*==============================================================*/
/* Table: income                                                */
/*==============================================================*/
create table income
(
   id                   int not null auto_increment,
   name                 varchar(20),
   money                double,
   remark               varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: kind                                                  */
/*==============================================================*/
create table kind
(
   kid                  int not null auto_increment,
   name                 varchar(20),
   primary key (kid)
);

/*==============================================================*/
/* Table: marketing_plan                                        */
/*==============================================================*/
create table marketing_plan
(
   id                   int not null auto_increment,
   time_frame           varchar(20),
   shop                 int,
   cuisine              int,
   category             int,
   afternoon_session    double,
   lateness_session     double,
   festival_afternoon_session double,
   festival_lateness_session double,
   primary key (id)
);

/*==============================================================*/
/* Table: member_management                                     */
/*==============================================================*/
create table member_management
(
   id                   int not null auto_increment,
   head_portrait        varchar(20),
   name                 varchar(20),
   sex                  varchar(20),
   birthday             varchar(20),
   number               varchar(20),
   site                 varchar(20),
   balance              double,
   class                varchar(20),
   remark               varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: menu_management                                       */
/*==============================================================*/
create table menu_management
(
   mmid                 int not null auto_increment,
   flid                 int,
   picture              varchar(20),
   sid                  int,
   remark               varchar(20),
   creation_time        varchar(20),
   primary key (mmid)
);

/*==============================================================*/
/* Table: order_management                                      */
/*==============================================================*/
create table order_management
(
   id                   int not null auto_increment,
   order_reference      varchar(20),
   ldid                 int,
   name                 varchar(20),
   cell_phone_number    char(20),
   greens_name          varchar(20),
   unit_price           double,
   unit                 varchar(20),
   quantity             double,
   prices               double,
   discount_coupon      double,
   time                 varchar(20),
   osid                 int,
   remark               varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: order_status                                          */
/*==============================================================*/
create table order_status
(
   osid                 int not null auto_increment,
   name                 varchar(20),
   primary key (osid)
);

/*==============================================================*/
/* Table: other_expenses                                        */
/*==============================================================*/
create table other_expenses
(
   id                   int not null auto_increment,
   sid                  int,
   starting_time        varchar(20),
   deadline             varchar(20),
   rmiid                int,
   cost                 varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: personal_information                                  */
/*==============================================================*/
create table personal_information
(
   piid                 int not null auto_increment,
   company              varchar(20),
   department           varchar(20),
   hid                  int,
   sid                  int,
   name                 varchar(20),
   username             varchar(20),
   psd                  varchar(20),
   email                varchar(20),
   电话                   varchar(20),
   phone                varchar(20),
   remark               varchar(20),
   user                 varchar(20),
   role                 varchar(20),
   last_time            varchar(20),
   primary key (piid)
);

/*==============================================================*/
/* Table: procurement_plan                                      */
/*==============================================================*/
create table procurement_plan
(
   id                   int not null auto_increment,
   time                 varchar(20),
   rmiid                int,
   kid                  int,
   unit_price           double,
   uid                  int,
   inventory            double,
   suggest              double,
   plan                 double,
   primary key (id)
);

/*==============================================================*/
/* Table: promotion                                             */
/*==============================================================*/
create table promotion
(
   id                   int not null auto_increment,
   name                 varchar(20),
   class                varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: purchase_note                                         */
/*==============================================================*/
create table purchase_note
(
   id                   int not null auto_increment,
   state                int,
   serial_number        varchar(20),
   data                 varchar(20),
   rmiid                int,
   kid                  int,
   model                varchar(20),
   quantity             double,
   uid                  int,
   total_prices         double,
   way                  varchar(20),
   remark               varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: queue_state                                           */
/*==============================================================*/
create table queue_state
(
   qsid                 int not null auto_increment,
   name                 varchar(20),
   primary key (qsid)
);

/*==============================================================*/
/* Table: queuing_management                                    */
/*==============================================================*/
create table queuing_management
(
   id                   int not null auto_increment,
   queue_type           int,
   number               varchar(20),
   name                 varchar(20),
   people               int,
   capacity             varchar(20),
   Desk_type            int,
   data                 varchar(20),
   await_number         int,
   latency_time         varchar(20),
   qsid                 int,
   remark               varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: receipts_message                                      */
/*==============================================================*/
create table receipts_message
(
   单据id                 int not null auto_increment,
   "serial number"      varchar(20),
   money                double,
   category             varchar(20),
   remark               varchar(20),
   primary key (单据id)
);

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
   id                   int not null auto_increment,
   name                 varchar(20),
   department           int,
   primary key (id)
);

/*==============================================================*/
/* Table: stock_management                                      */
/*==============================================================*/
create table stock_management
(
   id                   int not null auto_increment,
   odd                  varchar(20),
   data                 varchar(20),
   rmiid                int,
   kid                  int,
   uni_uid              int,
   model                varchar(20),
   unit_price           double,
   unit                 int,
   uid                  double,
   total_prices         double,
   remark               varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: take_out                                              */
/*==============================================================*/
create table take_out
(
   id                   int not null auto_increment,
   order_reference      varchar(20),
   name                 varchar(20),
   cell_phone_number    varchar(20),
   greens_name          varchar(20),
   unit_price           double,
   unit                 varchar(20),
   quantity             double,
   prices               double,
   discount_coupon      double,
   time                 varchar(20),
   osid                 int,
   site                 varchar(20),
   remark               varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: unit                                                  */
/*==============================================================*/
create table unit
(
   uid                  int not null auto_increment,
   name                 varchar(20),
   primary key (uid)
);

alter table Acquisition_Methods add constraint FK_Reference_38 foreign key (sid)
      references Stores_information (sid) on delete restrict on update restrict;

alter table Acquisition_Methods add constraint FK_Reference_39 foreign key (piid)
      references personal_information (piid) on delete restrict on update restrict;

alter table Cost_of_ingredients add constraint FK_Reference_31 foreign key (rmiid)
      references Raw_material_information (rmiid) on delete restrict on update restrict;

alter table Cost_of_ingredients add constraint FK_Reference_32 foreign key (sid)
      references Stores_information (sid) on delete restrict on update restrict;

alter table Food_list add constraint FK_Reference_10 foreign key (rmiid)
      references Raw_material_information (rmiid) on delete restrict on update restrict;

alter table Food_list add constraint FK_Reference_9 foreign key (fcid)
      references Food_category (fcid) on delete restrict on update restrict;

alter table Information_desk add constraint FK_Reference_3 foreign key (sotid)
      references State_of_tables (sotid) on delete restrict on update restrict;

alter table Inventory_management add constraint FK_Reference_44 foreign key (rmiid)
      references Raw_material_information (rmiid) on delete restrict on update restrict;

alter table Inventory_management add constraint FK_Reference_45 foreign key (uid)
      references unit (uid) on delete restrict on update restrict;

alter table Inventory_management add constraint FK_Reference_46 foreign key (kid)
      references kind (kid) on delete restrict on update restrict;

alter table Inventory_management add constraint FK_Reference_47 foreign key (sid)
      references Stores_information (sid) on delete restrict on update restrict;

alter table Menu_statistics add constraint FK_Reference_26 foreign key (mmid)
      references menu_management (mmid) on delete restrict on update restrict;

alter table Menu_statistics add constraint FK_Reference_27 foreign key (sid)
      references Stores_information (sid) on delete restrict on update restrict;

alter table Prepaid_phone_list add constraint FK_Reference_15 foreign key (asid)
      references Account_status (asid) on delete restrict on update restrict;

alter table Prepaid_phone_list add constraint FK_Reference_16 foreign key (hid)
      references headquarters (hid) on delete restrict on update restrict;

alter table Prepaid_phone_list add constraint FK_Reference_17 foreign key (piid)
      references personal_information (piid) on delete restrict on update restrict;

alter table Purchase_audit add constraint FK_Reference_33 foreign key (rmiid)
      references Raw_material_information (rmiid) on delete restrict on update restrict;

alter table Purchase_audit add constraint FK_Reference_34 foreign key (uid)
      references unit (uid) on delete restrict on update restrict;

alter table Purchase_audit add constraint FK_Reference_35 foreign key (kid)
      references kind (kid) on delete restrict on update restrict;

alter table Raw_material_information add constraint FK_Reference_11 foreign key (kid)
      references kind (kid) on delete restrict on update restrict;

alter table Raw_material_information add constraint FK_Reference_12 foreign key (uid)
      references unit (uid) on delete restrict on update restrict;

alter table Reserve_tables_list add constraint FK_Reference_7 foreign key (qsid)
      references queue_state (qsid) on delete restrict on update restrict;

alter table Stocktaking_manage add constraint FK_Reference_48 foreign key (sid)
      references Stores_information (sid) on delete restrict on update restrict;

alter table Stocktaking_manage add constraint FK_Reference_49 foreign key (rmiid)
      references Raw_material_information (rmiid) on delete restrict on update restrict;

alter table Stocktaking_manage add constraint FK_Reference_50 foreign key (uid)
      references unit (uid) on delete restrict on update restrict;

alter table Stocktaking_manage add constraint FK_Reference_51 foreign key (kid)
      references kind (kid) on delete restrict on update restrict;

alter table Temporary_inventory add constraint FK_Reference_40 foreign key (rmiid)
      references Raw_material_information (rmiid) on delete restrict on update restrict;

alter table Temporary_inventory add constraint FK_Reference_41 foreign key (uid)
      references unit (uid) on delete restrict on update restrict;

alter table Temporary_inventory add constraint FK_Reference_42 foreign key (kid)
      references kind (kid) on delete restrict on update restrict;

alter table Temporary_inventory add constraint FK_Reference_43 foreign key (sid)
      references Stores_information (sid) on delete restrict on update restrict;

alter table discount_coupon_record add constraint FK_Reference_24 foreign key (hid)
      references headquarters (hid) on delete restrict on update restrict;

alter table discount_coupon_record add constraint FK_Reference_25 foreign key (dcid)
      references discount_coupon (dcid) on delete restrict on update restrict;

alter table menu_management add constraint FK_Reference_13 foreign key (flid)
      references Food_list (flid) on delete restrict on update restrict;

alter table menu_management add constraint FK_Reference_14 foreign key (sid)
      references Stores_information (sid) on delete restrict on update restrict;

alter table order_management add constraint FK_Reference_4 foreign key (ldid)
      references Information_desk (ldid) on delete restrict on update restrict;

alter table order_management add constraint FK_Reference_5 foreign key (osid)
      references order_status (osid) on delete restrict on update restrict;

alter table other_expenses add constraint FK_Reference_52 foreign key (sid)
      references Stores_information (sid) on delete restrict on update restrict;

alter table other_expenses add constraint FK_Reference_53 foreign key (rmiid)
      references Raw_material_information (rmiid) on delete restrict on update restrict;

alter table personal_information add constraint FK_Reference_1 foreign key (sid)
      references Stores_information (sid) on delete restrict on update restrict;

alter table personal_information add constraint FK_Reference_2 foreign key (hid)
      references headquarters (hid) on delete restrict on update restrict;

alter table procurement_plan add constraint FK_Reference_28 foreign key (rmiid)
      references Raw_material_information (rmiid) on delete restrict on update restrict;

alter table procurement_plan add constraint FK_Reference_29 foreign key (uid)
      references unit (uid) on delete restrict on update restrict;

alter table procurement_plan add constraint FK_Reference_30 foreign key (kid)
      references kind (kid) on delete restrict on update restrict;

alter table purchase_note add constraint FK_Reference_21 foreign key (rmiid)
      references Raw_material_information (rmiid) on delete restrict on update restrict;

alter table purchase_note add constraint FK_Reference_22 foreign key (uid)
      references unit (uid) on delete restrict on update restrict;

alter table purchase_note add constraint FK_Reference_23 foreign key (kid)
      references kind (kid) on delete restrict on update restrict;

alter table queuing_management add constraint FK_Reference_8 foreign key (qsid)
      references queue_state (qsid) on delete restrict on update restrict;

alter table stock_management add constraint FK_Reference_18 foreign key (rmiid)
      references Raw_material_information (rmiid) on delete restrict on update restrict;

alter table stock_management add constraint FK_Reference_19 foreign key (kid)
      references kind (kid) on delete restrict on update restrict;

alter table stock_management add constraint FK_Reference_20 foreign key (uni_uid)
      references unit (uid) on delete restrict on update restrict;

alter table take_out add constraint FK_Reference_6 foreign key (osid)
      references order_status (osid) on delete restrict on update restrict;

