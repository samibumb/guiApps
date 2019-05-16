package Java.work;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ZOO {

    List<Animal> animalList = new ArrayList<>();

    public void create(){
       int x=1;
        while (x<=4) {
            System.out.println("Create an animal\nName/Breed,Age");
            Scanner scanner = new Scanner(System.in);
            int id=scanner.nextInt();
            String name = scanner.nextLine();
            String breed = scanner.nextLine();
            int age = scanner.nextInt();

            Animal animal = new Animal(id ,name, breed, age);
            System.out.println(animal);
            animalList.add(animal);
            if (x==1){
                JOptionPane.showMessageDialog(null,"1st animal created");
            }else if (x==2){
                JOptionPane.showMessageDialog(null,"2nd created");

            }else if (x==3){
                JOptionPane.showMessageDialog(null,"3rd animal created");

            }else if (x==4){
                JOptionPane.showMessageDialog(null,"All animals created");

            }
            x++;
        }

    }

    public void show() {
        Iterator<Animal> iterator = animalList.iterator();
        System.out.println("Animals created:");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public void delete(){
        animalList.remove(animalList.get(0));
    }
}
