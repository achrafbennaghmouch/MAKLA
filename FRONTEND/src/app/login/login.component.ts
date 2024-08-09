import { Component } from '@angular/core';
import {UserModel} from "../models/user.model";
import {AuthService} from "../services/auth.service";
import {Route, Router} from "@angular/router";
import {error} from "@angular/compiler-cli/src/transformers/util";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
error : number = 0;
  constructor(private authService : AuthService, private router : Router) {
  }

  user = new UserModel();
  loggedIn():void{
  this.authService.login(this.user).subscribe({
    next:(data)=>{
      let jwtToken:string = data.headers.get("Authorization")!;
      this.authService.saveToken(jwtToken);
      this.router.navigate(['/']);
    },
    error:(error:any)=>{
      this.error=1;
    }
  })
  }
}
