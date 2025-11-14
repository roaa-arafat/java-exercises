package w2;

import java.util.Scanner;

public class w2_task1 {

    public static void main(String[] args) {
        //task 1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number :");
        double number = input.nextDouble();
        System.out.println("the double of number" + number + "is : " + number * 2);

        //task 2
        System.out.println("Enter any number :");
        number = input.nextDouble();
        if (number % 2 == 0) {
            System.out.println(" Number" + number + "is even so the double of number is : " + number * 2);
        } else {
            System.out.println(" Number" + number + "is odd so the square of number is : " + Math.pow(number, 2));
        }

    }

}
