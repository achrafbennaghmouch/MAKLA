import {Component, OnInit} from '@angular/core';
import { ProductModel } from '../models/product.model';
import { ProductService } from '../services/product.service';
import {AuthService} from "../services/auth.service";

@Component({
  selector: 'app-products-list',
  templateUrl: './products-list.component.html',
  styleUrls: ['./products-list.component.css']
})
export class ProductsListComponent implements OnInit{
  products! : ProductModel[];

constructor(private productService : ProductService, public authservice: AuthService){
  //this.products = productService.productList();
}

  ngOnInit(): void {
  this.loadData()
  }
  deleteProduct(product: ProductModel): void{
  let mess : boolean= confirm("Are you sure");
  if(mess)
    this.productService.deleteProduct(product.idProduct!).subscribe(()=>{
      this.loadData();
})
}

loadData(): void{
  this.productService.productList().subscribe(p=>{
    this.products = p;
  })
}
}
