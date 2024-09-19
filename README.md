# Excellia--Academic-Record-and-Ranking-System

### Excellia - Academic Record and Ranking System is a Spring Boot-based web application designed to manage academic records and rank students based on their performance. The system provides RESTful APIs for performing CRUD operations on student data and calculating rankings based on their marks. The application uses PostgreSQL as the database and is Docker-enabled for easy deployment and scalability.

### Key Features:
Student Management: Add, update, and delete student profiles.
Marks Management: Track student marks for different subjects and update them as needed.
Ranking System: Automatically rank students based on performance.
RESTful API: Exposes endpoints for student and marks management and provides ranked student lists.
PostgreSQL Integration: Uses PostgreSQL as the relational database to store and retrieve student and marks data.
Docker Support: The PostgreSQL database is containerized using Docker for seamless setup and portability.

### Architecture:
Spring Boot Backend:

Provides RESTful APIs for managing student records and calculating rankings.
Interacts with the PostgreSQL database running in a Docker container.
PostgreSQL Database:

Containerized using Docker.
Stores data related to students, subjects, and marks.
Spring Data JPA:

Handles data persistence and retrieval using JPA and communicates with the PostgreSQL database.

### Endpoints:

- `GET /api/students`: Get all students.
- `POST /api/students`: Create a new student.
- `GET /api/students/{id}`: Get a specific student.
- `DELETE /api/students/{id}`: Delete a student.
- `POST /api/marks`: Add marks for a student.
- `GET /api/marks/student/{studentId}`: Get marks for a specific student.
- `GET /api/marks/rank`: Get student rankings based on total marks.


### Benefits:
Separation of Concerns: The Spring Boot application and PostgreSQL are decoupled. PostgreSQL runs in Docker while the application runs locally.
Portability: PostgreSQL can be deployed and run anywhere using Docker, ensuring consistency across development, testing, and production environments.
Scalability: The database setup is easily scalable, and you can switch database environments without affecting the application code.


## depensencies ::

![depensencies](https://github.com/user-attachments/assets/f0e98362-8cc4-46f0-99e5-a81715ac3c0b)


## application.properies ::

![Application Properties](https://github.com/user-attachments/assets/c82cd27f-2fbc-43f6-a372-c66d58c2198b)


## Package Structure :: 

![Package Structure](https://github.com/user-attachments/assets/24bcc0ce-8510-4b94-938e-234e6011d62f)


