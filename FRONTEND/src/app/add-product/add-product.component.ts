import { Component } from '@angular/core';
import { ProductModel } from '../models/product.model';
import { ProductService } from '../services/product.service';
import { Router } from '@angular/router';
import { CategoryModel } from '../models/category.model';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent {
  newProduct : ProductModel = new ProductModel();
  categories! : CategoryModel[];
  newCategory! : CategoryModel;
  newCategoryId! : number;
  constructor(
    private productService :ProductService, private route :Router){
productService.categoriesList().subscribe(c=>{
  this.categories=c;
})
  }
  addProduct() : void{
    // this.newProduct.category = this.categories.find(c=>c.idCategory==this.newCategoryId);
    // this.productService.addProduct(this.newProduct).subscribe(p =>{})
    // this.route.navigate(['products-list']);
  }
  
}
