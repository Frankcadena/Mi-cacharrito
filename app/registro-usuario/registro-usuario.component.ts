import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Usuario } from '../entities/usuario';
import { UsuarioService } from '../servicio/usuario.service';

@Component({
  selector: 'app-registro-usuario',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './registro-usuario.component.html',
  styleUrl: './registro-usuario.component.css'
})
export class RegistroUsuarioComponent implements OnInit {

  usuario: Usuario = new Usuario;

  obtenerListaUsuarios: any;



  ngOnInit(): void {
    
  }

  constructor(private servicio : UsuarioService){

  }

  abrirRegistro(){
    const modal = document.getElementById("registro")
    if(modal!=null)
      modal.style.display='block';
  }

  cerrarRegistro(){
    const modal = document.getElementById("registro")
    if(modal!=null)
    modal.style.display='none';
  }
  guardarRegistro(){
    this.servicio.registrarUsuario(this.usuario).subscribe(dato => {
      console.log(dato)
      if (dato != null) {
        alert("reserva registrada");
        this.cerrarRegistro();
      }
      else {
        alert("reserva no guardada");
      }
    })

    
  }

}
