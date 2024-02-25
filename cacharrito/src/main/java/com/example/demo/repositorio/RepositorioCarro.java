package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Carro;

public interface RepositorioCarro extends JpaRepository<Carro, Long>{


}