package GETTERandSETTER;

public class Getters_and_Setters {
    public void method_Setter(PersonForGetter person, String name, int age) {
        person.setName(name);
        person.setAge(age);
    }

    public void method_Getter(PersonForGetter person) {
        System.out.print(person.getName() + " ");
        System.out.println(person.getAge());
    }
}

