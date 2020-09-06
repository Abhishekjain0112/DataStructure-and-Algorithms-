/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Aspace_withString {
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp=sc.next();
        String out=inp.charAt(0)+"";
               inp=inp.substring(1);
        addSpace(out, inp);
  
    }
    
     static void addSpace(String output,String input){
     
     if(input.length()==0){
         String o="("+output+")";
         System.out.print(o.trim());    
         return;
     }
         
     String output1=output+" "+input.charAt(0);
     String output2=output+input.charAt(0);
     input=input.substring(1);
         addSpace(output1, input);
         addSpace(output2, input);
     }    
}
