package Lista9;

public class Donkey {
    double mass;
    Balloon[] balon = new Balloon[0];
    double pelenUdzwig;

    public Donkey(){
        this.mass = Math.random()*10;
        this.pelenUdzwig = 0;
    }
    public void addBalloon(Balloon nowyElement){

        Balloon[] nowyBalon = new Balloon[this.balon.length+1];
        for(int i =0; i < this.balon.length;i++){
            nowyBalon[i] = this.balon[i];
        }
        nowyBalon[nowyBalon.length-1] = nowyElement;
        this.balon = nowyBalon;
        this.pelenUdzwig += nowyElement.udzwigBalon;
        nowyBalon = null;
    }

    public boolean isFlying(){
        boolean wynik = this.pelenUdzwig > this.mass;
        return wynik ? true:false;
    }

    public void show(){
        for(int i = 0 ; i< this.balon.length ; i++){
            System.out.println(this.balon[i].udzwigBalon);
        }
    }
}
