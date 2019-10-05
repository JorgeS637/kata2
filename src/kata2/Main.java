package kata2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int data[] = {2, 5, 5, 9, 8, 12, 5, 9, 4, 12, 6, 5, 6, 7, 2};
        Map <Integer, Integer> histogram = new HashMap<>();
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) +1 : 1);
        }
        for(Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey()+ "==>" + entry.getValue());
        }
        
        
    }
    
}
