package by.konovalchik.studentApp.application.components.actions;

import by.konovalchik.studentApp.entity.Student;

public class UpdateStudentsAction extends BaseAction implements Action {
    @Override
    public void apply() {
        Student student = createStudent();
        controller.updateStudent(student);
    }
}
