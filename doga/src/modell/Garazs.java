package modell;

import java.util.List;
import java.util.UUID;

public class Garazs {
    private int ferhely;
    private List<Jarmu> garazsak;

    public Garazs() {

    }

    public Garazs(int ferhely, List<Jarmu> garazsak) {
        this.ferhely = ferhely;
        this.garazsak = garazsak;
    }

    public int getFerhely() {
        return ferhely;
    }

    public void setFerhely(int ferhely) {
        this.ferhely = ferhely;
    }

    public void garazsKi(String szin, String tulajdonos){
        Jarmu jarmu = new Jarmu();
        for(Jarmu j: garazsak) {
            garazsak.remove(new Jarmu(, szin,tulajdonos));
            setFerhely(-1);

        }
    }

    public void garazsBe(String szin, String tulajdonos){
        Jarmu jarmu = new Jarmu();
        for(Jarmu j: garazsak) {
            garazsak.add(new Jarmu(UUID.randomUUID(), szin,tulajdonos));
            setFerhely(+1);

        }
    }
}
