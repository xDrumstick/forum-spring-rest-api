package br.com.alura.forum.domain.repository;

import org.springframework.stereotype.Repository;

import br.com.alura.forum.domain.model.Topico;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {

	// retorna o filtro do campo do relacionamento Curso
	List<Topico> findByCursoNomeContaining(String nomeCurso);
	
}
