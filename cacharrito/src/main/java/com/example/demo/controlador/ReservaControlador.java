package com.example.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Reserva;
import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.RepositorioReserva;
import com.example.demo.repositorio.RepositorioUsuario;

@RestController
@RequestMapping("/ver/e2/")

public class ReservaControlador {
	@Autowired
	private RepositorioReserva repositorio;
	@Autowired
	private RepositorioUsuario repositorioU;
	
	
	@GetMapping("/guardar")
	public List<Reserva> guardarReserva(){
		
		Optional<Usuario> u = this.repositorioU.findById(123L);
		
		Reserva e = new Reserva("27/05/2023", "bogota" , "10:00 AM" , 300000. 123L, 16);
		this.repositorio.save(e);
		
		return this.repositorio.findAll();
	}
	
	@GetMapping("/cancelar")
	public String cancelarReserva() {
		this.repositorio.deleteById(123L);
		
		return "Reserva Cancelada";
	}
	
	@GetMapping("/consultar")
	public List<Reserva>verTodosReservas(){
		return repositorio.findAll();
	}
	
	
	}