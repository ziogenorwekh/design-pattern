package facade;

public class MainEntry {
    public static void main(String[] args) {
//        DBMS dbms = new DBMS();
//        Cache cache = new Cache();
        Facade facade = new Facade();
//        jane
//        dorosh
//        robort
        String name = "Dorosh";
        String name1 = "Jane";
        String name2 = "Robort";
        facade.run(name);
        facade.run(name1);
        facade.run(name2);

        try {
            System.out.println("Ready....");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------------------");

        facade.run(name);
        facade.run(name1);
        facade.run(name2);


//        Row row = cache.get(name);
//        if (row == null) {
//            row = dbms.query(name);
//            if (row != null) {
//                cache.put(row);
//            }
//        }
//
//        if (row != null) {
//            Message message = new Message(row);
//
//            System.out.println(message.makeName());
//            System.out.println(message.makeBirthday());
//            System.out.println(message.makeEmail());
//        } else {
//            System.out.println(name + " is not exists.");
//        }
    }
}
