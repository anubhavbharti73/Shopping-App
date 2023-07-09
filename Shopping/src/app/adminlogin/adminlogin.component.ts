import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  email: any;
  password: any;
  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  adminloginValidate(){

    if(this.email=="admin" && this.password=="admin" ){
      alert('Welcome!!');
      this.router.navigate(['/admindesk']);

    }

    else{
      alert("Wrong Input!!")
    }

  }

}
