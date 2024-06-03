package GETTERandSETTER;

public class PersonForGetter {
    private String name;
    private int age;

    public void setName(String userName) { name = userName; }

    public String getName() { return name; }

    public void setAge(int userAge) { age = userAge; }

    public int getAge() { return age; }
}
