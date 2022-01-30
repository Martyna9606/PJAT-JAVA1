package Lista10;

public class ConiferTree extends Tree {
    int needleQuantity;
    double coneLenght;

    ConiferTree(int needleQuantity, double coneLenght, boolean alwaysGreen, int hight, String crossSection){
        super(alwaysGreen, hight, crossSection);
        this.needleQuantity = needleQuantity;
        this.coneLenght = coneLenght;

    }

    @Override
    public String toString(){
        return this.needleQuantity + " " + this.coneLenght + " " + super.toString();
    }

}
