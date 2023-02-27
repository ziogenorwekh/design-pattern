package facade;

import java.util.HashMap;

public class DBMS {
    private HashMap<String, Row> db = new HashMap<>();

    public DBMS() {
        db.put("jane", new Row("Jane", "1990-02-14", "hello@jane.co.kr"));
        db.put("robort", new Row("Robort", "1979-11-05", "nic@googing.co.kr"));
        db.put("dorosh", new Row("Dorosh", "1985-12-04", "dosohr@dot.net"));
    }

    public Row query(String name) {
        try {
            System.out.println("Loading.......");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return db.get(name.toLowerCase());
    }
}
