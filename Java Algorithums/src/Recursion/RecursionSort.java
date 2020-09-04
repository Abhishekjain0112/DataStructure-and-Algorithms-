/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class RecursionSort {
    public static void main(String[] args) {
         
        ArrayList<Integer> al = new ArrayList<>();

        al.add(59);
        al.add(3);
        al.add(8);
        al.add(2);
        al.add(51);
        System.out.println(al);
        sort(al);
        System.out.println(al);
        
    }
    
    //FUNCTION TO ADD THE EVEMENT ON THE RIGHT POSITION OF THE ARRAY
   static void insert(ArrayList al,int n){
    
      if(al.size()==0 || (int)al.get(al.size()-1)<=n ){
          al.add(n);    
          return;
      }
      int temp=(int)al.get(al.size()-1);
      al.remove(al.size()-1);
      
        insert(al, n);
        al.add(temp);
    }
    
   static void sort(ArrayList al){
    
        if(al.size()==1)
        {
          return;
        }
      int temp=(int)al.get(al.size()-1);
      al.remove(al.size()-1);
      
        sort(al);
        insert(al, temp);
    
    }
    
    
    
}
