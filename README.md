# Dispatch Load Balancer

## Overview

The Dispatch Load Balancer is designed to efficiently assign delivery orders to vehicles. It ensures that orders are assigned based on priority, vehicle capacity, and the shortest route.

## Features

- **Order Prioritization**: Assign orders based on urgency to ensure timely deliveries.
- **Optimal Route Selection**: Utilize the Haversine formula for calculating the shortest routes.
- **Load Balancing**: Maximize vehicle capacity usage to improve efficiency.
- **Secure API Authentication**: Protect your API endpoints with secure authentication.
- **Scalable and Efficient Architecture**: Built to handle increasing loads and demands.

## Tools

- **Backend**: Java, Spring Boot
- **Database**: MySQL
- **Testing**: Postman
- **Build Tool**: Maven

## Use Cases

- **E-commerce Delivery**: Assigning orders to available delivery vans for efficient order fulfillment.
- **Courier Services**: Optimizing package distribution routes for timely deliveries.
- **Grocery Delivery**: Ensuring perishable items reach customers on time.


## How to Run:-
**Clone the Repository**:-*git clone https://github.com/your-username/your-repo.gitcd dispatch-load-balancer*
**Set Up the Database**:- *spring.datasource.url=jdbc:mysql://localhost:3306/dispatch_db*
                          *spring.datasource.username=root*
                          *spring.datasource.password=root*
                          *spring.security.user.name=admin*
                          *spring.security.user.password=admin123*
                    
##Build and Run ## :-     *mvn clean install*
                          *mvn spring-boot:run*
              
## List of APIs

- **GET /api/dispatch/plan**:- *Retrieves the dispatch plan with assigned orders for vehicles.*
- **Post/api/dispatch/orders**:- *Adds new delivery orders to the system.*
- **Post/api/dispatch/vehicles**:-*Registers new vehicles for order assignments.*



 
