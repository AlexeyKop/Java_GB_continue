package service;

import data.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<data.Student> {

    private final List<data.Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<data.Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (data.Student student: students){
                if (student.getStudentId() > countMaxId){
                    countMaxId = student.getStudentId();
            }
        }
        countMaxId++;
        data.Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        students.add(student);
    }
}
