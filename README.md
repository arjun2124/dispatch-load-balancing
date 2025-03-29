Overview :-
       Assign delivery orders to vehicles efficiently.Ensure orders are assigned based on priority, vehicle capacity, and shortest route.
       
Features :-
Order prioritization based on urgency
Optimal route selection using Haversine formula
Load balancing to maximize vehicle capacity usage
Secure API authentication
Scalable and efficient architecture    

Tools:-
Backend: Java, Spring Boot
Database: MySQL
Testing: Postman
Build Tool: Maven

Use Cases:-
E-commerce Delivery: Assigning orders to available delivery vans.
Courier Services: Optimizing package distribution routes.
Grocery Delivery: Ensuring perishable items reach customers on time.

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
             GET /api/dispatch/plan :- Retrieves the dispatch plan with assigned orders for vehicles.
             Post/api/dispatch/orders :- Adds new delivery orders to the system.
             Post/api/dispatch/vehicles :- Registers new vehicles for order assignments.



 
