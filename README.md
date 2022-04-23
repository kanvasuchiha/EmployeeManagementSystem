# EmployeeManagementSystem
EMS using Angular and SpringBoot

This is an effort to develop a full-stack application with SpringBoot being used to develop backend to expose RESTful APIs to be consumed by an Angular based Frontend.


-------------------------- Angular - Frontend ---------------------------------
1) main.ts is the main entry point of our angular app
2) any dependencies added via "npm install" command are installed in node_modules folder
3) tsconfig.json consists of the configuration to deal with typescript, as our browsers only understand JS and therefore there is a need to convert TS to JS.
4) index.html - the single file which will get served in the browser. We develop SPA(Single Page Application) via angular
  In here, we have:
  <app-root> tag which indicates the name of the component and where to take the angular component from.
  selector = app-root  in app.component.ts
5)
