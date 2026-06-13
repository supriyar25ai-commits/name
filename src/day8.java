abstract class Employee {
    String name;
    int id;
    int salary;

    abstract void solveProblems();

    void work() {
        System.out.println(name + " is working");
    }
}