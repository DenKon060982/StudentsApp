package by.konovalchik.studentApp.application.components.actions;


import by.konovalchik.studentApp.entity.Student;

import java.util.List;

public class ShowStudentsAction extends BaseAction implements Action {

    @Override
    public void apply() {
        System.out.println("#################");
        List<Student> students = controller.getStudents();
        for(Student student: students){
            System.out.println(student);
        }
        System.out.println("#################");
    }
}
