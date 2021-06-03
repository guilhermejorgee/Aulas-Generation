package br.org.geration.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.geration.farmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByDepartamentoContainingIgnoreCase(String departamento);
	
	public List<Categoria> findAllBySetorContainingIgnoreCase(String setor);

}
