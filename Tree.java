package Lista10;

public class Tree {
    boolean alwaysGreen;
    int hight;
    String crossSection;

    Tree(boolean alwaysGreen, int hight, String crossSection){
        this.alwaysGreen = alwaysGreen;
        this.hight = hight;
        this.crossSection = crossSection;
    }

    public String toString(){
       return this.crossSection+ " " + this.hight + " " + this.alwaysGreen;
    }

}
