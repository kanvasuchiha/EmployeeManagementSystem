import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employees!: Employee[];

  constructor(private employeeService: EmployeeService, private router: Router) { 
    
  }

  ngOnInit(): void {
    // this.employees = [{
    //   "id" : 1,
    //   "firstName" : "Kanav",
    //   "lastName" : "Vashisht",
    //   "emailId" : "kanavsad@gmail.com"
    // },
    // {
    //   "id" : 1,
    //   "firstName" : "Kanav",
    //   "lastName" : "Vashisht",
    //   "emailId" : "kanavsad@gmail.com"
    // }];

    this.getEmployees();

  }

  private getEmployees(){
    // So this sends an async call, once we get the desired data, we handle the response from th rest API
    this.employeeService.getEmployeesList().subscribe(data => {
      this.employees = data;
    });
  }

  updateEmployee(id: number){
    this.router.navigate(['update-employee', id]);
  }

}
