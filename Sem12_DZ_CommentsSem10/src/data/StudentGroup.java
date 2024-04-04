package data;

import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> students;
    private data.Teacher teacher;

    public StudentGroup(data.Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public data.Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
               "students=" + students +
               ", teacher=" + teacher +
               '}';
    }

    @Override
    public data.StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}
