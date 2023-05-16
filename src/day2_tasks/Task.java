package day2_tasks;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");

        int sum = 0;
        sum = s.nextInt();

        for (int i = 0; i < 4; i++) {
            System.out.println("enter next number");
            sum += s.nextInt();

        }
        System.out.println(sum);






    }
}
