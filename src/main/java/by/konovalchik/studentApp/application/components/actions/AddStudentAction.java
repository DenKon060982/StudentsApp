package by.konovalchik.studentApp.application.components.actions;

import by.konovalchik.studentApp.entity.Student;
import by.konovalchik.studentApp.exceptions.DuplicateStudentException;

public class AddStudentAction extends BaseAction implements Action {

    public void apply(){
        Student student = createStudent();
        try{
            controller.addStudent(student);

        }catch(DuplicateStudentException e){
            System.out.println(e.getMessage());
        }
    }

}
