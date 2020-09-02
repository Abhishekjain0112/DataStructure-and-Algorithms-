/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprograming;

/**
 *
 * @author Abhishek
 */
public class RoadCuttingProblem {
 
    public static void main(String args[]) 
    { 
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20}; 
        int size = arr.length; 
        System.out.println("Maximum Obtainable Value is " + 
                            cutRod(arr, size)); 
    }
            
    static int cutRod(int price[],int n) {
       int value[]=new int[n+1];
        
       
      // int maxvalue=Integer.MIN_VALUE;
       
       for(int i=1;i<=n;i++){
          int maxvalue=Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
              maxvalue=Integer.max(maxvalue,(price[j]+value[i-j-1]));
            }
           value[i]=maxvalue;
       }
       
        
        return value[n];
    }
    
}
