package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.RepositorioUsuario;

@RestController
@RequestMapping("/ver/e1/")

public class UsuarioControlador {

	@Autowired
	private RepositorioUsuario repositorio;
	
	
	@GetMapping("/consultar")
	public List<Usuario>verTodosUsuarios(){
		return repositorio.findAll();
	}
	
}
