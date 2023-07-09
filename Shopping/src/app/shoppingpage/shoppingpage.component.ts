import { Component, OnInit } from '@angular/core';
import { Items } from '../items.model';
import { UserService } from '../user.service';
import { CartItems } from '../cartItems.model';
import { User } from '../user.model';
import { ActivatedRoute } from '@angular/router';
import { EmailValidator } from '@angular/forms';

@Component({
  selector: 'app-shoppingpage',
  templateUrl: './shoppingpage.component.html',
  styleUrls: ['./shoppingpage.component.css']
})
export class ShoppingpageComponent implements OnInit {

  item:Items[]=[];

  constructor(private userService: UserService) { }


  user= new User();
  email:string=''

  change=0
  change1=1

  ngOnInit(): void {


    this.email=localStorage.getItem('user')+'';

    this.userService.getAllItems().subscribe(
      data=>{
        console.log("this is shoopping " +this.email)
        this.item=data;

      },
      error=>{
        console.log(error)
      }
    )

    
    
  }

cartItem= new CartItems();

cartItems:CartItems[]=[]

addToCart(i:Items){

    console.log(this.email)
    this.cartItem.emailid=this.email 
    this.cartItem.itemId=i.itemId;
    this.cartItem.itemName=i.itemName;
    this.cartItem.itemPrice=i.itemPrice;
    this.cartItems.push(this.cartItem)


    this.userService.addToCart(this.cartItem).subscribe(
      data=>{
        alert('Item Added')
        console.log(data)
      },
      error=>{
        console.log(error)
      }
    )

  }

  myCart(){
    this.change=0
    this.change1=1
    this.userService.getMyCartList(this.email).subscribe(
      data=>{
        console.log(data)
        this.cartItems=data;
      },
      error=>{
        console.log(error)
      }
    )
  }

  itemsList(){
    this.change=1
    this.change1=0
  }


  deleteitem(fav:CartItems){
    this.userService.deletethisItem(fav.itemId).subscribe(
      data=>{
        console.log(this.cartItem.itemId)
        alert("Deleted");
        this.myCart()
      },
      error=>{
        console.log(error);
      }
    )
  }


}
