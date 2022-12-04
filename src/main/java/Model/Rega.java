package Model;

import java.util.ArrayList;
import java.util.List;

public class Rega {

    private String anschrift;
    private String base;
    private List<Ausweis> ausweise = new ArrayList<>();
    private List<Goenner> goenner;

    public Rega(String anschrift, String base) {
        this.anschrift = anschrift;
        this.base = base;

        ausweise.add(new Ausweis(true, false, 23));
        ausweise.add(new Ausweis(false, false, 8));
        ausweise.add(new Ausweis(false, true, 37));
        ausweise.add(new Ausweis(false, false, 15));
    }

    public Rega(String anschrift, List<Ausweis> ausweise, List<Goenner> goenner) {
        this.anschrift = anschrift;
        this.ausweise = ausweise;
        this.goenner = goenner;
    }

    public String getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public List<Ausweis> getAusweise() {
        return ausweise;
    }

    public void setAusweise(List<Ausweis> ausweise) {
        this.ausweise = ausweise;
    }

    public List<Goenner> getGoenner() {
        return goenner;
    }

    public void setGoenner(List<Goenner> goenner) {
        this.goenner = goenner;

        int i = 0;
        for (Goenner g : goenner ) {
            g.setAusweis(ausweise.get(i));
            i++;
        }
    }

    @Override
    public String toString() {
        return "Rega{" +
                "anschrift='" + anschrift + '\'' +
                ", base='" + base + '\'' +
                ", ausweise=" + ausweise +
                ", goenner=" + goenner +
                '}';
    }

    public Ausweis getAusweis(int index) {
        return ausweise.get(index);
    }
}
