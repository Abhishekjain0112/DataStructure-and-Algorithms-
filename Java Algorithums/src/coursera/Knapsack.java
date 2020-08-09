/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursera;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Knapsack {
    static int optimalWeight(int W, int[] w) {
        //write you code here
        
        int result = 0;
       int items=w.length;
       int value[][]=new int [items+1][W+1];
        
       for(int i=0;i<items+1;i++)
           value[i][0]=0;
       
       for(int j=0;j<W+1;j++)
           value[0][j]=0;
        
       
       for(int i =1;i<=items;i++){
         
         for(int weight=1;weight<W+1;weight++){
             
           value[i][weight]= value[i-1][weight];  
           
             if(w[i-1]<=weight){
               int maxvalue=value[i-1][weight-w[i-1]]+w[i-1];
               
                if(value[i][weight]<maxvalue)
                    value[i][weight]=maxvalue;
                 }
             }
        }
       
                /*
             for(int i =0; i<=items;i++){
               for(int j=0;j<=W;j++){
                   System.out.print(" "+value[i][j]);
               }System.out.println("");
             }   */    
       
       
       
        /*
        for (int i = 0; i < w.length; i++) {
          if (result + w[i] <= W) {
            result += w[i];
          }
        }*/
        return value[items][W];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}

