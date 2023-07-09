import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../user.service';
import { UserAuth } from '../userAuth.model';
import { User } from '../user.model';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent implements OnInit {

  constructor(private router:Router, private userService:UserService) { }

  userAuth=new UserAuth();
  
  ngOnInit(): void {
  }

  userloginValidate(regForm:NgForm){
    
    this.userService.login(this.userAuth).subscribe(
      data=>{
        if(data==null){
          alert('Wrong input')
        }
        else{
        alert("login success!")
        console.log(data)

        let user = new User();  
        user=data;

        localStorage.setItem("user",JSON.stringify(user.emailid));

        this.router.navigate(['/shoppingpage']);
        }
      },
      error=>{
        console.log(error)
      }

    )

  }
}
