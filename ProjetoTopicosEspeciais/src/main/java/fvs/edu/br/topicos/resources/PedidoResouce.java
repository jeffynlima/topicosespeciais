package fvs.edu.br.topicos.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fvs.edu.br.topicos.domain.Pedido;
import fvs.edu.br.topicos.services.PedidoService;
import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResouce {
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value = "/{id}",
			method = RequestMethod.GET)
	public ResponseEntity<?> find
	(@PathVariable Integer id) throws ObjectNotFoundException{
		Pedido obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
}
