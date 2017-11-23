import { Component, OnInit } from '@angular/core';
import { FoodService, Order,OrderStatus } from '../food.service';
import {Router} from "@angular/router";

@Component({
  selector: 'app-order-list',
  templateUrl: './order-list.component.html',
  styleUrls: ['./order-list.component.css']
})
export class OrderListComponent implements OnInit {

  orders: Order[];

  constructor(private router: Router) { }

  ngOnInit() {
    this.orders = [
      {
        id: 0,
        user_id:1,
        food_id:2,
        date: '2017.11.21 16:30',
        status: OrderStatus.Elokeszites
      },
      {
        id: 1,
        user_id:2,
        food_id:1,
        date: '2017.11.21 17:30',
        status: OrderStatus.Elokeszites
      },

      {
        id: 2,
        user_id:1,
        food_id:3,
        date: '2017.11.21 14:46',
        status: OrderStatus.Elokeszites
      }
    ];


  }

  modifyStatus(id: string){

    if (this.orders[id].status == OrderStatus.Elokeszites){
      this.orders[id].status = OrderStatus.Sutes;
    }
    else if (this.orders[id].status == OrderStatus.Sutes){
      this.orders[id].status = OrderStatus.Szallitas;
    }
    else if (this.orders[id].status == OrderStatus.Szallitas){
      this.orders[id].status = OrderStatus.Teljesitve;
    }




    console.log('Modosit: '+(id));
  }

  Logout(){
    this.router.navigateByUrl('/login');
  }

}
