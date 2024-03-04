package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="administrador")

public class Administrador {

        @Id
        @Column(name="admin", unique = true)
        private String id;

        @Column(name = "contraseña", length = 50, nullable = false, unique = true )
        private String contraseña;

		public Administrador() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Administrador(String id, String contraseña) {
			super();
			this.id = id;
			this.contraseña = contraseña;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getContraseña() {
			return contraseña;
		}

		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}
        
    }