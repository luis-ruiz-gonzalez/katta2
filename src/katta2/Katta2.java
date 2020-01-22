package katta2;

import java.util.HashMap;
import java.util.Map;

public class Katta2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int data[] = {4,7,4,6,2,32,6,3,6,3,65,2,3,6,};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        } 
  
    }
   
}
