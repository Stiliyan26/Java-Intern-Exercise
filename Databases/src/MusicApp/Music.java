package MusicApp;

import model.Datasource;


public class Music {
    public static void main(String[] args) {
        Datasource datasource = new Datasource();

        if (!datasource.open()) {
            System.out.println("Can't open datasource");
        }

        datasource.close();
    }
}
