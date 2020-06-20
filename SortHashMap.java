/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.*;

/**
 *
 * @author Abhishek
 */
public class SortHashMap {
    

    public static void main(String[] args) {
        
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        hm.put('A',5);
        hm.put('W',5);
        hm.put('Z',5);
        hm.put('2',5); hm.put('5',8);
        hm.put('Z',5);
        hm.put('D',9);
        hm.put('B',50);
        //hm.put('10',99); Compile Time Error 
        
        System.out.println(hm);
      TreeMap<Character,Integer> tm=new TreeMap<>(hm);
        System.out.println("----------After converting it to treeMap------------");
      
        System.out.println(tm);
      
        for(Map.Entry<Character,Integer>ent:hm.entrySet()){
            System.out.println("Key "+ent.getKey()+"  Value : "+ent.getValue());
        
        }
        
        
    }



}
