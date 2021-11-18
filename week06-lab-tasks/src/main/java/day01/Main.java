package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PositiveNumberContainer positive = new PositiveNumberContainer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter next number!");
        double nextNumber = scanner.nextDouble();
        while (nextNumber > 0) {
                positive.addNumber(nextNumber);
                System.out.println("Enter next number!");
                nextNumber = scanner.nextDouble();
        }
        System.out.println(positive.getNumbers());
    }
}
