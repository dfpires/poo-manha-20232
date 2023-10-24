package br.edu.fatecfranca.produtodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.produtodb.model.Produto;
import br.edu.fatecfranca.produtodb.model.ProdutoRepository;

@RestController // classe vai responder pelas requisições REST
@RequestMapping("/produto") // o endpoint será /produto
public class ProdutoController {
	
	// vamos criar um objeto que vai conter todos os métodos
	// de CRUD da classe Produto
	// a criação deste objeto não vai exigir o new, o que caracteriza
	// o conceito de injeção de dependência
	@Autowired
	ProdutoRepository injecao;
	
	// consulta no banco de dados é sempre o verbo GET
	@GetMapping 
	public List<Produto> getProdutos(){
		return injecao.findAll();
	}
	
	// insere no banco de dados é sempre o verbo POST
	// recupera o corpo da requisição e insere no banco
	@PostMapping
	public Produto addProduto(@RequestBody Produto produto) {
		return injecao.save(produto);
	}
}
