import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ImagenesComponent } from './imagenes/imagenes.component';

const routes: Routes = [
  {path: 'lista-image ', component: ImagenesComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
