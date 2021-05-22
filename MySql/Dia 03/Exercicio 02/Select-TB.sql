use db_pizzaria_legal;

select tb_pizza.pizza, tb_pizza.preco, tb_pizza.refrigerante, tb_pizza.batata, tb_pizza.sorvete, tb_categoria.completo, tb_categoria.medio, tb_categoria.simples from tb_pizza
	inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_pizza where preco > 45;
    
select tb_pizza.pizza, tb_pizza.preco, tb_pizza.refrigerante, tb_pizza.batata, tb_pizza.sorvete, tb_categoria.completo, tb_categoria.medio, tb_categoria.simples from tb_pizza
	inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_pizza where preco between 29 and 60;
    
select tb_pizza.pizza, tb_pizza.preco, tb_pizza.refrigerante, tb_pizza.batata, tb_pizza.sorvete, tb_categoria.completo, tb_categoria.medio, tb_categoria.simples from tb_pizza
	inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_pizza where pizza like "%c%";

select tb_pizza.pizza, tb_pizza.preco, tb_pizza.refrigerante, tb_pizza.batata, tb_pizza.sorvete, tb_categoria.completo, tb_categoria.medio, tb_categoria.simples from tb_pizza
	inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_pizza;
    
select tb_pizza.pizza, tb_pizza.preco, tb_pizza.refrigerante, tb_pizza.batata, tb_pizza.sorvete, tb_categoria.completo, tb_categoria.medio, tb_categoria.simples from tb_pizza
	inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_pizza where completo = true;