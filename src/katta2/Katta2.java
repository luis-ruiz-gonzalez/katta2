package katta2;

import java.util.HashMap;
import java.util.Map;

public class Katta2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int data[] = {4,7,4,6,2,32,6,3,6,3,65,2,3,6,};
        Map<Integer,Integer>  histogram = new HashMap<>();
        
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i]) == true){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        } 
       
    }
   
}
