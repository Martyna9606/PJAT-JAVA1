package Lista10;

public class QMain {
    public static void main(String[] args){

        Welder welder = new Welder("Przyklad", "Martyna");
        System.out.println(welder.getString());

        Welder welder1 = new Welder("Przyklad 2", "Anna");
        System.out.println(welder1.getString());

        Jam jam = new Jam("Strawberry", 80);
        Jam jam1 = new Jam(88);
        Jam jam2 = new Jam("Chocolate");

        jam.getData();
        jam1.getData();
        jam2.getData();

        Tree tree = new Tree(true, 20, "Przyklad");
        System.out.println(tree.toString());

        ConiferTree contree = new ConiferTree(10, 20.5, false, 99, "Przyklad2");
        System.out.println(contree.toString());

        DeciduousTree dectre = new DeciduousTree(33, true, 68, "tadam");
        System.out.println(dectre.toString());

        FruitTree fruitTree = new FruitTree("Cytrynowiec", 20, true, 90, "PrzykladO");
        System.out.println(fruitTree.toString());

        //Zad.5
        Tree[] forest = {tree, contree, dectre, fruitTree};
        show(forest);


    }

    public static void show(Tree[] forest){
        for(Tree val: forest){
            System.out.println(val.toString());
        }
    }
}
