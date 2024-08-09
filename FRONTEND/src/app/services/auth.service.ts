import { Injectable } from '@angular/core';
import {UserModel} from "../models/user.model";
import {Router} from "@angular/router";
import {JwtHelperService} from "@auth0/angular-jwt";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class AuthService {
private helper : JwtHelperService = new JwtHelperService();
private token! :string;

  public loggedUser! : string;
  public isloggedIn : boolean = false;
  public roles! : string[];

  getToken(): string {
    return this.token;
  }

  constructor(private router : Router, private httpClient : HttpClient) { }

  login(user : UserModel){
    return this.httpClient.post<UserModel>('http://localhost:8080/api/auth/signin', user, {observe:'response'});
  }

  saveToken(jwt: string){
    localStorage.setItem('jwt',jwt);
    this.token = jwt;
    this.isloggedIn = true;
    this.decodedJWT();
  }
  decodedJWT(){
    if (this.token !=undefined){
      const decodedToken = this.helper.decodeToken(this.token);
      this.roles=decodedToken.roles;
      this.loggedUser= decodedToken.sub;
    }
  }
  isCreate(): boolean{
    if(!this.roles)
      return false
    return this.roles.indexOf('CREATE')>-1;
  }
  isAdmin(): boolean{
    if(!this.roles)
      return false
    return this.roles.indexOf('ADMIN')>-1;
  }
  logOut():void{
    this.loggedUser = undefined!;
     this.isloggedIn= false;
     this.roles= undefined!;
     this.token=undefined!;
     localStorage.removeItem('jwt');
    this.router.navigate(['login']);
  }
  setLoggedUserLS(login : string){
    this.loggedUser = login;
    this.isloggedIn =true;

  }
    loadToken(){
    this.token=localStorage.getItem('jwt')!;
    this.decodedJWT();
}
     isTokenExpired(){
    return this.helper.isTokenExpired(this.token);
}

}
