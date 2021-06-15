package br.org.geration.blogPessoal.controller;

import java.util.List;
//import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.geration.blogPessoal.model.Postagem;
import br.org.geration.blogPessoal.repository.PostagemRepository;

@RestController // Para informar que essa é uma classe controladora
@RequestMapping("/postagens") //Definir a URL que essa classe será acessada
@CrossOrigin("*") //Isso serve para informar que essa classe irá aceitar requisões de qualquer origem
public class PostagemController {
	
	@Autowired // Isso da controle da interface ao spring, então agora posso instaciar ela e utiliza-la
	private PostagemRepository repository;
	
	@GetMapping //Quando houver uma requisição e ela for do tipo Get, vai disparar essa instrução
	public ResponseEntity<List<Postagem>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
		
	
	@GetMapping("/{id}")					//para dizer que essa variavel vai armezar o que foi digitado na url
	public ResponseEntity<Postagem> getByID(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> getByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo)) ;
		
	}
	
	/*	@GetMapping("/{idteste}")								
	public ResponseEntity<Optional<Postagem>> GetbyIdl(@PathVariable long idteste){
		return ResponseEntity.ok(repository.findById(idteste));
	}*/
	
	
	@PostMapping						//Quando eu não vou pegar algo pela URL mas sim pelo corpo da requisição, eu utilizo essa notação 
	public ResponseEntity<Postagem> postPostagem(@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	
	@PutMapping						//Quando eu não vou pegar algo pela URL mas sim pelo corpo da requisição, eu utilizo essa notação 
	public ResponseEntity<Postagem> putPostagem(@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		
		repository.deleteById(id);
		
	}
	
	@GetMapping("/titulo/unico/{titulo}")
	public ResponseEntity<Postagem> findByTitulo(@PathVariable String titulo) {
		return repository.findByTitulo(titulo)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());

	}
	
	
	
	
	
	
	
	
	
	
	

}
