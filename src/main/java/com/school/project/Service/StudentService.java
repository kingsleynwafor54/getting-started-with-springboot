package com.school.project.Service;

import com.school.project.Dao.StudentDao;
import com.school.project.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;
@Service


public class StudentService {
    @Autowired
    private StudentDao studentDao;

//  @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudent(){
        return this.studentDao.getAllStudent();
    }
//@RequestMapping(value="/{id}",method=RequestMethod.GET)
    public Student getStudentById(int id){
      return this.studentDao.getStudentById(id);
}

public void updateStudent(Student student){
     this.studentDao.updateStudent(student);
}
public void deleteStudent(int id){
        studentDao.deleteStudentById(id);
}
public void insertStudent(Student student){
        studentDao.insertStudent(student);
}
}
