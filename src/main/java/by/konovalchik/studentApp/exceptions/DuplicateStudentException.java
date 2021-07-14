package by.konovalchik.studentApp.exceptions;

public class DuplicateStudentException extends Exception {

    private int id;

    public DuplicateStudentException(int id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return String.format("Студент с id = %dz уже существует", id);
    }
}
