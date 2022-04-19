package Design_Patterns.Prototype;

import java.util.StringJoiner;

public class App {

    public static void main(String[] args) {
        Store store1 = new Store("Default", "Default", "Default", "Default");

        Store store2 = store1.clone();
        store2.setName("Toko Vin");

        Store store3 = store1.clone();
        store3.setName("Toko Merdeka");
        store3.setCity("Blitar");

        testAll(store1);
        testAll(store2);
        testAll(store3);

    }

    public static void testAll(Store data){
        StringJoiner result = new StringJoiner("\n");
        result.add(data.getName());
        result.add(data.getCity());
        result.add(data.getCountry());
        result.add(data.getCategory());
        result.add("-----------------------------------");
        System.out.println(result);
    }

}
