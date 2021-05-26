create database db_escola;
use db_escola;

create table tb_alunes(
id bigint auto_increment,
nome varchar(255) not null,
identificacao bigint not null,
grau varchar(255) not null,
turma int not null,
nota decimal(4,2) not null,
primary key(id)
);  



