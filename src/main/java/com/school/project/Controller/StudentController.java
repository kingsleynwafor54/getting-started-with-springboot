package com.school.project.Controller;

import com.school.project.Entity.Student;
import com.school.project.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(method=RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudent();
    }
    @RequestMapping(value="/{id}",method= RequestMethod.GET)
    public Student getStudentById(@PathVariable("id")int id){
        return studentService.getStudentById(id);
    }
    @RequestMapping(method=RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }
    @RequestMapping(value="/{id}",method =RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id){
        studentService.deleteStudent(id);
    }
    @RequestMapping(method= RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
    }
}
