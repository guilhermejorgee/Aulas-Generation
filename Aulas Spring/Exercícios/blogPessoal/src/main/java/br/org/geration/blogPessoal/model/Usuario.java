package br.org.geration.blogPessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Não é permitido valor nulo neste campo")
	@Size(min = 2, max = 15, message = "Mínimo de caracteres: 2 - Máximo de Caracteres: 100")
	private String nome;
	
	@NotNull(message = "Não é permitido valor nulo neste campo")
	@Size(min = 5, max = 10, message = "Mínimo de caracteres: 5 - Máximo de Caracteres: 10")
	private String usuario;
	
	@NotNull(message = "Não é permitido valor nulo neste campo")
	@Size(min = 5, message = "Mínimo de caracteres: 5")
	private String senha;

	public long getId() {
		return id;
	}
	
	public Usuario() {}
	

	public Usuario(String nome, String usuario, String senha) {
		super();
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}




	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	

}
