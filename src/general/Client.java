package general;

import java.util.List;

public class Client {
    int id;
    String name;
    int age;
    private static int idCounter = 0;

    public Client(String name, int age) {
        this.id = ++idCounter;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  name +
                ", id= " + id +
                ", age= " + age + ']';
    }
}