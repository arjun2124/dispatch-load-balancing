Overview :-
       Assign delivery orders to vehicles efficiently.Ensure orders are assigned based on priority, vehicle capacity, and shortest route.
       
Tools:-
Backend: Java, Spring Boot
Database: MySQL
Testing: Postman
Build Tool: Maven

How to Run:-
Clone the Repository=git clone https://github.com/your-username/your-repo.gitcd dispatch-load-balancer
Set Up the Database=spring.datasource.url=jdbc:mysql://localhost:3306/dispatch_db
                    spring.datasource.username=root
                    spring.datasource.password=root
                    spring.security.user.name=admin
                    spring.security.user.password=admin123
Build and Run=mvn clean install
              mvn spring-boot:run
              
List of APIs:-
             GET /api/dispatch/plan
             Post/api/dispatch/orders
             Post/api/dispatch/vehicles



 
