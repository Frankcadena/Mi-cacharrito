package com.example.demo.controlador;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Administrador;
import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.RepositorioAdministrador;


@RestController
@RequestMapping("/ver/e4/")
public class AdministradorControlador {
	
	@Autowired
	private RepositorioAdministrador repositorio;
	
	@GetMapping("/guardar")
	public List<Administrador> guardarAdministrador(){
		Administrador e = new Administrador("frank", "1234");
		this.repositorio.save(e);
		return this.repositorio.findAll();
	}
	@PostMapping("/inicio")
    public boolean iniciarSesion(@RequestBody Administrador administrador) {
        AtomicBoolean permiso = new AtomicBoolean(false);
        List<Administrador> verificar = repositorio.findAll();
        verificar.forEach(elemento -> {
        	if (elemento.getId().equals(administrador.getId()) && elemento.getContraseña().equals(administrador.getContraseña())) {
        		    permiso.set(true);
        		}
        });
        System.out.println(administrador.getId() + " " + administrador.getContraseña());
        return permiso.get();
    }
	
	//@GetMapping("/guardar")
	//public List<Usuario> guardarUsuario(){
	//	Usuario e = new Usuario(123L, "carlos","rubi", 1054543250 , "3215772653" , "28/02/2003");
	//	this.repositorio.save(e);
		
	//	return this.repositorio.findAll();
	//}
	
	//@GetMapping("/cancelar")
	//public String cancelarReserva() {
	//	this.repositorio.deleteById(123L);
		
	//	return "Reserva Cancelada";
	//}
	
//	@GetMapping("/consultar")
	//public List<Usuario>verTodosUsuarios(){
	//	return repositorio.findAll();
	//}
}