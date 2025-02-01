
# Lab 14 - Secure Java Spring Web Application

## 📦 Features
- User Registration and Login (JWT Authentication)
- CRUD Operations for Tasks
- Role-based Access Control
- Input Validation & Global Error Handling

## 🚀 Setup Instructions
1. Clone the repository.
2. Configure `src/main/resources/application.properties`.
3. Run Flyway migrations: `mvn flyway:migrate`
4. Start the application: `mvn spring-boot:run`

## ✅ Endpoints
- **POST /auth/register** - Register a new user
- **POST /auth/login** - User login (returns JWT)
- **GET /tasks** - Get tasks for the authenticated user
- **POST /tasks** - Create a new task
