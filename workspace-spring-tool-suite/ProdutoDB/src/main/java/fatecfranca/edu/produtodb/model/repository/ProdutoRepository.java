package fatecfranca.edu.produtodb.model.repository;

import fatecfranca.edu.produtodb.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // esta interface terá todos os métodos de operação em banco de dados
    // com a tabela Produto, considerando que a chave primária da tabela é um Long
    // aqui estamos herdando métodos para:
    // inserir produto, listar todos os produtos, listar um produto em específico
    // remover produto e atualizar produto
}
