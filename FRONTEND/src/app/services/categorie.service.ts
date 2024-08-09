import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class CategorieService {
  private apiUrl = "http://localhost:8080/api/categories"

  constructor(private http:HttpClient) { }

  getCategorieById(id : number){
    return this.http.get(this.apiUrl+"")
  }
}
