import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { IssueListComponent } from './issue-list/issue-list.component';
import { IssueFormComponent } from './issue-form/issue-form.component';
import { IssueDetailsComponent } from './issue-details/issue-details.component';
import { TodoListComponent } from './todo-list/todo-list.component';
import {RegisterComponent} from "./register/register.component";
import {LoginComponent} from "./login/login.component";
import {IndexComponent} from "./index/index.component";
import {FoodListComponent} from "./food-list/food-list.component";
import {OrderListComponent} from "./order-list/order-list.component";
import {CheckMyOrderComponent} from "./check-my-order/check-my-order.component";

const routes: Routes = [
  { path: 'issue-list', component: IssueListComponent },
  { path: 'issue-form', component: IssueFormComponent },
  { path: 'issue-details/:id', component: IssueDetailsComponent },
  { path: 'todos', component: TodoListComponent },
  { path: 'hiba', redirectTo: 'issue-list' },
  { path: 'register', component: RegisterComponent },
  { path: 'login', component:LoginComponent},
  { path: 'index', component:IndexComponent },
  { path: 'foodList', component:FoodListComponent },
  { path: 'orderList', component:OrderListComponent },
  { path: 'checkMyOrder', component:CheckMyOrderComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes),
  ],
  exports: [
    RouterModule,
  ]
})
export class AppRoutingModule { }
