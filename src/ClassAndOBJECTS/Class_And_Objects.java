package ClassAndOBJECTS;

// У класса могут быть:
// 1. Данные (поля)
// 2. Действия, которые он может совершать (методы)

public class Class_And_Objects {
    public void myMethod() {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        System.out.println("Меня зовут " + person1.name + ", мне " + person1.age + " лет.");

        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        System.out.println("Меня зовут " + person2.name + ", мне " + person2.age + " лет.");
    }
}

