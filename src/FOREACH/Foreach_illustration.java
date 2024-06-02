package FOREACH;

public class Foreach_illustration {
    public void myMethod() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int sum = 0;
        for (int e : numbers) {
            sum += e;
            System.out.println(sum);
        }

        String[] strings = {"Привет", "Пока", "Джава"};
        for (String e : strings) {
            System.out.println(e);
        }

        String[] strings2 = new String[7];
        strings2[0] = "Строка 1";
        strings2[1] = "Строка 2";
        strings2[2] = "Строка 3";
        strings2[3] = "Строка 4";
        strings2[4] = "Строка 5";

        for (int i = 0; i < strings2.length; i++) {
            System.out.println(strings2[i]);
        }
    }
}
