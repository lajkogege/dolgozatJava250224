package modell;

import java.util.List;
import java.util.UUID;

public class Jarmu {
    private UUID  id;
    private String szín;
    private Tulajdonos tulajdonos;
    private List<Jarmu> jarmuvek;


    public Jarmu() {
    }

    public Jarmu(UUID id, String szín, String tulajdonos) {
        this.id = idGenerelas();

        this.szín = szín;
        this.tulajdonos = new Tulajdonos();
        //jarmuvek = new ArrayList<>();
       // jarmuvek.add(new Jarmu(id,"piros","Zoli"));
        //jarmuvek.add(new Jarmu(id,"zöld", "Elek"));
    }

    private UUID idGenerelas() {
        return  id = UUID.randomUUID();

    }

    public UUID getId() {
        return id;
    }

    public Tulajdonos getTulajdonos() {
        return tulajdonos;
    }

    public String getSzín() {
        return szín;
    }

    public void setSzín(String szín) {
        this.szín = szín;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setTulajdonosok(Tulajdonos tulajdonosok) {
        this.tulajdonos = tulajdonosok;
    }

   /* @Override
    public Object clone() throws CloneNotSupportedException {
        Jarmu ujJarmu = new Jarmu(this.id, this.szín,this.tulajdonos);
        return ujJarmu;

    }*/
}
