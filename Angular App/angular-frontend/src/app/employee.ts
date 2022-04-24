// Gonna use it to hold the response of REST API
// This class should match our JPA entity created in springboot app

export class Employee {
    id!: number;
    firstName!: string;
    lastName!: string;
    emailId!: string;
}
