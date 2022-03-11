import { Observable } from "rxjs";
import { Imagen } from "../models/imagen";

export interface ClienteServiceInterface {

    getAll(): Promise<Imagen[]>;
}