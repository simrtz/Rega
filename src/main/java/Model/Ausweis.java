package Model;

public class Ausweis {

    private boolean isFamily;
    private boolean isMinor;
    private int mitgliedNummer;

    public Ausweis(boolean isFamily, boolean isMinor, int mitgliedNummer) {
        this.isFamily = isFamily;
        this.isMinor = isMinor;
        this.mitgliedNummer = mitgliedNummer;
    }

    public boolean isFamily() {
        return isFamily;
    }

    public void setFamily(boolean family) {
        isFamily = family;
    }

    public boolean isMinor() {
        return isMinor;
    }

    public void setMinor(boolean minor) {
        isMinor = minor;
    }

    public int getMitgliedNummer() {
        return mitgliedNummer;
    }

    public void setMitgliedNummer(int mitgliedNummer) {
        this.mitgliedNummer = mitgliedNummer;
    }

    @Override
    public String toString() {
        return "Ausweis{" +
                "isFamily=" + isFamily +
                ", isMinor=" + isMinor +
                ", mitgliedNummer=" + mitgliedNummer +
                '}';
    }
}
