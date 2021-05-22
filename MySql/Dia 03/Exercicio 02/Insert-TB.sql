use db_pizzaria_legal;

-- Categorias

insert tb_categoria(completo, medio, simples) values(true,false,false);

insert tb_categoria(completo, medio, simples) values(false,true,false);

insert tb_categoria(completo, medio, simples) values(false,false,true);

-- Produtos

insert tb_pizza(pizza, preco, refrigerante, batata, sorvete, categoria_pizza)
 values("Quatro Queijos",70.00,true, true, true, 1);
 
 insert tb_pizza(pizza, preco, refrigerante, batata, sorvete, categoria_pizza)
 values("Quatro Queijos",60.00,true, true, false, 2);
 
 insert tb_pizza(pizza, preco, refrigerante, batata, sorvete, categoria_pizza)
 values("Quatro Queijos",50.00,true, false, false, 3);
 
  insert tb_pizza(pizza, preco, refrigerante, batata, sorvete, categoria_pizza)
 values("Calabresa",60.00,true, true, true, 1);
 
  insert tb_pizza(pizza, preco, refrigerante, batata, sorvete, categoria_pizza)
 values("Calabresa",50.00,true, true, false, 2);
 
   insert tb_pizza(pizza, preco, refrigerante, batata, sorvete, categoria_pizza)
 values("Calabresa",40.00,true, false, false, 3);
 
   insert tb_pizza(pizza, preco, refrigerante, batata, sorvete, categoria_pizza)
 values("Frango com Catupiry",100.00,true, true, true, 1);
 
    insert tb_pizza(pizza, preco, refrigerante, batata, sorvete, categoria_pizza)
 values("Frango com Catupiry",80.00,true, false, false, 3);