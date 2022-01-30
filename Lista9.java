package Lista9;

import java.util.Scanner;

public class Lista9 {


    public static void main(String[] args){
        //Person p = new Person("Martyna", "Abram", 1996);
        //System.out.println(p.birthyear);

        //Fruit f = new Fruit("Banan");
        //f.show();

        Balloon b = new Balloon();
        Donkey donkey = new Donkey();
        donkey.addBalloon(b);
        Balloon b1 = new Balloon();
        donkey.addBalloon(b1);

        System.out.println("------");
        donkey.show();

        boolean wynik = donkey.isFlying();
        System.out.println(wynik);

        Point2D point = new Point2D();
        java.util.Scanner in = new java.util.Scanner(System.in);
        point.set(in.next().charAt(0), in.next().charAt(0));
        System.out.println(point.tab[0]);
        System.out.println(point.tab[1]);

    }

}
