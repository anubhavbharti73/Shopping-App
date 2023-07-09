import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Items } from './items.model';
import { User } from './user.model';
import { UserAuth } from './userAuth.model';
import { CartItems } from './cartItems.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }

// registeruser(user:User){
//   return this.http.post<User>('http://localhost:1234/user/reg',user);
// }

// login(userAuth:UserAuth){
//   return this.http.post<User>('http://localhost:1234/user/login',userAuth);
// }
  registeruser(user:User){
    return this.http.post<User>('http://localhost:1234/user/reg/',user);
  }

  login(userAuth:UserAuth){
    return this.http.post<User>('http://localhost:1234/user/login/',userAuth);
  }

  adminAddItem(item:Items){
    return this.http.post<Items>(`http://localhost:1236/item/add/`,item);
  }


  // // defaultTest(){
  // //   return this.http.get<String>('https://anubhav-shop-item-entry.azuremicroservices.io/item/see')
  // // }
  // defaultTesttest(){
  //   return this.http.get<any>('http://localhost:1236/item/see');
  // }


  getAllItems(){
    return this.http.get<Items[]>(`http://localhost:1236/item/`);
  }

  addToCart(cartItem:CartItems){
    return this.http.post<Items>(`http://localhost:1235/cart/saveitem`,cartItem);
  }

  getMyCartList(emailid:string){
    return this.http.get<CartItems[]>(`http://localhost:1235/cart/${emailid}`);
  }

  deletethisItem(itemId:String){
    return this.http.delete(`http://localhost:1235/cart/${itemId}`);
  }



}
