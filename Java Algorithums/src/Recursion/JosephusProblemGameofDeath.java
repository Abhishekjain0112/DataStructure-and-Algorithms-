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
public class JosephusProblemGameofDeath {
 
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer> al =new ArrayList<>(n);
        for(int i=1;i<n+1;i++)
            al.add(i);
        k--;
        solve(0, k, al);
    
    }
    static void solve(int ind,int k,ArrayList<Integer> al){
 
   if(al.size()==1){
       System.out.println(al.get(0));
       return;
   }   
    ind=(k+ind)%al.size();
    al.remove(ind);
    
        solve(ind, k, al);
    }
 
    
    
    
}
