package service;

import data.Student;
import data.StudentGroup;
import data.UserComparator;
import data.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    private data.StudentGroup studentGroup;

    public void createStudentGroup(Teacher teacher, List<data.Student> students) {
        this.studentGroup = new data.StudentGroup(teacher, students);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public data.Student getStudentFromStudentGroup(String firstName, String secondName){
        Iterator<data.Student> iterator = studentGroup.iterator();
        List<data.Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            data.Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
               && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public List<data.Student> getSortedStudentGroup(){
        List<data.Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }

    public List<data.Student> getSortedByFIOStudentGroup(){
        List<data.Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
