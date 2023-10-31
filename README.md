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


<img width="1187" alt="Screenshot 2023-10-31 at 9 12 18 AM" src="https://github.com/zenilvaghasiya/Quiz-Assessment-System/assets/47736398/7a0ddfce-7680-42ed-98fa-76d4006469da">
<img width="1187" alt="Screenshot 2023-10-31 at 9 12 07 AM" src="https://github.com/zenilvaghasiya/Quiz-Assessment-System/assets/47736398/09b333ad-c805-4171-a3d1-deae2a5cec18">
