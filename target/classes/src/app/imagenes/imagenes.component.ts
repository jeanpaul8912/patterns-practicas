import { Component, OnInit } from '@angular/core';
import { Imagen } from '../models/imagen';
import { ImagenService } from '../services/cliente.service';
import { ClienteServiceProxy } from '../services/cliente.service.proxy';

@Component({
  selector: 'app-imagenes',
  templateUrl: './imagenes.component.html',
  styleUrls: ['./imagenes.component.css'],
  providers: [ImagenService, ClienteServiceProxy]
})
export class ImagenesComponent implements OnInit {

  public listaImagenes: Imagen[];

  constructor(
    private _imagenService: ImagenService,
    private _clienteServiceProxy: ClienteServiceProxy
    ) {}

  ngOnInit(): void {
  }

  cargarImagenes(){

    this.listaImagenes = null;
    this._clienteServiceProxy.getAll().then(
      res => {
        this.listaImagenes = res;
      }
    );   
  }

  limpiar(){
    this.listaImagenes = null;
  }

}