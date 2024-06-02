package SWITCH;

import java.util.Scanner;

public class Switch_illustration {
    public void myMethod() {
        while (true) {
            System.out.println("Введите ваш возраст: ");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();


            switch (age) {
                case 0:
                    System.out.println("Ты родился");
                    break;
                case 7:
                    System.out.println("Ты пошёл в школу");
                    break;
                case 18:
                    System.out.println("Ты закончил школу");
                    break;
                default:
                    System.out.println("Чё то ты сделал не так");

            }
            if (age == 30) {
                break;
            }
        }
    }
}
