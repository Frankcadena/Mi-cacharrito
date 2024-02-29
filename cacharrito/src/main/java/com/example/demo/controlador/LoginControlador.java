package com.example.demo.controlador;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Login;
import com.example.demo.repositorio.RepositorioLogin;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/ver/e5/")

public class LoginControlador {
	
	@Autowired
	private RepositorioLogin repositorio;
	
	}

	