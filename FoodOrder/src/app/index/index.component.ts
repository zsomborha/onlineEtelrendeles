import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent implements OnInit {

 // constructor() { }
  constructor(
    //private issueService: IssueService,
    private router: Router
  ) { }

  ngOnInit() {
  }

  navigateToLogin(){
    this.router.navigateByUrl('/login');
  }

  navigateToRegister(){
    this.router.navigateByUrl('/register');
  }



}
