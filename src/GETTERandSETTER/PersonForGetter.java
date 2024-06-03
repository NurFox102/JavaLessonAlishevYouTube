package GETTERandSETTER;

public class PersonForGetter {
    private String name;
    private int age;

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Ввели пустую строку...");
        } else {
            this.name = name;
        }
    }

    public String getName() { return name; }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            System.out.println("Проверьте ввод данных...");
        } else {
            this.age = age; }
        }

    public int getAge() { return age; }
}
