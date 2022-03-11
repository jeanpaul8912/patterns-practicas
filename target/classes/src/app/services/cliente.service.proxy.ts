import { Component, Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Imagen } from "../models/imagen";
import { ImagenService } from "./cliente.service";
import { ClienteServiceInterface } from "./cliente.service.interface";

@Injectable()
export class ClienteServiceProxy implements ClienteServiceInterface{

    private listaImagenes: Imagen[] = null;
    
  constructor(
    private _imagenService: ImagenService
    ) {}

    async getAll(): Promise<Imagen[]> {
        if (this.listaImagenes == null){
            console.log("Ingresa")

            let respuesta = await  this._imagenService.getAll();

            if(respuesta){  
                this.listaImagenes = respuesta;   
                return this.listaImagenes;   
            } else {
                console.log("No hay resultado de imagenes");
            }

            console.log(respuesta);
            console.log("Sale");
            
        } else {
            console.log("No Ingresa")
            return this.listaImagenes;
        }   
    }
}