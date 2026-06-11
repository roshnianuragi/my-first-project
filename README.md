# Customers Management System (Spring Boot REST API)

## Overview

The Customers Management System is a Spring Boot based REST API application designed to perform CRUD (Create, Read, Update, Delete) operations on customer data.

This project demonstrates how a real-world backend application is built using a layered architecture (Controller → Service → Repository → Model) with Spring Boot and Spring Data JPA.

It follows clean coding practices, RESTful API design principles, and is suitable for understanding backend development in Java.

---

## Key Features

### Customer Management (CRUD Operations)
- Create new customer
- Get all customers
- Get customer by ID
- Update customer details
- Delete customer

---

### REST API Design
- RESTful endpoints using proper HTTP methods
- JSON request and response handling
- Clean and simple API structure

---

### Layered Architecture

The project follows a clean layered structure:

- Controller Layer → Handles HTTP requests  
- Service Layer → Business logic  
- Repository Layer → Database operations  
- Model Layer → Entity definition  

---

## Project Structure

src/main/java/com/customers

├── controller  
│   └── CustomerController.java  

├── service  
│   └── CustomerService.java  

├── repository  
│   └── CustomerRepository.java  

├── model  
│   └── Customers.java  

└── CustomersApplication.java  

---

## System Workflow

1. Client sends request to REST API  
2. Controller receives request  
3. Service processes business logic  
4. Repository interacts with database  
5. Response returned in JSON format  

---

## API Endpoints

Base URL: `/customers`

- GET `/customers` → Get all customers  
- GET `/customers/{id}` → Get customer by ID  
- POST `/customers` → Create new customer  
- PUT `/customers/{id}` → Update customer  
- DELETE `/customers/{id}` → Delete customer  

---

## Technologies Used

- Java 21  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- Maven  
- MySQL (optional)

---

## Database Configuration

Add this in `application.properties`:

spring.datasource.url=jdbc:mysql://localhost:3306/customers_db  
spring.datasource.username=root  
spring.datasource.password=root  
spring.jpa.hibernate.ddl-auto=update  

---

## How to Run

1. Clone repository  
2. Import project in IDE (IntelliJ/Eclipse)  
3. Configure database  
4. Run `CustomersApplication.java`  
5. Test APIs using Postman  

---

## Author

Roshni Anuragi  
Java Developer | Spring Boot Enthusiast  

---

## Conclusion

This project demonstrates a clean and simple REST API built using Spring Boot following layered architecture principles.
