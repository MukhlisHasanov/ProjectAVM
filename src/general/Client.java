package general;

import java.util.List;

public class Client {
    String name;
    int id;
    // TODO write checker id
    // TODO write automated id++
    int age;

    public Client(String name, int id, int age) {
        this.name = name;
        this.id = id;
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

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "[name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age + ']';
    }
}
