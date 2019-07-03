package Java.work.factory;

public class Test {

    public static void main(String[] args){

        Guitar guitar=Factory.createGuitar(6,"neck,bridge,body");

        System.out.println(guitar.getStrings()+" "+guitar.getElements());
    }
}
