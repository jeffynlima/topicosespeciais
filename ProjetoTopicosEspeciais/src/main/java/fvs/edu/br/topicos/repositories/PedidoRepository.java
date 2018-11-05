package fvs.edu.br.topicos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import fvs.edu.br.topicos.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
