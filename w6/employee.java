package w6;

public class employee {

    String name;
    int salary;

    public employee() {
        salary = 290;
    }

    public employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("name : " + name + " , salary : " + salary);
    }

}
