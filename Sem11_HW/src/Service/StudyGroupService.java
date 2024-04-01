package Service;

import Model.Student;
import Model.StudyGroup;
import Model.Teacher;

import java.util.List;

// Класс сервиса для работы с учебными группами
public class StudyGroupService {

    // Метод формирования учебной группы из учителя и списка студентов
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        // Создаем новую учебную группу
        StudyGroup studyGroup = new StudyGroup(teacher, students);
        return studyGroup;
    }
}

