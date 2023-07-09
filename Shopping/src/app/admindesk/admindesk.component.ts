import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Items } from '../items.model';
import { UserService } from '../user.service';

@Component({
  selector: 'app-admindesk',
  templateUrl: './admindesk.component.html',
  styleUrls: ['./admindesk.component.css']
})
export class AdmindeskComponent implements OnInit {

  constructor(private router:Router, private userService:UserService) { }

  item= new Items();

  ngOnInit(): void {
  }

  addItem(regForm:NgForm){

    this.userService.adminAddItem(this.item).subscribe(
      data=>{
        alert('Added Successfully');
      },
      error=>{
        console.log(error)
      }
    )

  }

}
