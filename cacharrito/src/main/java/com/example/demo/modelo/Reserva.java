package com.example.demo.modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservas")

public class Reserva {

		
		@Id
		@Column(name="id_puesto")
		private Long id;
		
		
		@Column(name = "total_pagar", length = 50, nullable = false )
		private Integer total;
		

		@Column(name = "placa", length = 80, nullable = false, unique = true )
		private String placa;
		
		@Column(name = "fecha", length = 100, nullable = false )
		private String fecha;
		
		@Column(name = "destino", length = 100, nullable = false )
		private String destino;
		
		@Column(name = "hora_salida", length = 100, nullable = false )
		private Integer salida;

	
		
		public Reserva() {
			super();
			// TODO Auto-generated constructor stub
		}



		public Reserva(Long id, Integer total, String placa, String fecha, String destino, Integer salida) {
			super();
			this.id = id;
			this.total = total;
			this.placa = placa;
			this.fecha = fecha;
			this.destino = destino;
			this.salida = salida;
		}



		public Long getId() {
			return id;
		}



		public void setId(Long id) {
			this.id = id;
		}



		public Integer getTotal() {
			return total;
		}



		public void setTotal(Integer total) {
			this.total = total;
		}



		public String getPlaca() {
			return placa;
		}



		public void setPlaca(String placa) {
			this.placa = placa;
		}



		public String getFecha() {
			return fecha;
		}



		public void setFecha(String fecha) {
			this.fecha = fecha;
		}



		public String getDestino() {
			return destino;
		}



		public void setDestino(String destino) {
			this.destino = destino;
		}



		public Integer getSalida() {
			return salida;
		}



		public void setSalida(Integer salida) {
			this.salida = salida;
		}
		
		

}
