import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HW06 {
    public static void main(String[] args) {
        ArrayList<String> t1 = new ArrayList<>();
        t1.add("London");
        t1.add("Lviv");
        t1.add("New York");
        t1.add("Kyiv");
        t1.add("Ivano-Frankivsk");
        System.out.println(t1.contains("Kyiv"));

        String [] cities = {"London", "Lviv", "New York", "Kyiv", "Ivano-Frankivsk"};
        String targetCity = "New York";
        boolean cityFound = false;
        for (String city : cities) {
            if (city.equals(targetCity)){
                cityFound = true;
                break;
            }

        }
        System.out.println(cityFound);

        ArrayList<String> T2 = new ArrayList<>();
        T2.add("London");
        T2.add("Lviv");
        T2.add("London");
        T2.add("Kyiv");
        T2.add("Lviv");

        Set<String>UniqT2 = new HashSet<>(T2);

        for (String city : UniqT2) {
            System.out.println(city);

        }



    }


}
