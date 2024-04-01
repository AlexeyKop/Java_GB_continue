package Controller;

import Model.Student;
import Model.StudyGroup;
import Model.Teacher;
import Service.StudyGroupService;

import java.util.ArrayList;
import java.util.List;

// Класс контроллера
public class Controller {

    private StudyGroupService studyGroupService;

    public Controller() {
        this.studyGroupService = new StudyGroupService();
    }

    // Метод для формирования учебной группы и возвращения её
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        // Используем сервис для создания учебной группы
        return studyGroupService.createStudyGroup(teacher, students);
    }


}

