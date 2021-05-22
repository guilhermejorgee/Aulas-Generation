create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
id bigint auto_increment,
classe varchar(255),
descricao varchar(255),
obrigatorio boolean,
primary key (id) 
);

create table tb_personagens(
id bigint auto_increment,
nome varchar(255),
arma varchar(255),
ataque int,
defesa int,
flexibilidade int,
classe_personagem bigint,
primary key (id),
foreign key (classe_personagem) references tb_classe(id)
);

