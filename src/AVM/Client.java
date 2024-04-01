package AVM;
/**
 * ProjectAVM
 * @author Valerian
 * @version 01.04.2024
 */


public class Client {
    String name;
    int ID;
    int age;

    public Client(String name, int phoneNumber, int age) {
        this.name = name;
        this.ID = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }
}
