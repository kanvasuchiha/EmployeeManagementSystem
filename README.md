# EmployeeManagementSystem
EMS using Angular and SpringBoot

This is an effort to develop a full-stack application with SpringBoot being used to develop backend to expose RESTful APIs to be consumed by an Angular based Frontend.

-------------------------About SpringBoot Application---------------------


--------------------------------------------------------------------------


-------------------------- About Angular ---------------------------------

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
  
  
----------------------------About Angular Frontend------------------------------
Components List for the App - https://drive.google.com/file/d/1yO4SZxCxfx_oakMBsQoqQhD5epLwpOPF/view?usp=sharing

1) EmployeeService - Holds all the HTTP REST client code
   We can EmployeeService in different components. We use Angular Dependency Injection to inject services to components as per requirements.
   We will be using this to create logging service and keep logs of everything happening at the frontend level.
   This service will communicate/call with the server using REST APIs.
2) Execute 'npm install bootstrap --save' in the root folder of angular app. After this you can find the new module downloaded in node_modules, an entry in 
   package.json and also an entry about the node_modules folder under "styles" in "angular.json".
   Or else we can add "@import "~bootstrap/dist/css/bootstrap.min.css" under global styles.css
   Or else we can add the bootstrap 4 cdn link directly in the index.html
3) <h1> {{title}}  is known as 'Interpolation'.
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
