import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';

import { HeaderComponent } from './header/header.component';
import { AuthGuard } from './auth.guard';
import { AddProductComponent } from './add-product/add-product.component';
import { ViewProductComponent } from './view-product/view-product.component';
import { ViewCartComponent } from './view-cart/view-cart.component';



const routes: Routes = [
  {
    path: '', component: HomeComponent
  },
  {
    path: 'add-product', component: AddProductComponent
  },
  {
    path: 'view-product', component: ViewProductComponent
  },
  {
    path: 'view-cart', component: ViewCartComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
