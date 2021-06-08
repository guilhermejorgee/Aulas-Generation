package br.org.geration.blogPessoal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.org.geration.blogPessoal.model.Usuario;
import br.org.geration.blogPessoal.repository.UsuarioRepository;
import br.org.geration.blogPessoal.secutiry.UserDetailsImplements;

@Service
public class UserDetailsServiceImplements implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Optional<Usuario> user = userRepository.findByUsuario(userName);
		
		user.orElseThrow(() -> new UsernameNotFoundException(userName + "Not Found"));
		
		return user.map(UserDetailsImplements::new).get();
	}

}
