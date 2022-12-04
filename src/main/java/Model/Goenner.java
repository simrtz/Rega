package Model;

public class Goenner {

    private String name;
    private int age;
    private Ausweis ausweis;

    public Goenner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Ausweis getAusweis() {
        return ausweis;
    }

    public void setAusweis(Ausweis ausweis) {
        this.ausweis = ausweis;
    }

    @Override
    public String toString() {
        return "Goenner{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", ausweis=" + ausweis +
                '}';
    }
}
