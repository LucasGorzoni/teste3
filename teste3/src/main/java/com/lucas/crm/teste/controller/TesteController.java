package com.lucas.crm.teste.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {
	@RequestMapping("/ola")
	public String exibirMensagem() {
		return "Santos Campeão!!!";
	}
}
