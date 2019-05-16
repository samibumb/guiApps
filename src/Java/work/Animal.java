package Java.work;

public class Animal {

    int id;

    String name;

    String breed;

    int age;

    public Animal(int id, String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String toString(){
        return name+" "+breed+" "+age;
    }
}
