create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
departamento varchar(255) not null,
setor varchar(255) not null,
ativo boolean,
primary key (id)
);

create table tb_curso(
id bigint auto_increment,
nome varchar(255) not null,
preco decimal (6,2) not null,
professor varchar(255) not null,
descricao varchar(255),
classificacao decimal(3,2) not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria(id)
);