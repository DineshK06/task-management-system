# 🚀 Task Management System  
1️⃣ 📌 Project Overview
A **Spring Boot-based Task Management System** with JWT Authentication, Role-Based Access Control, and Dockerized Deployment.

📌 Tech Stack
Backend: Java 23, Spring Boot, Spring Security
Database: PostgreSQL
Authentication: JWT (JSON Web Token)
Deployment: Docker, AWS EC2

## 🔹 Features  
- ✅ **User Authentication** (Signup/Login with JWT)  
- ✅ **Role-Based Access** (Admin/User Permissions)  
- ✅ **Task CRUD Operations** (Create, Read, Update, Delete)  
- ✅ **PostgreSQL Database Integration**
- ✅ Rate Limiting (Bucket4j for Security)
- ✅ Database Indexing for Performance  
- ✅ **Dockerized Deployment**  
- ✅ **Live Hosting on AWS EC2**  

---

## 🌍 Live Demo  
🔗 **Base API URL:** http://65.0.178.187:8080  

> **NOTE:** AWS Free Tier may shut down inactive instances, so restart if needed.

---

## 🔹 API Endpoints  
| **Method** | **Endpoint**            | **Description**           | **Authorization** |
|-----------|------------------------|---------------------------|------------------|
| `POST`    | `/api/auth/signup`      | Register a new user       | ❌ No Auth       |
| `POST`    | `/api/auth/login`       | Login and get JWT token   | ❌ No Auth       |
| `GET`     | `/api/users`            | Get all users             | ✅ Requires JWT  |
| `POST`    | `/api/tasks`            | Create a new task         | ✅ Requires JWT  |
| `GET`     | `/api/tasks`            | Get all tasks             | ✅ Requires JWT  |
| `PUT`     | `/api/tasks/{id}`       | Update a task             | ✅ Requires JWT  |
| `DELETE`  | `/api/tasks/{id}`       | Delete a task             | ✅ Requires JWT  |

🔹 **To access protected endpoints, include your JWT token:**  
Authorization: Bearer YOUR_ACCESS_TOKEN

----------------------------------------------------------------------------------------------------------

## 🚀 Setup Instructions  
### **🔹 Run Locally (Without Docker)**
1️⃣ **Clone the repository:**  
   ```bash
   git clone https://github.com/dineshk06/task-management-system.git
   cd task-management-system

2️⃣ Set up PostgreSQL & update application.properties
3️⃣ Run the application:
    - mvn spring-boot:run

🔹 Run with Docker
docker-compose up --build -d

 📌 Security & Optimization
 - JWT Expiry Validation: Tokens expire after 1 hour.
 - Rate Limiting: Protects APIs from brute force attacks.
 - Database Indexing: PostgreSQL index on username for fast lookups.

📌 Contribution Guidelines & License
- Mention Open Source Contributions (if applicable).
- Add MIT License if open-source.

📜 License
This project is open-source and free to use.

## 👤 Author  
**Dinesh Kumar**  
- 🔗 [LinkedIn](https://www.linkedin.com/in/dineshk06)  
- 🔗 [GitHub](https://github.com/dineshk06)  
- 🔗 [Upwork](https://www.upwork.com/freelancers/~01d4122e3e1f0db3f8)  

-------------------------------------------------------------------------------------------------------------


