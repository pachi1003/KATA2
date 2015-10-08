
package javaapplication1;

import java.util.HashMap;

public class Kata2 {
    public static void main(String[] args){
        int[] array= {1, 4, -4, 7, 1, 1, 8, 4, 1, 4, 9,100};
        
        Histogram histo = new Histogram(array);
        HashMap<Integer, Integer> histogram=histo.getHisto();
        
        for (int key : histogram.keySet()) {
            System.out.println(key + " : "+ histogram.get(key));
            
        }
    
    }
}
