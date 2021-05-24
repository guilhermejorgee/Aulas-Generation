use db_construindo_a_nossa_vida;

-- Categorias
insert into tb_categoria(departamento, setor, ativo)
	values("Pisos e Revestimento", "Porcelanatos", true);

insert into tb_categoria(departamento, setor, ativo)
	values("Eletrodomésticos", "Ventiladores de Teto", false);

insert into tb_categoria(departamento, setor, ativo)
	values("Hidráulica", "Tubos e Conexões", true);
    
insert into tb_categoria(departamento, setor, ativo)
	values("Construção", "Cimentos e Argamassas", true);
    
insert into tb_categoria(departamento, setor, ativo)
	values("Acessórios", "Torneiras", true);
    
-- Produtos
insert into tb_produto(nome, preco, estoque, descricao, observacao, categoria_id)
	values("Pisos e Revestimento", 65.99, 23, "Perfeito para aplicação em ambientes internos", "Envio Imediato", 1);

insert into tb_produto(nome, preco, estoque, descricao, observacao, categoria_id)
	values("Ventilador de Teto com Lustre Ibiza", 159.99, 0, "Perfeito para manter o clima mais agradável e arejado", "Sem fornecedor", 2);
    
 insert into tb_produto(nome, preco, estoque, descricao, observacao, categoria_id)
	values("Válvula de Retenção para Esgoto", 174.49, 50, "Tem como objetivo bloquear o fluxo de água para instalações tubológicas.", "Somente retirada na loja", 3);
    
 insert into tb_produto(nome, preco, estoque, descricao, observacao, categoria_id)
	values("Argamassa Colante", 13.49, 100, "Ideal para assentar cerâmicas", "Disponivel Delivery", 4);

 insert into tb_produto(nome, preco, estoque, descricao, categoria_id)
	values("Torneira de Parede com Purificador", 169.99, 20, "Prática e funcional, água purificada para beber", 5);
    
