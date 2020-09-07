/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class BalanceParentheses {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n =sc.nextInt();
        ArrayList<String> al =new ArrayList<>();
        String out="";
        bracket(out, n, n, al);
        System.out.println(al);
        System.out.println("Numbers of Combinations:"+al.size());
    }

    
  static void bracket(String output,int open,int close,ArrayList<String> al){
  
    if(open==0 && close==0){
      al.add(output);
      return;
    }
  if(open>0)
  {
      String o1=output+"(";
      bracket(o1,open-1, close, al);
  }
  if(close>open)  
     {
      String o2=output+")";
      bracket(o2 ,open, close-1, al);
     }       
  }
    
    
}
