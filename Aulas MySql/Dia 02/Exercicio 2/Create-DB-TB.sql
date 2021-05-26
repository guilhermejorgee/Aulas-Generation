create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
departamento varchar(255) not null,
preco decimal(6,2) not null,
marca varchar(255) not null,
fornecedor varchar(255) not null,
primary key (id)
);

