package com.example.demo.modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservas")

public class Reserva {
	
		@Id	
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idReserva;
		
		@Column(name = "placa", length = 80, nullable = false, unique = true )
		private String placa;
		
		@Column(name = "fecha", length = 100, nullable = false )
		private String fecha;
		
		@Column(name = "destino", length = 100, nullable = false )
		private String destino;
		
		@Column(name = "hora_salida", length = 100, nullable = false )
		private String salida;
		
		@Column(name = "totalpagar", length = 100, nullable = false )
		private String pago;
		
		@Column(name = "pueestodisponibles", length = 100, nullable = false )
		private String puestosdis;
		
		@Column(name = "puestosreservados", length = 100, nullable = false )
		private String puestosreser;
		
		@ManyToOne()
		@JoinColumn(name="id", referencedColumnName="id")
		private Usuario usuario;
		
		@ManyToOne()
		@JoinColumn(name="numero_placa", referencedColumnName="numero_placa")
		private Carro carro;

		public Reserva() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Reserva(Long idReserva, String placa, String fecha, String destino, String salida, String pago,
				String puestosdis, String puestosreser, Usuario usuario, Carro carro) {
			super();
			this.idReserva = idReserva;
			this.placa = placa;
			this.fecha = fecha;
			this.destino = destino;
			this.salida = salida;
			this.pago = pago;
			this.puestosdis = puestosdis;
			this.puestosreser = puestosreser;
			this.usuario = usuario;
			this.carro = carro;
		}

		public Long getIdReserva() {
			return idReserva;
		}

		public void setIdReserva(Long idReserva) {
			this.idReserva = idReserva;
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

		public String getSalida() {
			return salida;
		}

		public void setSalida(String salida) {
			this.salida = salida;
		}

		public String getPago() {
			return pago;
		}

		public void setPago(String pago) {
			this.pago = pago;
		}

		public String getPuestosdis() {
			return puestosdis;
		}

		public void setPuestosdis(String puestosdis) {
			this.puestosdis = puestosdis;
		}

		public String getPuestosreser() {
			return puestosreser;
		}

		public void setPuestosreser(String puestosreser) {
			this.puestosreser = puestosreser;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		public Carro getCarro() {
			return carro;
		}

		public void setCarro(Carro carro) {
			this.carro =carro;
		}	
		
}	
