package Java.work.factory;

public class GuitarClass implements Guitar {

    int strings;

    String elements;

    public GuitarClass(int strings, String elements) {
        this.strings = strings;
        this.elements = elements;
    }



    @Override
    public int getStrings() {
        return strings;
    }

    @Override
    public String getElements() {

        return elements;
    }
}
