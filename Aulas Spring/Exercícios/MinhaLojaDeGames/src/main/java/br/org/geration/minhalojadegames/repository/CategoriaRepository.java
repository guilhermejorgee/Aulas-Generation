package br.org.geration.minhalojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.geration.minhalojadegames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByCategoriaContainingIgnoreCase(String categoria);

}
