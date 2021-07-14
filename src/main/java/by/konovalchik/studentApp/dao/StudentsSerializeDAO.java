package by.konovalchik.studentApp.dao;

import by.konovalchik.studentApp.entity.Student;

import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class StudentsSerializeDAO implements StudentsDAO {
    private static final String FILE_PATH = "students.bin";


    @Override
    public void addStudent(Student student) {
        List<Student> students = getStudents();
        students.add(student);
        save(students);
    }

    @Override
    public void deleteStudent(int studentId) {
        List<Student> students = getStudents();
        students.remove(new Student(studentId));
        save(students);
    }

    @Override
    public void updateStudent(Student student) {
        List<Student> students = getStudents();
        int index = students.indexOf(student);
        if (index != -1){
            students.set(index, student);
            save(students);
        }

    }

    @Override
    public List<Student> getStudents() {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))){
            return (List<Student>) objectInputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    @Override
    public void searchStudent(String surname) {
        List<Student> students = getStudents();
        LocalDate ldNow = LocalDate.now();
        SurnameComparator comparator = new SurnameComparator();
        Student found = new Student(surname);
        int count = 0;
        for(Student student: students){
           if( (comparator.compare(student, found )) == 0){
              LocalDate ldStudent  = student.getDateOfBirth();
              int ageS = (int) ChronoUnit.YEARS.between(ldStudent,ldNow);
               System.out.println("Данные чтудента: " + student + " " + "возраст студента: " + ageS);
               count++;
           }
        }
        if(count == 0) System.out.println(String.format("Студент с фамилией %s не найден", surname));
    }


    @Override
    public void searchStudentsAge(int age) {
        List<Student> students = getStudents();
        int count1 = 0;
        LocalDate ldNow = LocalDate.now();
        for(Student student: students) {
            LocalDate ldStudent = student.getDateOfBirth();
            int ageF = (int) ChronoUnit.YEARS.between(ldStudent, ldNow);
            if (ageF < age) {
                System.out.println(student);
                count1++;
            }
        }
        if(count1 == 0) System.out.println(String.format("Студентов моложе %d не найдено", age));
    }


    private void save (List<Student> students){
       try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
             objectOutputStream.writeObject(students);
       }catch (IOException e){
           e.printStackTrace();
       }

    }
}
