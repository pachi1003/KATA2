/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;

public class Histogram <T> {
    private final T[] elVector;

    public Histogram(T[] elVector) {
        this.elVector = elVector;
    }
    
    public HashMap<T,Integer> getHisto(){
        HashMap<T, Integer> histo= new HashMap<>();
        
        for (int i = 0; i < elVector.length; i++) {
            if(!histo.containsKey(elVector[i])){
                histo.put(elVector[i], 1);
                
            }else{
                histo.put(elVector[i], histo.get(elVector[i]) + 1);
            }
            
        }
        return histo;
    }
}
