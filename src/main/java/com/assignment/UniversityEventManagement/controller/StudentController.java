package com.assignment.UniversityEventManagement.controller;

import com.assignment.UniversityEventManagement.model.Event;
import com.assignment.UniversityEventManagement.model.Student;
import com.assignment.UniversityEventManagement.model.Type;
import com.assignment.UniversityEventManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@Validated
public class StudentController<department> {
    @Autowired
    StudentService studentService;

    //get All Student
    @GetMapping("student")
    public Iterable getAllStudents(){
        return studentService.getAllStudents();
    }
    // get student by id
    @GetMapping("student/{studentId}")
    public Optional getStudentbyId(@PathVariable Integer studentId){
        return studentService.getStudentbyId(studentId);
    }

    //save a entity
    @PostMapping("student")
    public String addStudent(@Valid @RequestBody Student student){
        return studentService.addStudent(student);
    }

    //delete student
    @DeleteMapping("student")
    public String deleteStudent(@RequestBody Student student){
        return studentService.deleteStudent(student);
    }

    //update department
    @RequestMapping("department/{studentId}/{department}")
    public String updateDepartmentbyId(@PathVariable Integer studentId,@PathVariable Type department){
        return studentService.updateDepartmentbyId(studentId,department);
    }

}
