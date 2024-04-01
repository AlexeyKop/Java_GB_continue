package service;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

import java.util.ArrayList;
import java.util.List;

// этот класс агрегирует список всех наших User
public class DataService {
    private List<User> userList = new ArrayList<>();
    // создаем User-ов
    public void create(String firstName, String secondName, String lastName, Type type){
        // получаем ID нашего student или teacher
        int id = getFreeId(type);
        if(type == Type.STUDENT){
            userList.add(new Student(firstName, secondName, lastName, id));
        }
        if(type == Type.TEACHER){
            userList.add(new Teacher(firstName, secondName, lastName, id));
        }

    }
    // вспомогательный метод для поиска max Id
    private int getFreeId(Type type){
        // сравниваем type кого нам передали с type Student
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user : userList){
            if(user instanceof Teacher && !itsStudent)
                lastId = ((Teacher) user).getTeacherId() + 1;
            if(user instanceof Student && itsStudent)
                lastId = ((Student) user).getStudentId() + 1;
        }
        return lastId;
    }

    // возвращаем список всех наших студентов
    public List<User> getAllStudent(){
        List<User> result = new ArrayList<>();
        for (User user : userList){
            if(user instanceof Student)
                result.add(user);
        }
        return result;
    }
}
