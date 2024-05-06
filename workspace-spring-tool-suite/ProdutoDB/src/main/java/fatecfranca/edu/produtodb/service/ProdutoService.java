package fatecfranca.edu.produtodb.service;
import fatecfranca.edu.produtodb.model.dto.ProdutoDTO;
import fatecfranca.edu.produtodb.model.entity.Produto;
import fatecfranca.edu.produtodb.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProdutoService {
    @Autowired // injeção de dependência
    ProdutoRepository injecao; // poderemos chamar os métodos sem instanciar um objeto


    @PostMapping // estamos adicionando no banco de dados
    public ProdutoDTO createProduto(@RequestBody ProdutoDTO produtoDTO){
        // converte DTO em Entity
        Produto produto = converteDTO(produtoDTO);
        Produto novoProduto = injecao.save(produto);
        // converte novoProduto em novoProdutoDTO
        return converteEntity(novoProduto);
    }

    // converte ProdutoDTO para Produto
    public Produto converteDTO(ProdutoDTO produtoDTO){
        return new Produto(produtoDTO.getId(),
                produtoDTO.getNome(), produtoDTO.getDescricao(),
                produtoDTO.getQtde(), produtoDTO.getPreco());
    }
    // converte Produto para ProdutoDTO
    public ProdutoDTO converteEntity(Produto produto){
        return new ProdutoDTO(produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getQtde(),
                produto.getPreco());
    }
}
