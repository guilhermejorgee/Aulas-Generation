package br.org.geration.minhalojadegames.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.geration.minhalojadegames.model.AutenticacaoLogin;
import br.org.geration.minhalojadegames.model.Usuario;
import br.org.geration.minhalojadegames.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@PostMapping("/logar")
	public ResponseEntity<AutenticacaoLogin> Authentication(@RequestBody Optional<AutenticacaoLogin> user){
		
		return usuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
		
	}
	
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> cadastroUsuario(@RequestBody Usuario user){
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.CadastrarUsuario(user));
	}
	

}
