/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/*
program to find the number of element in the given string 
run:
Key set   [ , a, b, e, f, h, i, j, k, n, 1, 2, s, 3, 4, v, z, Z]
 Value set [2, 3, 2, 2, 2, 5, 3, 3, 4, 1, 5, 1, 2, 1, 2, 1, 6, 3]
 Value z 6

*/
/**
 * 
 * 
 * 
 *
 * @author Abhishek
 */
public class HashMapProblem {
    public static void main(String[] args) {
 
        
    String ss="zzzzzzabhishekjainab  hishejvkkhfjfkZZZ111112344";
  
    HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
   for(char ch:ss.toCharArray()){
       if(hm.containsKey(ch))
       {   
           hm.put(ch,hm.get(ch) + 1);      }
           else hm.put(ch,1);
   }System.out.println(" Key set   "+hm.keySet());
    System.out.println(" Value set "+hm.values());
    System.out.println(" Value z "+hm.get('z'));
    System.out.println("----"+hm+"------");
    System.out.println("----"+hm+"------");
    System.out.println("----"+hm+"------");
    
    Set<Character>set1=hm.keySet();
    
    System.out.println("--***KEY SET****--");
    System.out.println(set1);
    
        ArrayList<Character> ar=new ArrayList<>(set1);
       Set<Character>set2=new HashSet<>(ar);
       
         Collections.sort(ar);
       
       
        
    }
  
    
   
    
    
    
}
    
    

