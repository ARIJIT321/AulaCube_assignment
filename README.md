# Task Management System

## Description

The Task Management System is a web application that allows users to manage their tasks efficiently. It provides features for user registration, task creation, task updating.

## Features

- Task Creation: Users can create new tasks by providing a title, description, status.
- Task Updating: Users can update existing task's status.
- Get All Task: Users can get all task

### Project Setup

1. Clone the repository: `git clone https://github.com/ARIJIT321/AulaCube_assignment.git`

2. Import
   <br>--I have build this assignment on spring tool suit. Our main goal here is to import the folder in any IDE, if you are using any other IDE and you feel confused, feel free to check out some tutorials on how to import a spring boot project on your particular IDE

3. Open any IDE (like STS)
4. click on the file
5. click on Project from file system/click on import
6. choose existing maven project
7. There will be an option for browse, choose the folder where you cloned the repo
8. click on finish

9. Let your IDE download all the necessary dependencies and library.
10. Open MySql database and create a database with the name "Task" Or you can choose any name.
11. If you want use any other name for your database then go to this loction -Task_Management_System-\Backend\src\main\resources\application.properties.
12. change the name of the database - spring.datasource.url=jdbc:mysql://localhost:3306/{Name of your database}

13. Right-click on "AulaCube"
14. Go to run as and run it as springboot application

15. The server will start running on `http://localhost:8888`.
16. If you want to change the server you can do that in the appliction.properties file present in -Task_Management_System-\Backend\src\main\resources\application.properties
17. There will be line "server.port=8888", here you can change the port no from 8888 to any port that is available in your system.

## API Endpoints

The Application provides the following API endpoints:

- `POST /tasks/createTask`: Create a new task.
- `PUT /tasks/updateTask/{id}`: Update an existing task.
- `GET /tasks`: Get all tasks.

you can test the endpoints using postman or any tool you see fit
