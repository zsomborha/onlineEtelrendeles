import { Component, OnInit } from '@angular/core';

import  { FoodService, OrderStatus } from "../food.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-check-my-order',
  templateUrl: './check-my-order.component.html',
  styleUrls: ['./check-my-order.component.css']
})
export class CheckMyOrderComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {

  }


  myStatus = OrderStatus.Sutes;


  Logout(){
    this.router.navigateByUrl('/login');
  }

}
