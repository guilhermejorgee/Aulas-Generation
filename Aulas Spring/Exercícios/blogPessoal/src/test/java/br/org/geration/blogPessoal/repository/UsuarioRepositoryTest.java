package br.org.geration.blogPessoal.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import br.org.geration.blogPessoal.model.Usuario;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	public void start() {
		
		Usuario usuario = new Usuario("Bruna Gomes", "BrunaGomes231","123123");
		
		if(usuarioRepository.findByUsuario("BrunaGomes231").isEmpty()) {
			usuarioRepository.save(usuario);
		}
		
		usuario = new Usuario("Ana Beatriz Teixeira", "AnaBeatrizTeixeira421","512312");
		if(usuarioRepository.findByUsuario("AnaBeatrizTeixeira421").isEmpty()) {
			usuarioRepository.save(usuario);
		}
		
		usuario = new Usuario("Thiago da Rosa", "ThiagodaRosa24","5231652");
		if(usuarioRepository.findByUsuario("ThiagodaRosa24").isEmpty()) {
			usuarioRepository.save(usuario);
		}
		
		usuario = new Usuario("Bianca Costela", "BiancaCostela241","42341245");
		if(usuarioRepository.findByUsuario("BiancaCostela241").isEmpty()) {
			usuarioRepository.save(usuario);
		}
		
		usuarioRepository.save(usuario);
	}
	
	@Test
	public void testFindByUsuario() throws Exception {
		
		Optional<Usuario> usuario = usuarioRepository.findByUsuario("BiancaCostela241");
		
		assertTrue(usuario.get().getUsuario().equals("BiancaCostela241"));
	}
	
	
	
	@AfterAll
	public void end() {
		usuarioRepository.deleteAll();
	}
	
	
}
