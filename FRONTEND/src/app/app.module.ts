import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductsListComponent } from './products-list/products-list.component';
import { AddProductComponent } from './add-product/add-product.component';
import { EditProductComponent } from './edit-product/edit-product.component';
import {HttpClientModule} from "@angular/common/http";
import { LoginComponent } from './login/login.component';
import { ForbiddenComponent } from './forbidden/forbidden.component';
import { ProductComponent } from './product/product.component';
import { CategorieComponent } from './categorie/categorie.component';
import { AddCategorieComponent } from './add-categorie/add-categorie.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductsListComponent,
    AddProductComponent,
    EditProductComponent,
    LoginComponent,
    ForbiddenComponent,
    ProductComponent,
    CategorieComponent,
    AddCategorieComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
