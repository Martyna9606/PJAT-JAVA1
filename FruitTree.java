package Lista10;

public class FruitTree extends DeciduousTree{
    String fruitName;

    public FruitTree(String fruitName, int leaveShape, boolean alwaysGreen, int hight, String crossSection){
        super(leaveShape, alwaysGreen, hight, crossSection);
        this.fruitName = fruitName;
    }

    @Override
    public String toString(){
        return this.fruitName + " " + super.toString();
    }
}
