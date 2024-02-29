package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Login;

@Repository
public interface RepositorioLogin extends JpaRepository<Login, String>{

}