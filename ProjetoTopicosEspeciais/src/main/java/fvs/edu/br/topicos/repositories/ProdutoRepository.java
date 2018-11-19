package fvs.edu.br.topicos.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fvs.edu.br.topicos.domain.Produto;

@Repository
public interface ProdutoRepository 
extends JpaRepository<Produto, Integer>{

}
