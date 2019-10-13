package kata2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String data[] = {"María","Juan","María","Pepe","Pepe","María"};
        Histogram histo = new Histogram(data);
        Map<String, Integer> histgr = histo.getHistogram();
        
        for(Map.Entry<String, Integer> entry : histgr.entrySet()) {
            System.out.println(entry.getKey()+ "==>" + entry.getValue());
        }
        
        
    }
    
}
