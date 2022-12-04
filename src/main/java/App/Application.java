package App;

import Model.Goenner;
import Model.Rega;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private Rega rega;
    private List<Goenner> goennerList;

    public static void main(String[] args) {

        Application app = new Application();

        app.rega = new Rega("test", "Zürich");

        app.goennerList = new ArrayList<>();
        app.goennerList.add(new Goenner("Alex", 32));
        app.goennerList.add(new Goenner("Gertrud", 99));
        app.goennerList.add(new Goenner("Roman", 45));

        app.rega.setGoenner(app.goennerList);

        System.out.println(app.rega.toString());
    }
}
