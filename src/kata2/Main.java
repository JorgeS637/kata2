package kata2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int data[] = {2, 5, 5, 9, 8, 12, 5, 9, 4, 12, 6, 5, 6, 7, 2};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histgr = histo.getHistogram();
        
        for(Map.Entry<Integer, Integer> entry : histgr.entrySet()) {
            System.out.println(entry.getKey()+ "==>" + entry.getValue());
        }
        
        
    }
    
}
