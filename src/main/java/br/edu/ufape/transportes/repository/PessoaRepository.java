package br.edu.ufape.transportes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.transportes.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
