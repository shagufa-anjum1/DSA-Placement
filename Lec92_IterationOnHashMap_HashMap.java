import java.util.HashMap;
import java.util.Set;

public class Lec92_IterationOnHashMap_HashMap {


    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 290);
        hm.put("pakistan", 280);
        hm.put("bhutan", 295);
        hm.put("goa", 240);

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("key = "+k+", value = "+hm.get(k));
        }

        // hm.enterySet();
    }
}
