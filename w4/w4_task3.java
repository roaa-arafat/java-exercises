package w4;

public class w4_task3 {

    public static void main(String[] args) {
        int n = w4_task2.readNumber();
        int n1 = w4_task2.readNumber();
        int n2 = w4_task2.readNumber();

        int a[] = new int[n];
        fillArray(a);
        printArray(a);
    }

    public static void fillArray(int x[]) {
        for (int i = 0; i < x.length; i++) {
            x[i] = w4_task2.readNumber();
        }
    }

    public static void printArray(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

}
