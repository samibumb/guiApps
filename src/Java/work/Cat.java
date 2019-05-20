package Java.work;

public class Cat {
    private static Cat ourInstance = new Cat();

    private String name;

    private int age ;


    public static Cat getInstance() {
        return ourInstance;
    }

    private Cat() {
    }

    public String toString(){

        return name+" "+age;
    }
}
