/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class PrimitiveCalculator {
    private static List<Integer> optimal_sequence(int n) {
        List<Integer> sequence = new ArrayList<Integer>();
        
         int minimumdivide[] = new int[n+1];
        minimumdivide[0]=0;
 
       
        for(int i=1;i<=n;i++){
        if(i<4){
         minimumdivide[i]=1;
         continue;
        }
            
        minimumdivide[i]=Integer.MAX_VALUE;
        int tempmin=Integer.MAX_VALUE;
        int index=0;
        if(i%3==0){
          if(minimumdivide[i/3]<tempmin)
          {
              tempmin=minimumdivide[i/3];
          }        
        }
        if(i%2==0){
          if(minimumdivide[i/2]<tempmin)
            {
              tempmin=minimumdivide[i/2];
            } 
            
        }
       if(minimumdivide[i-1]<tempmin)
            {
              tempmin=minimumdivide[i-1];
            }         
        minimumdivide[i]=tempmin+1;
        }
        
        //System.out.println("array mimimum divide : "+ minimumdivide[n]);
     
        while (n >= 1) {
            sequence.add(n);
           int mindivide=minimumdivide[n];
            
            
            if (n % 3 == 0 && minimumdivide[n/3]+1==mindivide) {
                n /= 3;
             //   sequence.add(n);
            } else if (n % 2 == 0  && minimumdivide[n/2]+1==mindivide ) {
                n /= 2;
               // sequence.add(n);      
            } 
            else if(n==3 || n==2){
               n/=n;
            }
            else {
                n -= 1;
                 //sequence.add(n);
                
            }
        }
        
        
        Collections.reverse(sequence);
        return sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}



