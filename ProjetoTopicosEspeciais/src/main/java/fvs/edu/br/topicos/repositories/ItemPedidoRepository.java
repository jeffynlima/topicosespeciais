package fvs.edu.br.topicos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fvs.edu.br.topicos.domain.Pedido;

@Repository
public interface ItemPedidoRepository extends JpaRepository<Pedido, Integer>{

}
