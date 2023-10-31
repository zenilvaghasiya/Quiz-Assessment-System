## Quiz Assessment System


### Backend 
- Clone and Import this project, in the Java IDE of your choice.
- Build the project.
- - Errors after building ⇒ `log` not found. Refer [here](https://stackoverflow.com/questions/16627751/building-with-lomboks-slf4j-and-eclipse-cannot-find-symbol-log)
- Config for `SQL Server` can be found at here (src/main/resources/application.yaml)
- To config `CORS` and `CSRF`, Security config can be found (src/main/java/com/zenil/quizassessmentmanagement/config/Security.java)


### File Structure 

### Backend
Main folder at src/main/java

Backend divided in 5 modules as per Spring MVC framework
Config ⇒ All the configuration for the project, like Security
Model ⇒ Model structure for various database entities
Repository ⇒ JPA Link with Models
Resources ⇒ Controllers, to route each query
Services ⇒ To serve each request coming through the Resources
