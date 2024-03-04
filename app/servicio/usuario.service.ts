import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuario } from '../entities/usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
 
  private bdURLU = "http://localhost:8080/ver/e1/guardar";

  constructor(private httpClient: HttpClient) {

  }

  //guardar usuario
  private bdURL = "http://localhost:8080/ver/e1/guardarUsuario";
  registrarUsuario(usuario: Usuario): Observable<Object> {
    return this.httpClient.post(`${this.bdURL}`, usuario);
  }


  ObtenerListaUsuarios(): Observable<Usuario[]> {

    return this.httpClient.get<Usuario[]>(`${this.bdURLU}`);
  }
}