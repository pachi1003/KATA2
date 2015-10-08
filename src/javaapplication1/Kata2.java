
package javaapplication1;

import java.util.HashMap;

public class Kata2 {
    public static void main(String[] args){
        Integer [] array= {1, 4, -4, 7, 1, 1, 8, 4, 1, 4, 9,100};
        String [] array1= {"Ana","Juan","Pedro","Juan","Juan","Pedro"};
        
        Histogram histo = new Histogram(array);
        HashMap<Integer, Integer> histogram=histo.getHisto();
        
        for (Object key : histogram.keySet()) {
            System.out.println(key + " : "+ histogram.get(key));
            
        }
    
    }
}
