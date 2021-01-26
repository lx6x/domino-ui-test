To run the project, use the following command:


Change directory to your generated project and issue the following commands:


* run in one terminal window:

    - mvn clean install

* run in client module either:

    - mvn gwt:codeserver
      or
      mvn gwt:devmode

* in another terminal window:

* run in server module:

    - mvn spring-boot:run -P env-dev

To start the application, call:

-> http://localhost:8080/MyTestProject.html


Running

- mvn clean install

on the parent module will create a executable war file in the "MyTestProject-server" module, which can be run using

java -jar MyTestProject-server\target\MyTestProject-server-1.0.0.war

