 Food Delivery System – Backend (Spring Boot)

This project is a backend system for a food delivery application built using Spring Boot.
It handles core functionalities like user management, restaurant operations, ordering, and delivery flow.

 Description

The system is designed to simulate how real-world food delivery platforms work.
It provides RESTful APIs that allow different types of users (customers, admins, delivery personnel) to interact with the system.

⚙️ Features Implemented
User registration and login
Role-based access control (Customer, Admin, Delivery)
Restaurant creation and menu management
Cart functionality
Order placement and status tracking
Basic delivery workflow
🛠️ Technologies Used
Java
Spring Boot
Spring Security
JPA (Hibernate)
MySQL / PostgreSQL
Maven
🧱 System Design

The project follows a layered architecture:

Controller Layer → Handles API requests
Service Layer → Business logic
Repository Layer → Database interaction
Model Layer → Entity definitions
📁 Project Structure
src/main/java/
 └── com/yourpackage/
     ├── controller
     ├── service
     ├── repository
     ├── model
     └── config
🚀 Getting Started
1. Clone the project
git clone https://github.com/yonialt/food-delivery
cd food-delivery

3. Run the application
mvn spring-boot:run
 API Base URL
http://localhost:8081/api

Sample API Endpoints
POST /api/auth/register → Register user
POST /api/auth/login → Login
GET /api/restaurants → Get all restaurants
POST /api/orders → Place order
GET /api/orders/{id} → Track order

 Testing
You can test the APIs using:
Postman
Any REST client

 Future Improvements
Payment gateway integration
Real-time tracking (WebSocket)
Microservices architecture
Frontend integration

Author

Yonathan Altaye
