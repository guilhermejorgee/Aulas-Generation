create database db_recursoshumanos;

use db_recursoshumanos;

create table tb_funcionaries(
id bigint auto_increment,
nome varchar(255) not null,
genero varchar(255) not null,
departamento varchar(255) not null,
cargo varchar(255) not null,
salario decimal(6,2) not null,
primary key (id)
);

