package com.assignment.UniversityEventManagement.service;

import com.assignment.UniversityEventManagement.model.Student;
import com.assignment.UniversityEventManagement.model.Type;
import com.assignment.UniversityEventManagement.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    public Iterable getAllStudents() {
        return studentRepo.findAll();
    }


    public Optional getStudentbyId(Integer studentId) {
        return studentRepo.findById(studentId);
    }

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "a student added";
    }

    public String deleteStudent(Student student) {
        studentRepo.delete(student);
        return "deleted.";
    }


    public String updateDepartmentbyId(Integer studentId, Type department) {
        Iterable<Student> studentIterable = studentRepo.findAll();
        for(Student student: studentIterable){
            if(student.getStudentId()==studentId){
                student.setDepartment(department);
                return "department updated!";
            }
        }
        return "unable to update!";
    }
}
