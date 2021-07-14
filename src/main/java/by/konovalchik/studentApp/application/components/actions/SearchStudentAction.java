package by.konovalchik.studentApp.application.components.actions;

import by.konovalchik.studentApp.application.utils.Input;

public class SearchStudentAction extends BaseAction implements Action {

    @Override
    public void apply() {
        String surname = Input.getString("Для пойска введите ФАМИЛИЮ студента");
        controller.searchStudent(surname);
    }
}
