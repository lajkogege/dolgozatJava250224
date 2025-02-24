package modell;


import java.util.ArrayList;
import java.util.List;

public class Auto {
    private String rendszam;
    private int ferohely;
    private double ar;
    private List<Auto> autok;

    public Auto(String rendszam, int ferohely, double ar) {
        this.rendszam = rendszam;
        this.ferohely = ferohely;
        this.ar = ar;
        //autok = new ArrayList<>();
        //autok.add(new Auto("ABC-123",5,600000));
       // autok.add(new Auto("ABC-126",3,600000));
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getFerohely() {
        return ferohely;
    }

    public double getAr() {
        return ar;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    public void egyFromaAuto(String rendszam, int ferohohely){

    }

    public void rndRendezes(){


    }
    public void nemLetezoutoException (){

    }
    /*public void rendszamHat(){
        Exception NemLetezoAutoException {
            return;
        }
    }*/

}
