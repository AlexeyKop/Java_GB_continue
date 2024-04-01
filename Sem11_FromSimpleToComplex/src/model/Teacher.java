package model;

// наследники от User
public class Teacher extends User {
    private int teacherId;
    // т.к. в User был конструктор, то и сюда тоже добавляем
    public Teacher(String firstName, String secondName, String lastName, int teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }
    // добавляем Геттеры, Сеттеры и метод ToString

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + teacherId +
                super.toString() +
                '}';
    }
}
