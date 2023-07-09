import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdmindeskComponent } from './admindesk/admindesk.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { HomeComponent } from './home/home.component';
import { RegisterationComponent } from './registeration/registeration.component';
import { ShoppingpageComponent } from './shoppingpage/shoppingpage.component';
import { UserloginComponent } from './userlogin/userlogin.component';

const routes: Routes = [

  {path:'',redirectTo:"home",pathMatch:'full'},
  {path:"home",component:HomeComponent},
  {path:"adminlogin", component:AdminloginComponent},
  {path:"userlogin", component:UserloginComponent},
  {path:"registeration", component:RegisterationComponent},
  {path:"shoppingpage", component:ShoppingpageComponent},
  {path:"admindesk", component:AdmindeskComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
