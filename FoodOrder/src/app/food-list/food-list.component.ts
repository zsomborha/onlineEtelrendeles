import { Component, OnInit } from '@angular/core';

import { FoodService, Food } from '../food.service';
import {Router} from "@angular/router";

@Component({
  selector: 'app-food-list',
  templateUrl: './food-list.component.html',
  styleUrls: ['./food-list.component.css']
})


export class FoodListComponent implements OnInit {

  constructor(private router: Router) { }

  foods: Food[];
  //string: heros[]
  //heroes = ['Windstorm', 'Bombasto', 'Magneta', 'Tornado'];

  //heros: string[];

  ki: string = 'proba'

  ngOnInit() {

    //this.foods = this.foodService.foods;
    this.foods = [
      {
        id: 1,
        name: 'pizza1',
        category: 'pizza',
        price: '1190'
      },
      {
        id: 2,
        name: 'leves1',
        category: 'leves',
        price: '690'
      },

      {
        id: 3,
        name: 'desszert1',
        category: 'desszert',
        price: '890'
      }
    ];

  }

  createOrder(id: string){
    console.log('Rendel: '+(id));
  }

  Logout(){
    this.router.navigateByUrl('/login');
  }

}





/*
export class Food{
  id: number;
  name: string;
  category: string;
  price: string;

}
*/
