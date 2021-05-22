use db_generation_game_online;

-- Classes
insert tb_classe(classe, descricao, obrigatorio)
	values("Linha de Frente", "Proteger seus companheiros através de escudos", true);

insert tb_classe(classe, descricao, obrigatorio)
	values("Dano", "Causar grandes quantidades de dano", true);

insert tb_classe(classe, descricao, obrigatorio)
	values("Suporte", "Oferecem uma ampla gama de utilidades", true);

insert tb_classe(classe, descricao, obrigatorio)
	values("Flanco", "Mobilidade para ajudar em combate", false);  

insert tb_classe(classe, descricao, obrigatorio)
	values("Arqueiro", "Combate em distância média ou longa", false);    
    
    
 -- Personagens
insert tb_personagens(nome, arma, ataque, defesa, flexibilidade, classe_personagem)
	values("Ash", "Canhão de explosão", 1000, 5000, 200, 1);
 
insert tb_personagens(nome, arma, ataque, defesa, flexibilidade, classe_personagem)
	values("Viktor", "Rifle de Assalto", 5000, 500, 350, 2);
    
insert tb_personagens(nome, arma, ataque, defesa, flexibilidade, classe_personagem)
	values("Pip", "Lançador de Poções", 200, 5000, 470, 3);
    
insert tb_personagens(nome, arma, ataque, defesa, flexibilidade, classe_personagem)
	values("Lex", "Magnums", 2200, 750, 3700, 4);

insert tb_personagens(nome, arma, ataque, defesa, flexibilidade, classe_personagem)
	values("Link", "Arco e Flecha", 3500, 200, 2500, 5);

insert tb_personagens(nome, arma, ataque, defesa, flexibilidade, classe_personagem)
	values("Fernando", "Lança-chamas", 1500, 4650, 200, 1);

insert tb_personagens(nome, arma, ataque, defesa, flexibilidade, classe_personagem)
	values("Tiberius", "Chakrams Lâminados", 4500, 700, 400, 2);

insert tb_personagens(nome, arma, ataque, defesa, flexibilidade, classe_personagem)
	values("Ying", "Espelho Ilusória", 100, 4700, 700, 3);

    