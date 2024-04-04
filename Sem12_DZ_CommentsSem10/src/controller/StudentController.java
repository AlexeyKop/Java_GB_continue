package controller;

import data.Student;
import data.Teacher;
import data.StudentGroupIterator;
import service.StudentGroupService;
import service.StudentService;
import view.StudentView;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

// Классы StudentController и TeacherController в пакете controller
// Эти классы работают с интерфейсами UserService и UserController, а не напрямую с конкретными
// реализациями TeacherService и StudentService.
// Например, в StudentController в методе create используется UserService для создания студента,
// без привязки к конкретной реализации (StudentService).
// Это соответствует принципу DIP - классы зависят от абстракций (интерфейсов), а не от конкретных реализаций.


public class StudentController implements UserController<data.Student>{

    private final StudentService dataService = new StudentService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        studentView.sendOnConsole(dataService.getAll());
    }

    public void createStudentGroup(Teacher teacher, List<data.Student> students){
        studentGroupService.createStudentGroup(teacher, students);
        studentView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
    }

    public void getStudentInStudentGroup(String firstName, String secondName){
        data.Student student = studentGroupService.getStudentFromStudentGroup(firstName, secondName);
        studentView.sendOnConsole(Collections.singletonList(student));
    }

    public void getSortedListStudentFromStudentGroup(){
        List<data.Student> students = studentGroupService.getSortedStudentGroup();
        studentView.sendOnConsole(students);
    }

    public void getSortedListByFIOStudentFromStudentGroup(){
        List<Student> students = studentGroupService.getSortedByFIOStudentGroup();
        studentView.sendOnConsole(students);
    }
}
