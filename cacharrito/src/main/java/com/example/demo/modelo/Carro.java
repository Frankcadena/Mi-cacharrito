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
        private Long placa;

            @Column(name = "cantidad_puesto", length = 100, nullable = false )
            private Integer cantidadPuesto;

            @Column(name = "disponibilidad", length = 100, nullable = false )
            private String disponibilidad;

            public Carro() {
                super();
                // TODO Auto-generated constructor stub
            }

            public Carro(Long placa, Integer cantidadPuesto, String disponibilidad) {
                super();
                this.placa = placa;
                this.cantidadPuesto = cantidadPuesto;
                this.disponibilidad = disponibilidad;
            }

            public Long getPlaca() {
                return placa;
            }

            public void setPlaca(Long placa) {
                this.placa = placa;
            }

            public Integer getCantidadPuesto() {
                return cantidadPuesto;
            }

            public void setCantidadPuesto(Integer cantidadPuesto) {
                this.cantidadPuesto = cantidadPuesto;
            }

            public String getDisponibilidad() {
                return disponibilidad;
            }

            public void setDisponibilidad(String disponibilidad) {
                this.disponibilidad = disponibilidad;
            }


}