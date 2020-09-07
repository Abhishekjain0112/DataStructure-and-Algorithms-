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
public class Prifix_1s_More_then0 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        solve(0, 0, n,"");
        
    }
    
    static void solve(int ones,int zeros,int n,String output){
    
    if(n==0){
        System.out.println(output+" ");
      return ;
     }
    
        solve(ones+1, zeros, n-1, output+"1");
      if(ones>zeros)
          solve(ones, zeros+1, n-1, output+"0");
      
     return ;
    }
    
    
    
    
}
