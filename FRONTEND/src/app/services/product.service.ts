import { Injectable } from '@angular/core';
import { ProductModel } from '../models/product.model';
import { CategoryModel } from '../models/category.model';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {apiURL} from "../config";
import {AuthService} from "./auth.service";

const httpOptions = {
  headers : new HttpHeaders({
    "content-Type" : 'application/json'
  })
};
@Injectable({
  providedIn: 'root'
})
export class ProductService {
    private apiUrl = "http://localhost:8080/api/product"

  products : ProductModel[];
  product! : ProductModel;
  categories : CategoryModel[];
  category! : CategoryModel;
  constructor(private http : HttpClient, private authService : AuthService){
    this.categories = [];
    this.products = [];
  }
  productList() : Observable<ProductModel[]>{
    return this.http.get<ProductModel[]>(this.apiUrl +"/all");
  }

  addProduct( newProduct : ProductModel) : Observable<ProductModel>{
    return this.http.post<ProductModel>(apiURL +"/product/save", newProduct)
  }

  deleteProduct(id : number) : Observable<Object>{

      return this.http.delete(`${apiURL+"/products/delete"}/${id}`)
  }

 findProduct(id : number): ProductModel |undefined{
    return this.products.find(p=>p.idProduct==id);
  }

  editProduct(id: number) :Observable<ProductModel>{
      return this.http.get<ProductModel>(`${apiURL+"/products"}/${id}`)
  }
   /*editProduct(id : number): ProductModel{
    this.product = this.products.find(p => p.idProduct==id)!;
    return this.product;
  }*/
  updateProduct(product : ProductModel) : Observable<ProductModel>{
   return this.http.put<ProductModel>(apiURL + "/products/update",product);
  }
  categoriesList() : Observable<CategoryModel[]>{
    return this.http.get<CategoryModel[]>(apiURL +"/categories");
  }
  findCategory(id : number): CategoryModel |undefined{
    return this.categories.find(c=>c.idCategory==id);
  }
}

