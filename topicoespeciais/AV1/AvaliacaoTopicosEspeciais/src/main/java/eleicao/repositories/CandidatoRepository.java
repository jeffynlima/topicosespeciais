package eleicao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eleicao.domain.Candidato;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Integer>{
	
	

}
