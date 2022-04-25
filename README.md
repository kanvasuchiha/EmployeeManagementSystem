# EmployeeManagementSystem
EMS using Angular and SpringBoot

This is an effort to develop a full-stack application with SpringBoot being used to develop backend to expose RESTful APIs to be consumed by an Angular based Frontend.

<h1>About SpringBoot Application


--------------------------------------------------------------------------


<h1>About Angular Application

1) main.ts is the main entry point of our angular app
2) any dependencies added via "npm install" command are installed in node_modules folder
3) tsconfig.json consists of the configuration to deal with typescript, as our browsers only understand JS and therefore there is a need to convert TS to JS.
4) index.html - the single file which will get served in the browser. We develop SPA(Single Page Application) via angular
  In here, we have:
  <app-root> tag which indicates the name of the component and where to take the angular component from.
  selector = app-root  in app.component.ts
5)app.module.ts is the root module of our application.
  We configure our components in 'declarations' section of appmodule
  Other modules in 'imports'
  services in 'providers'
  Angular application should have atleast one module and that too, 'AppModule', the application an have any number of modules, though.
6) AppComponent is our root component, same last line as point 5) applicable here
7) Polyfills.ts - Give browser specific configurations
8) styles.css - Global styling template
9) assets folder - CSS, JS and images files, similar to resources folder in springboot
10) Control flow initiates comes to the 
  main.ts --------> app.module.ts --------> app.component.ts 
11) All the dependencies are listed in package.json file, when we do an npm install, the keys in package-lock.json are changed on its own.
  
--------------------------------------------------------------------------------
  
  
<h1>About Angular Frontend
Components List for the App - https://drive.google.com/file/d/1yO4SZxCxfx_oakMBsQoqQhD5epLwpOPF/view?usp=sharing

1) EmployeeService - Holds all the HTTP REST client code
   We can EmployeeService in different components. We use Angular Dependency Injection to inject services to components as per requirements.
   We will be using this to create logging service and keep logs of everything happening at the frontend level.
   This service will communicate/call with the server using REST APIs.
2) Execute 'npm install bootstrap --save' in the root folder of angular app. After this you can find the new module downloaded in node_modules, an entry in 
   package.json and also an entry about the node_modules folder under "styles" in "angular.json".
   Or else we can add "@import "~bootstrap/dist/css/bootstrap.min.css" under global styles.css
   Or else we can add the bootstrap 4 cdn link directly in the index.html
3) {{title}}  is known as 'Interpolation'.
4) 'ng g class employee' g - generate,  generates an employee.ts and employee.spec.ts inside "app" folder.
   CREATE src/app/employee.spec.ts (162 bytes)
   CREATE src/app/employee.ts (26 bytes)
5) 'ng g c employee-list' c - component, generates
   CREATE src/app/employee-list/employee-list.component.html (28 bytes)
   CREATE src/app/employee-list/employee-list.component.spec.ts (669 bytes)
   CREATE src/app/employee-list/employee-list.component.ts (302 bytes)
   CREATE src/app/employee-list/employee-list.component.css (0 bytes)
   UPDATE src/app/app.module.ts (501 bytes)
   Now the employee-list component belongs to "app module"
   A component is a TS class with @Component decorator
6) About Services:
   https://drive.google.com/file/d/1_6w_cT4dVdSdrkoS4_fooZROqy44hKKM/view?usp=sharing
   > ng g s employee-service
   CREATE src/app/employee-service.service.spec.ts (403 bytes)
   CREATE src/app/employee-service.service.ts (144 bytes)
   Service is a class annotated with @Injectable decorator and this class can be added to Providers in components.
   We gonna make use of HttpClient module to make calls to REST API.
7) Add HttpClientModule in 'imports' "app.module.ts" file. Read about the changes to be made about CORS policy in springboot app
   @CrossOrigin(origins = "http://localhost:4200")
8) Enabling routing in the CLI while angular app creation does two things:
   i) add : 
      <base href="/">  to index.html
   ii) generate a new file by the name of app-routing.module.ts
   iii) add 'AppRoutingModule' to imports in app.module.ts
9) "pathMatch: 'full'" is very important thing in Angular routing an empty path to avoid an endless loop.

  --------------------------------------------------------------------------------
  
  
  <h1>Add Employee REST API

  https://drive.google.com/file/d/1ZApboYCBi25NK8g7djZutNQBmeGoANwR/view?usp=sharing  
  
  1) Angular provides us with this great feature of two way binding.
  2) > ng g c create-employee
      CREATE src/app/create-employee/create-employee.component.html (30 bytes)
      CREATE src/app/create-employee/create-employee.component.spec.ts (683 bytes)
      CREATE src/app/create-employee/create-employee.component.ts (310 bytes)     
      CREATE src/app/create-employee/create-employee.component.css (0 bytes)      
      UPDATE src/app/app.module.ts (695 bytes)
  3) We use NgModel directive to achieve two way binding in our angular application, for any errors
     https://stackoverflow.com/questions/38892771/cant-bind-to-ngmodel-since-it-isnt-a-known-property-of-input
  4) Create a method in employee.service.ts that will make the REST API call and save our employee to the MySql database.
  
  --------------------------------------------------------------------------------
  
  
  <h1>Update Employee REST API
  
  --------------------------------------------------------------------------------
  
  
  <h1>Update Employee Component
  1) > ng g c update-employee
      CREATE src/app/update-employee/update-employee.component.html (30 bytes)
      CREATE src/app/update-employee/update-employee.component.spec.ts (683 bytes)
      CREATE src/app/update-employee/update-employee.component.ts (310 bytes)     
      CREATE src/app/update-employee/update-employee.component.css (0 bytes)      
      UPDATE src/app/app.module.ts (875 bytes)
  
  --------------------------------------------------------------------------------
  
  
  <h1>Delete Employee REST API
  
  --------------------------------------------------------------------------------
  
  
  <h1>Delete Employee Component
  
  --------------------------------------------------------------------------------
  
  
  <h1>View Employee Component
  
  1) > ng g c employee-details
      CREATE src/app/employee-details/employee-details.component.html (31 bytes)
      CREATE src/app/employee-details/employee-details.component.spec.ts (690 bytes)
      CREATE src/app/employee-details/employee-details.component.ts (314 bytes)     
      CREATE src/app/employee-details/employee-details.component.css (0 bytes)      
      UPDATE src/app/app.module.ts (995 bytes)
  
   --------------------------------------------------------------------------------
