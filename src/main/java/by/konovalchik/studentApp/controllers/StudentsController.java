package by.konovalchik.studentApp.controllers;

import by.konovalchik.studentApp.entity.Student;
import by.konovalchik.studentApp.exceptions.DuplicateStudentException;

import java.util.List;

public interface StudentsController {

    void addStudent(Student student) throws DuplicateStudentException;

    void deleteStudent(int studentId);

    void updateStudent(Student student);

    List<Student> getStudents();

    void searchStudent(String surname);

    void searchStudentsAge(int age);

}
