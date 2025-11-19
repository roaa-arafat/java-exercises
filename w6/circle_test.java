package w6;

public class circle_test {

    public static void main(String[] args) {
        circle Circle[] = new circle[10];
        for (int i = 0; i < Circle.length; i++) {
            Circle[i] = new circle(1 + i);
        }

        for (int i = 0; i < Circle.length; i++) {
            System.out.println(Circle[i]);

        }

    }
}
