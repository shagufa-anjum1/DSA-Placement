import java.util.HashMap;

public class Lec91_HashMapOperations_HashMap {

    public static void main(String args[]){
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert-0(1)
        hm.put("India", 100);
        hm.put("chaina", 90);
        hm.put("America", 70);

        System.out.println(hm);

        // get - o(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("US"));

        // ContainsKey-0(1)
        System.out.println(hm.containsKey("India")); // Ture
        System.out.println(hm.containsKey("US")); // False

        //Remove Operations-o(1)
        int india = hm.remove("India");
        System.out.println(india);
        System.out.println(hm);

        System.out.println(hm.remove("US"));
        System.out.println(hm);

    }
}
