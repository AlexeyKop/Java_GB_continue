package SRP;

public class EmployeeSalaryCalculate {
    private int baseSalary;
    // принимаем ч-з конструктор
    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    // метод подсчета зарплаты
    // выносим в отдельный класс
    public double salaryCalculate(){
        return baseSalary * 1.5;
    }
}
