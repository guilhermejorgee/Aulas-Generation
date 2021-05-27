package br.org.geration.blogPessoal.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.geration.blogPessoal.model.Postagem;
import br.org.geration.blogPessoal.repository.postagemRepository;

@RestController // Para informar que essa é uma classe controladora
@RequestMapping("/postagens") //Definir a URL que essa classe será acessada
@CrossOrigin("*") //Isso serve para informar que essa classe irá aceitar requisões de qualquer origem
public class PostagemController {
	
	@Autowired // Isso da controle da interface ao spring, então agora posso instaciar ela e utiliza-la
	private postagemRepository repository;
	
	@GetMapping //Quando houver uma requisição e ela for do tipo Get, vai disparar essa instrução
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
		
	
	@GetMapping("/{id}")					//para dizer que essa variavel vai armezar o que foi digitado na url
	public ResponseEntity<Postagem> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo)) ;
		
	}
	
	/*	@GetMapping("/{idteste}")								
	public ResponseEntity<Optional<Postagem>> GetbyIdl(@PathVariable long idteste){
		return ResponseEntity.ok(repository.findById(idteste));
	}*/
	

}
