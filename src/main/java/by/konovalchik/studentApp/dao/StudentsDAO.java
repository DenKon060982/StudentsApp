package by.konovalchik.studentApp.dao;

import by.konovalchik.studentApp.entity.Student;

import java.util.List;

public interface StudentsDAO {

    void addStudent(Student student);

    void deleteStudent(int studentId);

    void updateStudent(Student student);

    List<Student> getStudents();

    void searchStudent(String surname);

    void searchStudentsAge(int age);






}
