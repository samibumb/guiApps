package Java.work;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args){
        showMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number");
        int x= scanner.nextInt();
        ZOO zoo = new ZOO();
        while (x!=0){
            if (x==1){
                System.out.println("Create 4 animals");
                zoo.create();
            }else if (x==2){
                System.out.println("Show animals by\nName/Breed/Age");
                zoo.show();
            }else if (x==3){
                System.out.println("Delete");
                zoo.delete();
            }else if(x==0){
                System.out.println("Exit");
                System.exit(0);
            }
            x= scanner.nextInt();

        }

    }

    public static void showMenu(){
        System.out.println("1.Create");
        System.out.println("2.Show");
        System.out.println("3.Delete");
        System.out.println("0.Exit");
    }
}
