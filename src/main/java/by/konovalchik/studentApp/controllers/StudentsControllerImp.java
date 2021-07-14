package by.konovalchik.studentApp.controllers;

import by.konovalchik.studentApp.dao.StudentsDAO;
import by.konovalchik.studentApp.dao.StudentsSerializeDAO;
import by.konovalchik.studentApp.entity.Student;
import by.konovalchik.studentApp.exceptions.DuplicateStudentException;

import java.util.List;

public class StudentsControllerImp implements StudentsController {
    private StudentsDAO dao = new StudentsSerializeDAO();



    @Override
    public void addStudent(Student student) throws DuplicateStudentException {
        if(dao.getStudents().contains(student)){
            throw new DuplicateStudentException(student.getId());
        }
        dao.addStudent(student);
    }

    @Override
    public void deleteStudent(int studentId) {
         dao.deleteStudent(studentId);

    }

    @Override
    public void updateStudent(Student student) {
        dao.updateStudent(student);
    }

    @Override
    public List<Student> getStudents() {
        return dao.getStudents();
    }

    @Override
    public void searchStudent(String surname) {
       dao.searchStudent(surname);
    }

    @Override
    public void searchStudentsAge(int age) {
        dao.searchStudentsAge(age);
    }
}
