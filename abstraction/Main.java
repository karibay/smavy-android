package abstraction;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRunning = true;
        Calculator calculator = new Calculator();
        while (isRunning) {
            System.out.println("0. Exit\n" +
                    "1. Create Rectangle.\n" +
                    "2. Create Circle" +
                    "3. Show total area");
            int option = in.nextInt();
            switch (option) {
                case 0:
                    isRunning = false;
                    break;
                case 1:
                    System.out.println("Enter side A and B");
                    int sideA = in.nextInt();
                    int sideB = in.nextInt();
                    calculator.addShape(new Rectangle(sideA, sideB));
                    break;
                case 2:
                    System.out.println("Enter radius");
                    int radius = in.nextInt();
                    calculator.addShape(new Circle(radius));
                    break;

                case 3:
                    System.out.println(calculator.getTotalArea());
            }
        }
    }
}
