package br.org.geration.blogPessoal.secutiry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity //classe de configuração de segurança
public class BasicSecutiryConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetailsService UserDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(UserDetailsService);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/usuarios/logar").permitAll() // Para não exigir token para essa requisição
		.antMatchers("/usuarios/cadastrar").permitAll() // Para não exigir token para essa requisição
		.anyRequest().authenticated() // Para exigir o token para todas as outras requisições
		.and().httpBasic() // Será usado o padrão basic para gerar a chave token
		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) // Aqui é gerado o cookie que criará a sessão, que é do tipo STATELESS, ou seja, ela não fica guardada 
		.and().cors() //Para habilitar o cors (CrossOrigin)
		.and().csrf().disable();
	}
}
