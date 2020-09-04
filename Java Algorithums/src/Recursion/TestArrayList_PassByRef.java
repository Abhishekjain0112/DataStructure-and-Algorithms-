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
public class TestArrayList_PassByRef {
 
    public static void main(String[] args) {
        ArrayList<Integer> alist=new ArrayList<>();
        
        alist.add(15);
        alist.add(16);
        alist.add(17);
        alist.add(18);
        System.out.println(alist);
        manupulate(alist);
        System.out.println(alist);
    }
            
    static void manupulate(ArrayList al){
    
        al.remove(al.size()-1);
        al.add(98);
    }
    
}
