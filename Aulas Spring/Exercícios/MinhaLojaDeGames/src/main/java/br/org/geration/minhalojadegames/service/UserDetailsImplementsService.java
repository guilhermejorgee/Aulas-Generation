package br.org.geration.minhalojadegames.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.org.geration.minhalojadegames.model.Usuario;
import br.org.geration.minhalojadegames.repository.UsuarioRepository;
import br.org.geration.minhalojadegames.security.UserDetailsImplements;

@Service
public class UserDetailsImplementsService implements UserDetailsService {

	@Autowired
	UsuarioRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		
		Optional<Usuario> user = repository.findByUsuario(username);
		
		user.orElseThrow(() -> new UsernameNotFoundException(username + "Not Found"));
		
		
		return user.map(UserDetailsImplements::new).get(); // :: -> função lambda com o objetivo de criar um novo objeto de uma classe
	}
	
	

}
