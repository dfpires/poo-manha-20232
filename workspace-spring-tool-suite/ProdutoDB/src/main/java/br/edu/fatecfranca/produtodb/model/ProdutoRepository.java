package br.edu.fatecfranca.produtodb.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository 
	extends JpaRepository<Produto, Long>{

	// aqui não fazemos nada
	// esta interface vai herdar os métodos de CRUD
	// já associados a classe Produto que criamos
}
