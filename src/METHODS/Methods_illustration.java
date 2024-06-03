package METHODS;

import ClassAndOBJECTS.*;

public class Methods_illustration{
    public void speak(Person per) {
        System.out.println("Меня зовут " + per.name + ", мне " + per.age + " лет.");
        // обратиться к полям name & age можно только если они будут public
        // так же пришлось сделать класс Person отдельным классом public
    }
    public void sayHello() {
        System.out.println("Hi");
    }

    public int calculateYearsToRetirement(Person p) {
        int years = 65 - p.age;
        return years;
    }
}
