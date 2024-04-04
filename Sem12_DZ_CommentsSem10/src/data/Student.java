package data;

import java.time.LocalDate;

// Student и Teacher наследуются от User в пакете data
// Student и Teacher - это подтипы User. Они могут использоваться везде, где ожидается User,
// без изменения работы кода.
// Например, в классе StudentGroup и в методе createStudentGroup в StudentGroupService ожидается User,
// но мы можем передать туда и Student, и Teacher.
// Это соответствует принципу LSP - подклассы могут быть подставлены вместо своих суперклассов
// без изменения корректности программы.


public class Student extends User implements Comparable<Student>{
    private Long studentId;

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
               "studentId='" + studentId +'\'' +
               ", firstName='" + super.getFirstName() + '\'' +
               ", secondName='" + super.getSecondName() + '\'' +
               ", patronymic='" + super.getPatronymic() + '\'' +
               ", dateOfBirth=" + super.getDateOfBirth() +
               '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
