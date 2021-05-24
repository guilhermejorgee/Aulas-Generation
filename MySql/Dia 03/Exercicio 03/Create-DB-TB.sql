create database db_farmacia_do_bem;
use db_farmacia_do_bem;


create table tb_categoria(
id bigint auto_increment,
departamento varchar(255) not null,
setor varchar(255) not null,
primary key (id)
); 

create table tb_produto(
id bigint auto_increment,
nome varchar(255) not null,
estoque int not null,
preco decimal(5,2) not null,
descricao varchar(255),
primary key (id),
categoria_id bigint not null,
foreign key (categoria_id) references tb_categoria(id)
);




