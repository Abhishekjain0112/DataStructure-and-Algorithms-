/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Abhishek
 */
public class EpamInterviewQuestuon {
    
    
    
    public static void main(String[] args) {
        
        List<Integer> a=new ArrayList<>();
        a.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6}));
   
        List<Integer> b=new ArrayList<>();
        b.addAll(Arrays.asList(new Integer[]{1,4,6,7,5}));
  
              List<Integer> c=new ArrayList<>();
        c.addAll(Arrays.asList(1,4,6,7,5,8,9,45));

        
        List<Integer> d=new ArrayList<>(Arrays.asList(100,254,326,258));
      //  d.addAll(Arrays.asList(1,4,6,7,5,8,9,45));
  
        
        
        System.out.println(" List a :"+a);
        System.out.println(" List b :"+b);
                                                   // System.out.println(" List c :"+c);
                                                  //   System.out.println(" List d :"+d);       
        
  
      System.out.println("------------------------------------");
    
        Set <Integer> aa=new HashSet<>(Arrays.asList(new Integer[]{7,99,1,5,7,6,3}));
        Set <Integer> bb=new HashSet<>(b);
        Set <Integer> cc=new HashSet<>(bb);
        System.out.println(" List a :"+aa);
        System.out.println(" List b :"+bb);
      
      aa.removeAll(bb);
        bb.removeAll(aa);
        
        System.out.println("My Unique Set aa :" +aa);
        System.out.println("My Unique Set bb:" +bb);
    
        System.out.println("My Full Unique Set :" +cc);
        
  //  TreeMa
    
    
    }
    
    
    
}
