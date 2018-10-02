package fvs.edu.br.topicos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fvs.edu.br.topicos.domain.Categoria;
import fvs.edu.br.topicos.domain.Produto;
import fvs.edu.br.topicos.repositories.CategoriaRepository;
import fvs.edu.br.topicos.repositories.ProdutoRepository;

@SpringBootApplication
public class ProjetoTopicosEspeciaisApplication implements CommandLineRunner{

	@Autowired
	CategoriaRepository catRepository;
	
	ProdutoRepository prodRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoTopicosEspeciaisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		Produto p1 = new Produto(null, "computador", 2000.00);
		Produto p2 = new Produto(null, "Imprenssora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat1.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		catRepository.saveAll(Arrays.asList(cat1, cat2));
		prodRepository.saveAll(Arrays.asList(p1, p2, p3));
	}
	
	
}
