import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../user.model';
import { UserService } from '../user.service';

@Component({
  selector: 'app-registeration',
  templateUrl: './registeration.component.html',
  styleUrls: ['./registeration.component.css']
})
export class RegisterationComponent implements OnInit {

  constructor(private userService:UserService, private router:Router) { }

  user= new User();

  ngOnInit(): void {
  }

  userRegister(regForm:NgForm){

    console.log(this.user);
    this.userService.registeruser(this.user).subscribe(
      data=>{
        console.log(this.user);
        alert("User Registered");

      },
      error=>{
        console.log(error)
      }
    )

  }

}
