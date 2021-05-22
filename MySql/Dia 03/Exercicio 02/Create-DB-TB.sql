create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
completo boolean,
medio boolean,
simples boolean,
primary key (id)
);

create table tb_pizza(
id bigint auto_increment,
pizza varchar(255),
preco decimal(5,2),
refrigerante boolean,
batata boolean,
sorvete boolean,
categoria_pizza bigint,
primary key (id),
foreign key (categoria_pizza) references tb_categoria(id) 
);

