import {Injectable} from "@angular/core";

export const OrderStatus = {
  Elokeszites: 'Előkészítés',
  Sutes: 'Sütés',
  Szallitas: 'Szállítás',
  Teljesitve: 'Teljesítve'
};

export class Food{
  id: number;
  name: string;
  category: string;
  price: string;

}


export class Order{
  id: number;
  user_id: number;
  food_id: number;
  date: string;
  status: string;


}


//@Injectable
export class FoodService {

  foods = [
    {
      id: 1,
      name: 'pizza1',
      category: 'pizza',
      price: '1190'
    }


  ];


  constructor(){}

}

