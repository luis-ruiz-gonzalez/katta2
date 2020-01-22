package katta2;


import java.util.Map;

public class Katta2 {

    public static void main(String[] args) {
        // TODO code application logic here
        String data[] = {"Rosa","Pepe","María","Pepe","Pepe","Rosa","Francisco","Marta","Juan","Juan"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<String, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        } 
  
    }
   
}
