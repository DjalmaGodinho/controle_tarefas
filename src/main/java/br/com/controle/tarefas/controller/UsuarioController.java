package br.com.controle.tarefas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.controle.tarefas.dto.UsuarioDTO;
import br.com.controle.tarefas.handler.ControleTarefasException;
import br.com.controle.tarefas.modal.Usuario;
import br.com.controle.tarefas.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	private UsuarioService service;
	
	@Autowired
	public UsuarioController(UsuarioService service) {
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> listarTodosUsuario(){
		return service.findAllUsuarios();
	}
	
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Usuario incluirNovoUsuario(@RequestBody UsuarioDTO usuarioDTO) throws ControleTarefasException {
		return service.incluirUsuario(usuarioDTO);
	}
	
}
