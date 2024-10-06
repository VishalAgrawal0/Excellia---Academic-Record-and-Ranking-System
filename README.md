# **Excellia - Academic Record and Ranking System**

**Excellia** is a Spring Boot-based web application designed to efficiently manage academic records and rank students based on their performance. The system offers robust RESTful APIs for performing CRUD operations on student data, calculating rankings based on marks, and is fully integrated with PostgreSQL. It leverages Docker for seamless deployment and scalability.

## **Key Features**:
- **Student Management**: Add, update, and delete student profiles.
- **Marks Management**: Track and update student marks for various subjects.
- **Ranking System**: Automatically rank students based on total marks or subject-specific performance.
- **RESTful API**: Exposes endpoints for student and marks management, including fetching ranked student lists.
- **PostgreSQL Integration**: Utilizes PostgreSQL as the relational database for reliable data storage and retrieval.
- **Docker Support**: The PostgreSQL database is containerized for easy setup and environment portability.

## **Architecture**:
### **Spring Boot Backend**:
- Provides RESTful APIs for managing student records and calculating rankings.
- Communicates with a PostgreSQL database running in a Docker container.

### **PostgreSQL Database**:
- Containerized with Docker.
- Stores student data, subject information, and marks.

### **Spring Data JPA**:
- Manages data persistence and retrieval using JPA.
- Interacts with the PostgreSQL database for smooth and efficient data management.

## **API Endpoints**:

- `GET /api/students`: Retrieve all students.
- `POST /api/students`: Create a new student.
- `GET /api/students/{id}`: Retrieve a specific student by ID.
- `DELETE /api/students/{id}`: Delete a student by ID.
- `POST /api/marks`: Add marks for a student.
- `GET /api/marks/student/{studentId}`: Retrieve marks for a specific student.
- `GET /api/marks/rank`: Retrieve student rankings based on total marks.

## **Benefits**:
- **Separation of Concerns**: The Spring Boot application and PostgreSQL database are decoupled. PostgreSQL runs in Docker while the Spring Boot application can run locally.
- **Portability**: PostgreSQL can be deployed anywhere via Docker, ensuring consistency across development, testing, and production environments.
- **Scalability**: The database is easily scalable, and switching database environments doesn't require changes to the application code.


## dependencies ::

![depensencies](https://github.com/user-attachments/assets/f0e98362-8cc4-46f0-99e5-a81715ac3c0b)


## application.properies ::

![Application Properties](https://github.com/user-attachments/assets/c82cd27f-2fbc-43f6-a372-c66d58c2198b)


## Package Structure :: 

![Package Structure](https://github.com/user-attachments/assets/24bcc0ce-8510-4b94-938e-234e6011d62f)


