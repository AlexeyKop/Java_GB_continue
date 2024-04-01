package controller;

import model.Type;
import model.User;
import service.DataService;
import view.StudentView;

import java.rmi.StubNotFoundException;
import java.util.List;

public class Controller {
    // приватное финальное поле
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();

    // метод по созданию студента
    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }
    // выведем всех student на экран
    public void getAllStudent(){
        List<User> userList = dataService.getAllStudent();
        for(User user : userList)
            studentView.printOnConsole(user);
    }
}
