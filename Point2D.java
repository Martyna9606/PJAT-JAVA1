package Lista9;

public class Point2D {
    char[] tab;
    public char[] get(){
        this.tab = new char[3];
        this.tab[0] = 'x';
        this.tab[1] = 'y';
        this.tab[2] = 1;
        return tab;
    }

    public Point2D(){
        get();

    }
    public void set(char x, char y){
        this.tab[0] = x;
        this.tab[1] = y;
    }

}
