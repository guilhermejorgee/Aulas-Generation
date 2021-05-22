use db_generation_game_online;

select tb_personagens.nome, tb_personagens.arma, tb_personagens.ataque, tb_personagens.defesa, tb_personagens.flexibilidade, tb_classe.classe, tb_classe.descricao, tb_classe.obrigatorio from tb_personagens
 inner join tb_classe on tb_classe.id = tb_personagens.classe_personagem
 where ataque > 2000;
 
 select tb_personagens.nome, tb_personagens.arma, tb_personagens.ataque, tb_personagens.defesa, tb_personagens.flexibilidade, tb_classe.classe, tb_classe.descricao, tb_classe.obrigatorio from tb_personagens
 inner join tb_classe on tb_classe.id = tb_personagens.classe_personagem
 where defesa between 1000 and 2000;
 
 select tb_personagens.nome, tb_personagens.arma, tb_personagens.ataque, tb_personagens.defesa, tb_personagens.flexibilidade, tb_classe.classe, tb_classe.descricao, tb_classe.obrigatorio from tb_personagens
 inner join tb_classe on tb_classe.id = tb_personagens.classe_personagem
 where nome like "%c%";
 
 select tb_personagens.nome, tb_personagens.arma, tb_personagens.ataque, tb_personagens.defesa, tb_personagens.flexibilidade, tb_classe.classe, tb_classe.descricao, tb_classe.obrigatorio from tb_personagens
 inner join tb_classe on tb_classe.id = tb_personagens.classe_personagem;
 
 select tb_personagens.nome, tb_personagens.arma, tb_personagens.ataque, tb_personagens.defesa, tb_personagens.flexibilidade, tb_classe.classe, tb_classe.descricao, tb_classe.obrigatorio from tb_personagens
 inner join tb_classe on tb_classe.id = tb_personagens.classe_personagem
 where classe = "Suporte";

