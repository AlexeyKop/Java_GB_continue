package SRP;
// класс Работник (описывает сотрудника)
public class Employee {
    private String name;
    private String post;
    private int salary;

    public Employee(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }



}
