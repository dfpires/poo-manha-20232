package br.edu.fatecfranca.bomdia;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BomDiaController {
	
	@RequestMapping("/mensagem")
	public String mensagem() {
		return "Bom dia";
	}

	@RequestMapping("/boanoite")
	public String boaNoite() {
		return "Boa noite";
	}
	
}
