package by.konovalchik.studentApp.application;

import by.konovalchik.studentApp.application.components.Button;
import by.konovalchik.studentApp.application.components.actions.*;

import java.util.HashMap;
import java.util.Map;

public class Config {
    public static final Map<Integer, Button> BUTTONS = new HashMap<>();

    static {
        BUTTONS.put(1, new Button("Добавить студента", new AddStudentAction()));
        BUTTONS.put(2, new Button("Вывод списка студентов", new ShowStudentsAction()));
        BUTTONS.put(3, new Button("Редактирование студента", new UpdateStudentsAction()));
        BUTTONS.put(4, new Button("Удаление студента", new DeleteStudent()));
        BUTTONS.put(5, new Button("Поиск студента по фамилии", new SearchStudentAction()));
        BUTTONS.put(6, new Button("Поиск студентов младше введённого возраста", new SearchStudentsAgeAction()));
        BUTTONS.put(9, new Button("Выход", new StopApplicationAction()));
    }

}
