package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Carros")

public class Carro {

        @Id
        @Column(name="numero_placa")
        private Long Id;

        @Column(name = "cantidad_puesto", length = 100, nullable = false )
        private Integer cantidadPuesto;

        @Column(name = "puesto_disponibles", length = 100, nullable = false )
        private Integer disponibilidad;

		public Carro() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Carro(Long id, Integer cantidadPuesto, Integer disponibilidad) {
			super();
			Id = id;
			this.cantidadPuesto = cantidadPuesto;
			this.disponibilidad = disponibilidad;
		}

		public Long getId() {
			return Id;
		}

		public void setId(Long id) {
			Id = id;
		}

		public Integer getCantidadPuesto() {
			return cantidadPuesto;
		}

		public void setCantidadPuesto(Integer cantidadPuesto) {
			this.cantidadPuesto = cantidadPuesto;
		}

		public Integer getDisponibilidad() {
			return disponibilidad;
		}

		public void setDisponibilidad(Integer disponibilidad) {
			this.disponibilidad = disponibilidad;
		}

		
}