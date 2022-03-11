import { Injectable } from "@angular/core";
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';
import { ClienteServiceInterface } from "./cliente.service.interface";

@Injectable()
export class ImagenService implements ClienteServiceInterface {
    
    public url: string = 'https://jsonplaceholder.typicode.com';

    constructor(private _http: HttpClient){}

    async getAll(): Promise<any> {
        return await this._http.get(this.url+'/photos').toPromise();
    }
}