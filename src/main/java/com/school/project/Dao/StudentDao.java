package com.school.project.Dao;

import com.school.project.Entity.Student;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {
private static Map<Integer, Student> students;

static{
    students=new HashMap<Integer,Student>(){
        {
         put(1,new Student(1,"Said","Computer Science"));
         put(2,new Student(2,"Mofe","Physics"));
         put(3,new Student(3,"Alex","Finance"));
         put(4,new Student(4,"Anna","Maths"));
        }

    };
}
public Collection<Student> getAllStudent(){
    return this.students.values();
}
public Student getStudentById(int id){
    return students.get(id);
}
public void updateStudent(Student student){
    Student s=students.get(student.getId());
    s.setCourse(student.getCourse());
    s.setName(student.getName());
    students.put(student.getId(),student);

}
public void deleteStudentById(int id){
     students.remove(id);
}
    public void insertStudent(@RequestBody Student student){
      this.students.put(student.getId(),student);
    }

}
