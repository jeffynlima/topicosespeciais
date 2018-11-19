package fvs.edu.br.topicos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fvs.edu.br.topicos.domain.Cliente;
import fvs.edu.br.topicos.repositories.ClienteRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) 
			throws ObjectNotFoundException{
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
