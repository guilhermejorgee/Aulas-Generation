use db_cursoDaMinhaVida;

-- Categorias
insert into tb_categoria(departamento, setor, ativo)
	values("Desenvolvimento", "Web", true);
    
insert into tb_categoria(departamento, setor, ativo)
	values("Desenvolvimento", "Mobile", true);
    
insert into tb_categoria(departamento, setor, ativo)
	values("Marketing", "Branding", true);
    
insert into tb_categoria(departamento, setor, ativo)
	values("Marketing", "Digital", true);
    
insert into tb_categoria(departamento, setor, ativo)
	values("Fotografia", "Digital", true);
    
-- Produtos
insert into tb_curso(nome, preco, professor, descricao, classificacao, categoria_id)
	values("Curso Web Moderno Completo", 22.90, "Leonardo", "Maior e mais completo curso de tecnologia do mercado", 4.7, 1);

insert into tb_curso(nome, preco, professor, descricao, classificacao, categoria_id)
	values("Desenvolvimento Android Completo", 22.90, "Jamilton", "Desenvolvimento Android - Aprenda a criar 15 apps", 4.7, 2);

insert into tb_curso(nome, preco, professor, descricao, classificacao, categoria_id)
	values("Branding e Marketing", 22.90, "Laura", "Crie estratégias de Branding para alavancar seu negócio", 4.5, 3);

insert into tb_curso(nome, preco, professor, descricao, classificacao, categoria_id)
	values("Curso Completo de Marketing Digital ", 22.90, "Diego", "Aprenda Marketing Digital para crescer o negócio", 4.6, 4);
    
insert into tb_curso(nome, preco, professor, descricao, classificacao, categoria_id)
	values("Os segredos da edição Lightroom e Photoshop", 27.90, "Helinton", "Editando fotos no Lightroom e Photoshop", 4.4, 5);
    
    