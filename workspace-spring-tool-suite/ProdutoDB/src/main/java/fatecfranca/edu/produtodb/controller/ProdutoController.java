package fatecfranca.edu.produtodb.controller;

import fatecfranca.edu.produtodb.model.dto.ProdutoDTO;
import fatecfranca.edu.produtodb.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @Autowired
    ProdutoService injecao;

    @PostMapping("/produto")
    public String createProduto(@RequestBody ProdutoDTO produtoDTO){
        return injecao.createProduto(produtoDTO);
    }
}
