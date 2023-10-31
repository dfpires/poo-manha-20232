package br.edu.fatecfranca.produtodb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	// consulta no banco de dados por um produto em específico
	@GetMapping("/{id}")
	public Optional<Produto> getProduto(@PathVariable Long id) {
		Optional<Produto> prod =  injecao.findById(id);
		return prod;
	}
	
	
	// insere no banco de dados é sempre o verbo POST
	// recupera o corpo da requisição e insere no banco
	@PostMapping
	public Produto addProduto(@RequestBody Produto produto) {
		return injecao.save(produto);
	}
	
	// remove do banco de dados é sempre o verbo DELETE
	@DeleteMapping("/{id}")
	public String removeProduto(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Remoção com sucesso";
	}
	
	// atualiza no banco de dados é sempre com PUT
	@PutMapping()
	public Produto updateProduto(@RequestBody Produto produto) {
		// perceba que o save está sendo utilizado na inserção
		// e atualização. Isso porque, caso o produto não
		// tenha id, é pra salvar, caso o produto tenha id,
		// vai atualizar
		return injecao.save(produto);
	}
}
