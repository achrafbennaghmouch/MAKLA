import { Component } from '@angular/core';
import {AuthService} from "./services/auth.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'TPANGULAR';

  constructor(public authservice : AuthService, private router: Router) {
    let loggedUser : string;
    let isLoggedIn : string;
    loggedUser = localStorage.getItem('loggedUser')!;
    isLoggedIn = localStorage.getItem('isLoggedIn')!;
    if(loggedUser || isLoggedIn == 'false')
      router.navigate(['login'])
    else
      authservice.setLoggedUserLS(loggedUser);
  }
  logOut():void{
    this.authservice.logOut();
  }
  ngOnInit(){
    this.authservice.loadToken();
    if(this.authservice.getToken() == null || this.authservice.isTokenExpired())
      this.router.navigate(['/loginng serv'])
  }
}
