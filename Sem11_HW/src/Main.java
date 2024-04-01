import Controller.Controller;
import Model.Student;
import Model.StudyGroup;
import Model.Teacher;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // Создаем учителя
        Teacher teacher = new Teacher("Марья Ивановна");

        // Создаем список студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("Алексей"));
        students.add(new Student("Света"));
        students.add(new Student("Петр"));
        students.add(new Student("Наташа"));


        // Создаем контроллер
        Controller controller = new Controller();

        // Вызываем метод контроллера для создания учебной группы
        StudyGroup studyGroup = controller.createStudyGroup(teacher, students);

        // Выводим информацию о созданной учебной группе
        System.out.println("Создана новая учебная группа:");
        System.out.println(studyGroup.getTeacher());
        System.out.println("Студенты:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student);
        }
    }
}