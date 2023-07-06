# UniversityEvent-Management
A Spring-boot project.Project manage event and student participated in the event.

## tools
### Framework
intelliJ IDEA H2 Database

## dependencies -
Spring web, Validation, JPA, H2 databse, lombok

## entities
### Student
studentId firstname lastName age department(Enum)

### Event
eventId eventname location date time

## packages
### controller
contains StudentController and EventController class

### model
contains Student.java and Event.java class

### service
contains StudentService and Event.service class

### repository
conatains IStudentrepo and IEventRepo interface extends CrudRepository interface

## endpoints
add, get, update, delete

#Project Summary
This project is made for managing an event in university; it is working managing event and student details.
