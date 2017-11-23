import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

export class User{
  name: string;

  password: string;



}



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})



export class LoginComponent implements OnInit {

  //constructor() { }

  model: User

  constructor(
    //private issueService: IssueService,
    private router: Router
  ) { }

  ngOnInit() {

  }


  Login(){
    if (1==1){  //TODO feltetel
      this.router.navigateByUrl('/foodList')
    }
  }

  navigateToPreviousPage(){
    this.router.navigateByUrl('/index')
  }

}
