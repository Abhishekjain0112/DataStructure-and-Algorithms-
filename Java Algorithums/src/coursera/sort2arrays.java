/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Abhishek
 */
 class Compa{
     int w;
     int v;

    public Compa(int w, int v) {
       this.w=w;
       this.v=v;
    }

    @Override
    public String toString() {
        return this.w+" "+this.v; //To change body of generated methods, choose Tools | Templates.
    }
  
    }


public class sort2arrays {
 
    
    
    
    public static void main(String[] args) {
  int n =6;      
  int a[] ={900,50,402,80,70,100,34};
  int b[] ={9,5,4,8,7,1,3};
  
  List<Compa> ls =new ArrayList<Compa>();
  
  for(int i=0;i<a.length;i++){
      ls.add(new Compa(a[i],b[i]));
  }
        System.out.println(" befor sort :"+ls);
     
        Comparator<Compa> compare =new Comparator<Compa>() {

      @Override
      public int compare(Compa o1, Compa o2) {
         if(o1.w>o2.w)
             return 1; 
         return -1;
      }
  };
        Collections.sort(ls,compare);

         System.out.println(" after sort :"+ls);
        
      
       Comparator<Compa> compareByValue =(o1,o2) ->
       {
         if(o1.v>o2.v)
             return 1; 
         return -1;
    
       };
         
      Collections.sort(ls,compareByValue);
       System.out.println(" after sort by the value  :"+ls);
         
        
    }
         
    
    
    
    
}
