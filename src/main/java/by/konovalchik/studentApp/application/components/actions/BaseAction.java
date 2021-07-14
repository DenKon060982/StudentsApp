package by.konovalchik.studentApp.application.components.actions;

import by.konovalchik.studentApp.application.utils.Input;
import by.konovalchik.studentApp.controllers.StudentsController;
import by.konovalchik.studentApp.controllers.StudentsControllerImp;
import by.konovalchik.studentApp.dao.StudentsDAO;
import by.konovalchik.studentApp.entity.Student;

import java.time.LocalDate;

public abstract class BaseAction {
    protected StudentsController controller = new StudentsControllerImp();

    protected Student createStudent(){
        int id = Input.getInt("Введите id");
        String name = Input.getString("Введите имя");
        String surname = Input.getString("Введите фамилию");
        int year = Input.getInt("Введите год (гггг)");
        int month = Input.getInt("Введите месяц");
        int day = Input.getInt("Введите день");
        return new Student(id,name,surname, LocalDate.of(year,month,day));

    }


}
