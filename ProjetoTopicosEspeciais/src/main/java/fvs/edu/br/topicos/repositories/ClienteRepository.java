package fvs.edu.br.topicos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fvs.edu.br.topicos.domain.Cliente;

@Repository
public interface ClienteRepository 
extends JpaRepository<Cliente, Integer>{

}
