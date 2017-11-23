import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

export class User{
  name: string;
  email: string;
  password: string;
  addres:string;
  tel:string;


}

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  model: User;



  constructor(
    //private issueService: IssueService,
    private router: Router
  ) { }

  ngOnInit() {
  }

  onSubmit(){
    //logic.model.User User;
    this.router.navigateByUrl('/food-list')
  }

  navigateToPreviousPage(){
    this.router.navigateByUrl('/index')
  }

}
