create database db_cidade_das_frutas;
use db_cidade_das_frutas;

create table tb_categoria(
id bigint auto_increment,
departamento varchar(255) not null,
setor varchar(255) not null,
primary key(id)
);

create table tb_produto(
id bigint auto_increment,
nome varchar(255) not null,
preco decimal(4,2) not null,
estoque int not null,
observacao varchar(255),
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria(id)
);

