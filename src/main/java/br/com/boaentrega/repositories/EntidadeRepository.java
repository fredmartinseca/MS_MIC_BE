package br.com.boaentrega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.boaentrega.entities.Entidade;

@Repository
public interface EntidadeRepository extends JpaRepository<Entidade, Long> {

}
