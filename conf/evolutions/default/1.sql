# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table task (
  id                        varchar(255) not null,
  contents                  varchar(255),
  constraint pk_task primary key (id))
;

create sequence task_seq;




# --- !Downs

drop table if exists task cascade;

drop sequence if exists task_seq;

