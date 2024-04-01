package model;

// наследники от User
public class Student extends User {
    private int studentId;
    // т.к. в User был конструктор, то и сюда тоже добавляем
    public Student(String firstName, String secondName, String lastName, int studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }
    // добавляем Геттеры, Сеттеры и метод ToString

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                super.toString() +
                '}';
    }
}
