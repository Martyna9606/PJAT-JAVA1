package Lista10;

public class Jam {
    private String taste;
    private double weight;

    public Jam(String taste, double weight){
        this.taste = taste;
        this.weight = weight;
    }

    public Jam(double weight){
        this("No name", weight);
    }

    public Jam(String taste){
        this(taste, 100.0);
    }

    public void getData(){
        System.out.println(this.taste + " " + this.weight);

    }

}
