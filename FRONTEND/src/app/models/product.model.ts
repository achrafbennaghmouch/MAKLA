import { CategoryModel } from "./category.model";

export class Restau {
  id! : number;
  nameRestau ! : string;
  adresseRestau!:string;

}

export class ProductModel{
  idProduct! : number;
  nameProduct! : string;
  priceProduct! : number;
  category! : CategoryModel;
  restau! : Restau
}

/*private Long id;
private String nameRestau;
@OneToMany(mappedBy = "restau")
private List<Product> products;
private String adresseRestau;*/
