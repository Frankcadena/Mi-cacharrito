import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Usuario } from '../entities/usuario';
import { UsuarioService } from '../servicio/usuario.service';
import { RegistroUsuarioComponent } from '../registro-usuario/registro-usuario.component';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-usuario',
  standalone: true,
  imports: [CommonModule,RegistroUsuarioComponent,FormsModule],
  templateUrl: './usuario.component.html',
  styleUrl: './usuario.component.css'
})
export class UsuarioComponent implements OnInit{

  usuarios: Usuario[];
  ngOnInit(): void {
    this.verUsuarios()
    
  }

  constructor(private usuarioServicio: UsuarioService){
    
  }
  
  abrirRegistro(){
    const modal = document.getElementById("registro")
    if(modal != null){
      modal.style.display="block";
    }
  }

  private verUsuarios(){
    this.usuarioServicio.ObtenerListaUsuarios().subscribe(dato=>{
      this.usuarios= dato;
    })
  }
}