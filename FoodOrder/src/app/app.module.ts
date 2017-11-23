import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { TodoInputComponent } from './todo-input/todo-input.component';
import { TodoListComponent } from './todo-list/todo-list.component';
import { TodoListItemComponent } from './todo-list-item/todo-list-item.component';
import { TodoListService } from './todo-list.service';
import { IssueService } from './issue.service';
import { IssueListComponent } from './issue-list/issue-list.component';
import { IssueDetailsComponent } from './issue-details/issue-details.component';
import { IssueFormComponent } from './issue-form/issue-form.component';
import { HeaderComponent } from './header/header.component';
import { AppRoutingModule } from './/app-routing.module';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { IndexComponent } from './index/index.component';
import { FoodListComponent } from './food-list/food-list.component';
import { OrderListComponent } from './order-list/order-list.component';
import { CheckMyOrderComponent } from './check-my-order/check-my-order.component';

@NgModule({
  declarations: [
    AppComponent,
    TodoInputComponent,
    TodoListComponent,
    TodoListItemComponent,
    IssueListComponent,
    IssueDetailsComponent,
    IssueFormComponent,
    HeaderComponent,
    RegisterComponent,
    LoginComponent,
    IndexComponent,
    FoodListComponent,
    OrderListComponent,
    CheckMyOrderComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [
    TodoListService,
    IssueService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
