use db_farmacia_do_bem;

-- Categorias
insert into tb_categoria(departamento, setor)
	values("Comésticos","Perfumaria");

insert into tb_categoria(departamento, setor)
	values("Comésticos","Maquiagem");    

insert into tb_categoria(departamento, setor)
	values("Comésticos","Cabelos");
    
insert into tb_categoria(departamento, setor)
	values("Drogaria","Antibióticos");
    
insert into tb_categoria(departamento, setor)
	values("Drogaria","Dor e Febre");
    
    
-- Produtos
insert into tb_produto(nome, estoque, preco, descricao, categoria_id)
	values("La Belle Le Parfum Jean Paul Gaultier Eau de Parfum 100ml", 100, 69.99, "Base líquida com acabamento natural luminoso", 1);

insert into tb_produto(nome, estoque, preco, descricao, categoria_id)
	values("Base Líquida Niina Secrets Hidra Glow Cor 30 30ml", 10, 648.90, "Perfume Jean Paul Gaultier feminino oriental gourmand", 2);
    
insert into tb_produto(nome, estoque, preco, descricao, categoria_id)
	values("Nioxin Anti-Hairloss - Sérum Antiqueda 70ml", 40, 249.90, "Sérum de tratamento intensivo para cabelos com queda e afinamento", 3);
    
insert into tb_produto(nome, estoque, preco, descricao, categoria_id)
	values("Ciprofloxacino 500mg", 200, 29.67, "Bloqueiam determinadas enzimas das bactérias", 4);
    
insert into tb_produto(nome, estoque, preco, descricao, categoria_id)
	values("Doril Enxaqueca 18 Comprimidos", 250, 21.99, "fórmula exclusiva, que foi desenvolvida para alívio das enxaquecas", 5);
    
insert into tb_produto(nome, estoque, preco, descricao, categoria_id)
	values("Azitromicina 500mg", 250, 22.49, "antibiótico que age impedindo que as bactérias sensíveis à azitromicina produzam proteínas", 4);  
    
insert into tb_produto(nome, estoque, preco, descricao, categoria_id)
	values("Analgésico Dorflex Uno 1g", 400, 10.56, " potente contra enxaqueca com alta concentração de analgésico", 5);
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    