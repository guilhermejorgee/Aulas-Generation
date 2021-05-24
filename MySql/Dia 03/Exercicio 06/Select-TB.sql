use db_cursoDaMinhaVida;

select tb_curso.nome, tb_curso.preco, tb_curso.professor, tb_curso.descricao, tb_curso.classificacao, tb_categoria.departamento, tb_categoria.setor, tb_categoria.ativo from tb_curso
	inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id where preco > 50;
    
select tb_curso.nome, tb_curso.preco, tb_curso.professor, tb_curso.descricao, tb_curso.classificacao, tb_categoria.departamento, tb_categoria.setor, tb_categoria.ativo from tb_curso
	inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id where preco between 3 and 60;
    
select tb_curso.nome, tb_curso.preco, tb_curso.professor, tb_curso.descricao, tb_curso.classificacao, tb_categoria.departamento, tb_categoria.setor, tb_categoria.ativo from tb_curso
	inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id where nome like "&j%";
    
select tb_curso.nome, tb_curso.preco, tb_curso.professor, tb_curso.descricao, tb_curso.classificacao, tb_categoria.departamento, tb_categoria.setor, tb_categoria.ativo from tb_curso
	inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id;
    
select tb_curso.nome, tb_curso.preco, tb_curso.professor, tb_curso.descricao, tb_curso.classificacao, tb_categoria.departamento, tb_categoria.setor, tb_categoria.ativo from tb_curso
	inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id where departamento = "Desenvolvimento";