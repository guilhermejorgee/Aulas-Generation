package br.org.geration.blogPessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.geration.blogPessoal.model.Postagem;

@Repository //Para informar que é uma classe repositório
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	//T = o tipo de entidade que estamos trabalhando, no caso será postagem
	//ID = o tipo de dado que está sendo usado no ID, no caso o long
	//Long maíusculo, pq é no tipo primitivo, acho que o mesmo principio do Integer
	
	public List<Postagem>  findAllByTituloContainingIgnoreCase (String titulo);
	//retorna uma lista
	//buscar todos pelo Titulo(nome do atributo da entidade) containing(mesma coisa do like")
	//ou seja tudo que conter os caracteres dentro dessa variavel ele vai trazer
	
	public Optional <Postagem> findByTitulo(String titulo);
	
}
