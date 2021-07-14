package by.konovalchik.studentApp.application.components.actions;

import by.konovalchik.studentApp.application.utils.Input;

public class DeleteStudent extends BaseAction implements Action{

    @Override
    public void apply() {
        int id = Input.getInt("Введите id");
        controller.deleteStudent(id);
    }
}
