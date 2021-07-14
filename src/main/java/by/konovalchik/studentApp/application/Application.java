package by.konovalchik.studentApp.application;

import by.konovalchik.studentApp.application.components.Button;
import by.konovalchik.studentApp.application.utils.Input;
import by.konovalchik.studentApp.exceptions.StopApplicationException;

import java.util.Map;

public class Application {

    public void start(){
        System.out.println("Добро пожаловать");
        run();
        System.out.println("Всего доброго");
    }

    private void run() {
        while (true){
            Button button = selectButton();
            try {
                button.click();
            } catch (StopApplicationException e){
                break;
            }
        }
    }

    private Button selectButton(){
        showMenu();
        int key = Input.getInt();
        if (Config.BUTTONS.containsKey(key)){
            return Config.BUTTONS.get(key);
        }
        System.out.println("Нет такого действия!!! Повторите ввод");
        return selectButton();
    }

    private void showMenu(){
        System.out.println("Выберите действие");
        for (Map.Entry<Integer, Button> item: Config.BUTTONS.entrySet()){
            System.out.println(item.getKey() + " - " + item.getValue().getName());
        }
    }



}
