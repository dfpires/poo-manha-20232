package br.edu.fatecfranca.produtodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.fatecfranca.produtodb.model.dto.ProdutoDto;
import br.edu.fatecfranca.produtodb.model.entity.Produto;
import br.edu.fatecfranca.produtodb.repository.ProdutoRepository;

@Service
public class ProdutoService {
	// vamos criar um objeto que vai conter todos os métodos
	// de CRUD da classe Produto
	// a criação deste objeto não vai exigir o new, o que caracteriza
	// o conceito de injeção de dependência
	@Autowired
	ProdutoRepository injecao;
		
	// consulta no banco de dados é sempre o verbo GET
	@GetMapping 
	public List<ProdutoDto> getProdutos(){
		return injecao.findAll();
	}
		
	// consulta no banco de dados por um produto em específico
	@GetMapping("/{id}")
	public Optional<ProdutoDto> getProduto(@PathVariable Long id) {
		Optional<ProdutoDto> prod =  converteProdutoToDto(injecao.findById(id));
		return prod;
	}
		
	// insere no banco de dados é sempre o verbo POST
	// recupera o corpo da requisição e insere no banco
	@PostMapping
	public ProdutoDto addProduto(@RequestBody ProdutoDto produtoDto) {
		Produto produto = converteDtoToProduto(produtoDto);
		return converteProdutoToDto(injecao.save(produto));
	}
		
	// remove do banco de dados é sempre o verbo DELETE
	@DeleteMapping("/{id}")
	public String removeProduto(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Remoção com sucesso";
	}
		
	// atualiza no banco de dados é sempre com PUT
	@PutMapping()
	public ProdutoDto updateProduto(@RequestBody ProdutoDto produtoDto) {
		// perceba que o save está sendo utilizado na inserção
		// e atualização. Isso porque, caso o produto não
		// tenha id, é pra salvar, caso o produto tenha id,
		// vai atualizar
		Produto produto = converteDtoToProduto(produtoDto);
		return converteProdutoToDto(injecao.save(produto));
	}
	
	public Produto converteDtoToProduto(ProdutoDto dto) {
		Produto produto = new Produto();
		produto.setDescricao(dto.getDescricao());
		produto.setId(dto.getId());
		produto.setNome(dto.getNome());
		produto.setPreco(dto.getPreco());
		produto.setQtde(dto.getQtde());
		return produto;
	}
	
	public ProdutoDto converteProdutoToDto(Produto produto) {
		ProdutoDto dto = new ProdutoDto();
		dto.setDescricao(produto.getDescricao());
		dto.setId(produto.getId());
		dto.setNome(produto.getNome());
		dto.setPreco(produto.getPreco());
		dto.setQtde(produto.getQtde());
		return dto;
	}
}
