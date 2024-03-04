package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Carro;
import com.example.demo.repositorio.RepositorioCarro;


@RestController
@RequestMapping("/ver/e3/")
public class CarroControlador {
	
	@Autowired
	private RepositorioCarro repositorio;
	
	
	@GetMapping("/guardar")
	public List<Carro> guardarCarro(){
		Carro e = new Carro(123L,30,8);
		this.repositorio.save(e);
		
		return this.repositorio.findAll();
	}
	
	@GetMapping("/borrar")
	public String borrarCarro() {
		this.repositorio.deleteById(123L);
		
		return "Carro Borrado";
	}
	
	@GetMapping("/consultar")
	public List<Carro>verTodosCarros(){
		return repositorio.findAll();
	}
		
	@GetMapping("/actualizar")
	public Carro actualizarCarro() {
	Carro e= this.repositorio.findById(123L).get();
	e.setDisponibilidad(5);
	this.repositorio.save(e);
	return this.repositorio.findById(123L).get();
}

}