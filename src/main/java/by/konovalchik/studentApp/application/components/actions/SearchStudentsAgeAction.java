package by.konovalchik.studentApp.application.components.actions;

import by.konovalchik.studentApp.application.utils.Input;

public class SearchStudentsAgeAction extends BaseAction implements Action{

    @Override
    public void apply() {
        int age = Input.getInt("Для пойска введите ВОЗРАСТ студентов");
        controller.searchStudentsAge(age);
    }
}
