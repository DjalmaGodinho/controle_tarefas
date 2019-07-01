package br.com.controle.tarefas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.controle.tarefas.service.TarefaService;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

	private TarefaService service;
	
	@Autowired
	public TarefaController(TarefaService service) {
		this.service = service;
	}
	

}
