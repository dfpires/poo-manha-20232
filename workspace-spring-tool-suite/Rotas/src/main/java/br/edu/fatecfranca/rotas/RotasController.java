package br.edu.fatecfranca.rotas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagem")
public class RotasController {
	
	
	@GetMapping
	public String boasVindas() {
		return "Seja bem vindo !!!!";
	}
	
	@GetMapping("/{nome}")
	public String boasVindasNome(@PathVariable String nome) {
		return "Seja bem vindo " + nome;
	}
}
