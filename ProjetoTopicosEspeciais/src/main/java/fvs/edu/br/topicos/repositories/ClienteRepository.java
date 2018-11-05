package fvs.edu.br.topicos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import fvs.edu.br.topicos.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
