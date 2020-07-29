/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursera;

/**
 *
 * @author Abhishek
 */
import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        //write your code here
     float profit[] = new float[values.length];		
	
     for(int i =0 ; i<values.length;i++){
         profit[i] = (float)values[i]/weights[i];  
     }
        
       //  now  impleminting the selection sort.
     int l = weights.length;
            
     for(int i =0; i<l;i++){
        int min = i;
        for(int j =i+1;j<l;j++){
           if(profit[j]<profit[min])
               min =j;
        }
        
        //swap the numbers 
        float temp = profit[min];
        profit[min]=profit[i];
        profit[i]=temp;
        
        int temp1=values[min];
        values[min]=values[i];
        values[i]=temp1;
      
        temp1=weights[min];
        weights[min]=weights[i];
        weights[i]=temp1;        
        }
    
     /*
     for(int i =0 ; i<l;i++){
         System.out.println(" weight : "+weights[i] +" value : "+values[i]+" profit : "+profit[i] );
     }
     */
     
     
     
     
     
     
     
     
     float knapsakebag=0;
     
   for(int i =l-1; i>=0 ;i--){
      
       if(capacity ==0)
           break;
       
        if(weights[i]<capacity){
             knapsakebag = knapsakebag+weights[i];
             capacity = capacity-weights[i];
             value = value+values[i];
        
        }
        else{
         value = value + profit[i]*(capacity);
         capacity=0;
        }
       
   }	
     
     

        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.printf("%.3f",getOptimalValue(capacity, values, weights));
    }
} 
