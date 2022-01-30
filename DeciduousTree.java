package Lista10;

public class DeciduousTree extends Tree {
    int leaveShape;

    DeciduousTree(int leaveShape, boolean alwaysGreen, int hight, String crossSection){
        super(alwaysGreen, hight, crossSection);
        this.leaveShape = leaveShape;
    }

    @Override
    public String toString(){
        return this.leaveShape + " " + super.toString();
    }

}
