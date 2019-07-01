package br.com.controle.tarefas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.controle.tarefas.repository.TarefaRepository;

@Service
public class TarefaService {

	private TarefaRepository repository;
	
	@Autowired
	public TarefaService(TarefaRepository repository) {
		this.repository = repository;
	}
	
}
