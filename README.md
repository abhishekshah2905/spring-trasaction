# Spring Transaction Demo

This project is a Spring Boot application that demonstrates transaction management using Spring's @Transactional annotation.

## Overview
The application consists of a BookingService class that performs bookings and a AppRunner class that demonstrates the usage of the BookingService. It also includes a ThreadConfig class to configure a custom TaskExecutor for asynchronous execution.

## Getting Started

### Prerequisites
- Java JDK 8 or higher
- Maven

### Installation
1. Clone the repository:
```bash
  git clone https://github.com/abhishekshah2905/spring-trasaction.git
```
2. Navigate to the project directory:
```bash
  cd spring-trasaction
```
3. Build the project:
```bash
  mvn clean install
```
4. Run the application:
```bash
  mvn spring-boot:run
```

### Usage
- Upon running the application, the AppRunner class will be executed, demonstrating the booking process.
- The BookingService class uses Spring's transaction management to ensure data integrity.
- The ThreadConfig class configures a custom TaskExecutor for asynchronous execution of methods annotated with @Async.

### Configuration
- The ThreadConfig class configures a custom TaskExecutor bean with a thread pool size of 4-10 threads.
- The BookingService class uses @Transactional annotation to manage transactions, ensuring that all bookings are processed atomically.