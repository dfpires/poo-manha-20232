package br.edu.fatecfranca.produtodb.model.dto;


public class ProdutoDto {
	private Long id;
	private String nome;
	private String descricao;
	private float preco;
	private int qtde;
	
	public ProdutoDto() {
		
	}
	public ProdutoDto(Long id, String nome, String descricao, float preco, int qtde) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.qtde = qtde;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	
}
