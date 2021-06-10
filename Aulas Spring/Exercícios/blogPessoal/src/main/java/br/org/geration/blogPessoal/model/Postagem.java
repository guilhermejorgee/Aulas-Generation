package br.org.geration.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // Essa classe será uma entidade do jpa.hibernate
@Table(name = "tb_postagem") // Essa classe virará uma tabela
public class Postagem {
	
	@Id // Para dizer que esse atributo se trata do ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Primary Key
	private long id;
	
	@NotNull //Não pode ser valor nulo
	@Size(min = 5, max = 100) //Quantidade de caracteres
	private String titulo;
	
	@NotNull
	@Size(min = 10, max = 500)
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP) //Vai indicar para o jpa que estamos trabalhando com tempo
	private Date date = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	
	public Postagem() {}

	public Postagem(long id, String titulo, String texto, Date date, Tema tema) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.texto = texto;
		this.date = date;
		this.tema = tema;
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	

}
