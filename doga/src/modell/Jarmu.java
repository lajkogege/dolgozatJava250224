package modell;

import java.util.UUID;

public class Jarmu {
    private UUID id;
    private String szín;
    private Tulajdonos tulajdonos;

    public Jarmu(UUID id, String szín, String tulajdonos) {
        this.id = id;
        this.szín = szín;
        this.tulajdonos = new Tulajdonos(tulajdonos);
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

    public void setTulajdonos(Tulajdonos tulajdonos) {
        this.tulajdonos = tulajdonos;
    }
}
