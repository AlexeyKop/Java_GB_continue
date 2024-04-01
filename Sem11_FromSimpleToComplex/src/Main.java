import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("A", "AA", "AAA");
        controller.createStudent("B", "BB", "BBB");
        controller.getAllStudent();
        controller.createStudent("C", "CC", "CCC");
        controller.createStudent("D", "DD", "DDD");
        controller.getAllStudent();


    }
}
