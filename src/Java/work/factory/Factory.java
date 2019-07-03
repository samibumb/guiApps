package Java.work.factory;

public class Factory {

    public static Guitar createGuitar(int strings,String elements){

        return new GuitarClass(strings,elements);
    }
}
