package eleicao.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidato implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	private Integer id;
	private String nomeCandidato;
	private Integer numeroCandidato;
	private String siglaPartido;
	
	
	public Candidato() {
		
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNomeCandidato() {
		return nomeCandidato;
	}


	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}


	public Integer getNumeroCandidato() {
		return numeroCandidato;
	}


	public void setNumeroCandidato(Integer numeroCandidato) {
		this.numeroCandidato = numeroCandidato;
	}


	public String getSiglaPartido() {
		return siglaPartido;
	}


	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeCandidato == null) ? 0 : nomeCandidato.hashCode());
		result = prime * result + ((numeroCandidato == null) ? 0 : numeroCandidato.hashCode());
		result = prime * result + ((siglaPartido == null) ? 0 : siglaPartido.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeCandidato == null) {
			if (other.nomeCandidato != null)
				return false;
		} else if (!nomeCandidato.equals(other.nomeCandidato))
			return false;
		if (numeroCandidato == null) {
			if (other.numeroCandidato != null)
				return false;
		} else if (!numeroCandidato.equals(other.numeroCandidato))
			return false;
		if (siglaPartido == null) {
			if (other.siglaPartido != null)
				return false;
		} else if (!siglaPartido.equals(other.siglaPartido))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Candidato [id=" + id + ", nomeCandidato=" + nomeCandidato + ", numeroCandidato=" + numeroCandidato
				+ ", siglaPartido=" + siglaPartido + "]";
	}
	
	
}
