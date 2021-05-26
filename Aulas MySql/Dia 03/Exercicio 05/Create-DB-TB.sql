create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint auto_increment,
departamento varchar(255) not null,
setor varchar(255) not null,
ativo boolean,
primary key (id)
);

create table tb_produto(
id bigint auto_increment,
nome varchar(255) not null,
preco decimal (6,2) not null,
estoque int not null,
descricao varchar(255),
observacao varchar(255),
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria(id)
);

