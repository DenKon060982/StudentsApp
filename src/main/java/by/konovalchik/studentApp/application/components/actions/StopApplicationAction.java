package by.konovalchik.studentApp.application.components.actions;

import by.konovalchik.studentApp.exceptions.StopApplicationException;

public class StopApplicationAction implements Action {
    @Override
    public void apply() {
        throw new StopApplicationException();
    }
}
