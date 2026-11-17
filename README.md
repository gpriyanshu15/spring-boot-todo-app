# Spring Boot Todo Management Application

A web-based Todo Management Application built using **Java, Spring Boot, Spring MVC, Spring Security, and JSP**. This application allows users to manage their daily tasks by creating, viewing, updating, and deleting todos.

## 🚀 Features

- **User Authentication:** Secure login functionality using Spring Security.
- **Todo Management:** Create, view, update, and delete todo tasks.
- **Task Description:** Add descriptions to individual tasks.
- **Target Date:** Set target dates for todo items.
- **Task Status:** Mark tasks as completed or pending.
- **Input Validation:** Validate todo descriptions using Jakarta Bean Validation.
- **Responsive UI:** JSP-based user interface with Bootstrap.
- **In-Memory Data Management:** Manage todo records using Java collections.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java 17 | Programming Language |
| Spring Boot 3.4.1 | Application Framework |
| Spring MVC | Web Application Development |
| Spring Security | Authentication and Authorization |
| Spring Data JPA | Data Access Dependency |
| H2 Database | Database Dependency |
| JSP & JSTL | View Technology |
| Bootstrap 5 | UI Styling |
| Maven | Build and Dependency Management |
| Jakarta Validation | Input Validation |

## 📂 Project Structure

```text
myfirstwebapp/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/in28minutes/springboot/myfirstwebapp/
│   │   │       ├── hello/
│   │   │       │   └── SayHelloController.java
│   │   │       ├── login/
│   │   │       │   └── WelcomeController.java
│   │   │       ├── security/
│   │   │       │   └── SpringSecurityConfiguration.java
│   │   │       ├── todo/
│   │   │       │   ├── Todo.java
│   │   │       │   ├── TodoController.java
│   │   │       │   └── TodoService.java
│   │   │       └── MyfirstwebappApplication.java
│   │   │
│   │   └── resources/
│   │       ├── META-INF/resources/WEB-INF/jsp/
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
└── README.md
```

## ⚙️ Prerequisites

Before running this application, make sure you have installed:

- Java Development Kit (JDK) 17 or higher
- Maven (or use the included Maven Wrapper)
- Git
- An IDE such as Eclipse, Spring Tool Suite, or IntelliJ IDEA

## ▶️ How to Run the Application

**1. Clone the repository**

```bash
git clone https://github.com/gpriyanshu15/spring-boot-todo-app.git
```

**2. Navigate to the project directory**

```bash
cd spring-boot-todo-app
```

**3. Run the application on Windows**

```bash
mvnw.cmd spring-boot:run
```

Alternatively, on Linux or macOS:

```bash
./mvnw spring-boot:run
```

**4. Access the application**

Open your browser and navigate to:

```text
http://localhost:8080
```

## 🔐 Security

- Spring Security is used to protect application endpoints.
- Form-based login is configured.
- User authentication is currently managed using in-memory user details.
- BCrypt password encoding is used for password storage.

**Note:** The current implementation uses in-memory todo data and in-memory user accounts. Persistent database integration can be added as a future enhancement.

## 🔮 Future Enhancements

- Integrate MySQL or PostgreSQL for persistent data storage.
- Implement database-backed user authentication.
- Add role-based access control.
- Develop RESTful APIs for Todo operations.
- Add pagination and sorting.
- Add unit and integration tests.

## 👨‍💻 Author

**Priyanshu Gupta**

GitHub: [@gpriyanshu15](https://github.com/gpriyanshu15)

Project Repository: [Spring Boot Todo Application](https://github.com/gpriyanshu15/spring-boot-todo-app)

---

⭐ If you find this project useful, feel free to star the repository!
