package w6;

public class employee_test {

    public static void main(String[] args) {
        employee e1 = new employee("ata", 1000);
        e1.printInfo();
        
        employee e2 = new employee("essa", 500);
        e2.printInfo();
        
        employee e3 = new employee();
        e3.name = "ahmad";
        e3.printInfo();
    }
}
