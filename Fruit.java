package Lista9;

public class Fruit {
    String name;
    double weight;

    public Fruit(String name){
        this.name = name;
        double min = 0.5, max = 0.8;
        this.weight = Math.random()*(max-min) + min;
    }

    public void show(){
        System.out.println("Nazwa: " + this.name);
        System.out.println("Waga: " + this.weight);
    }
}
