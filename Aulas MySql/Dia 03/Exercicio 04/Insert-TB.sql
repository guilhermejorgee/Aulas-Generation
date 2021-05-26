use db_cidade_das_frutas;

-- Categorias
insert into tb_categoria(departamento, setor)
	values("Hortifruti","Frutas");
    
insert into tb_categoria(departamento, setor)
	values("Hortifruti","Legumes e Verduras");
    
insert into tb_categoria(departamento, setor)
	values("Hortifruti","Ovos");
    
insert into tb_categoria(departamento, setor)
	values("Bebidas","Sucos");
    
insert into tb_categoria(departamento, setor)
	values("Bebidas","Refrigerante");
    
    
-- Produtos    
insert into tb_produto(nome, preco, estoque, observacao, categoria_id)
	values("Abacate - (700g)",5.59, 100, "Fornecedor com problemas logísticos", 1);
    
insert into tb_produto(nome, preco, estoque, categoria_id)
	values("Abobrinha Princesa Kg - (300g)",1.19, 30, 2);
    
insert into tb_produto(nome, preco, estoque, observacao, categoria_id)
	values("Ovos Brancos Pente 30 Un - (UN)",16.90, 240, "Necessita armazenamento especial", 3);

insert into tb_produto(nome, preco, estoque, observacao, categoria_id)
	values("Suco de uva campo largo 1,350 litros - (UN)",11.98, 70, "Necessita refrigeração", 4);

insert into tb_produto(nome, preco, estoque, categoria_id)
	values("Coca Cola 600 ml - (UN)",6.90, 25, 5); 
    
 insert into tb_produto(nome, preco, estoque, categoria_id)
	values("Abacaxi Un - (UN)",9.90, 30, 1);    
    
insert into tb_produto(nome, preco, estoque, categoria_id)
	values("Agrião Un - (UN)",2.59, 20, 2);
    
insert into tb_produto(nome, preco, estoque, observacao, categoria_id)
	values("Ovos de Codorna Cx 30 Unid - (UN)",6.90, 90, "Trocar fornecedor", 3);
    