package Lista9;

public class Balloon {
    double hel;
    double udzwigKilo = 0.007/0.006;
    double udzwigBalon;
    public Balloon(){
        this.hel = (double)((int)(Math.random()*5+5))/1000;
        System.out.println(hel);
        getLoad();
    }
    public void getLoad(){
        double udzwig=(this.hel * this.udzwigKilo);
        System.out.println(udzwig);
        this.udzwigBalon = udzwig;
    }
}
