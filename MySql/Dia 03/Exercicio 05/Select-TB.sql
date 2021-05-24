use db_construindo_a_nossa_vida;

select tb_produto.nome, tb_produto.preco, tb_produto.estoque, tb_produto.descricao, tb_produto.observacao, tb_categoria.departamento, tb_categoria.setor, tb_categoria.ativo from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where preco > 50;

select tb_produto.nome, tb_produto.preco, tb_produto.estoque, tb_produto.descricao, tb_produto.observacao, tb_categoria.departamento, tb_categoria.setor, tb_categoria.ativo from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where preco between 3 and 60;
    
 select tb_produto.nome, tb_produto.preco, tb_produto.estoque, tb_produto.descricao, tb_produto.observacao, tb_categoria.departamento, tb_categoria.setor, tb_categoria.ativo from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where nome like "%c%";   
    
select tb_produto.nome, tb_produto.preco, tb_produto.estoque, tb_produto.descricao, tb_produto.observacao, tb_categoria.departamento, tb_categoria.setor, tb_categoria.ativo from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
    
    select tb_produto.nome, tb_produto.preco, tb_produto.estoque, tb_produto.descricao, tb_produto.observacao, tb_categoria.departamento, tb_categoria.setor, tb_categoria.ativo from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where departamento = "Construção";