import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { UsuarioComponent } from './usuario/usuario.component';
import { NavegacionComponent } from './navegacion/navegacion.component';



@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, UsuarioComponent, NavegacionComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Cacharrito';
}

