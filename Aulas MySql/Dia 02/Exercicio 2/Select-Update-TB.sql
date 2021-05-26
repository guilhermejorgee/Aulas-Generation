use db_ecommerce;

select * from tb_produtos where preco > 500;

select * from tb_produtos where preco < 500;

update tb_produtos set fornecedor = "Distribuidora LoGs" where id = 3;