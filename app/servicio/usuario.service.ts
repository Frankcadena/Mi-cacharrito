import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuario } from '../entities/usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  //listar todos los empleados
  private bdURLU = "http://localhost:8080/ver/e1/guardar";

  constructor(private httpClient: HttpClient) {

  }

  //guardar usuario
  private bdURL = "http://localhost:8080/ver/e1/guardarUsuario";
  registrarUsuario(usuarios: Usuario): Observable<Object> {
    return this.httpClient.post(`${this.bdURL}`, usuarios);
  }

  //guardar reserva
 // private bdURLG = "http://localhost:8080/ver/e2/guardar";
 // registrarReserva(usuarios: Usuario): Observable<Object> {
   // return this.httpClient.post(`${this.bdURLG}`, usuarios);
  //}

  ObtenerListaUsuarios(): Observable<Usuario[]> {

    return this.httpClient.get<Usuario[]>(`${this.bdURLU}`);
  }
}