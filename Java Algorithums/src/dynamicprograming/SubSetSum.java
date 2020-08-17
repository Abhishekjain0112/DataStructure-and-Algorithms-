/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprograming;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class SubSetSum {
    
        
    //public static boolean matr[][] ;
      
    public static void main(String[] args) {
        /*
       Scanner sc =new Scanner(System.in);
       int n =6;
       int sum =9;  */                                                                                    
       
         // matr = new boolean[n+1][sum+1];
          // Arrays.fill(matr,false);
       
        int arr[] ={3, 34, 4, 12, 5, 2}; 
         int set[]={3, 34, 4, 12, 5, 2}; 
        int sum = 9; 
        int n = set.length; 
        
        if (isSubsetSum(set, n, sum) == true) 
            System.out.println("Found a subset"
                               + " with given sum"); 
        else
            System.out.println("No subset with"
                               + " given sum"); 
     
       // System.out.println("answer : "+isSubsetSum(arr, n, sum));
        
        if (isSubsetSum1(set, n, sum) == true) 
            System.out.println("Found a subset"
                               + " with given sum"); 
        else
            System.out.println("No subset with"
                               + " given sum");  
       // System.out.println("answer : "+isSubsetSum1(arr, n, sum));            
    }    
    
    
    public static boolean isSubsetSum( int set[],int n,int sum){
        System.out.println(" n : "+n +"sum : "+ sum  );
        
             if (sum == 0) 
            return true; 
        if (n == 0 && sum != 0) 
            return false; 
  
                /*
        if (set[n - 1] < sum) 
            return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]); 
            return isSubsetSum(set, n - 1, sum); 
         */
          if(set[n-1]>sum)
          return isSubsetSum(set, n-1, sum);
          else
          return ( isSubsetSum(set, n-1, sum-set[n-1]) ||isSubsetSum(set, n-1, sum) );
        /*
                 
      if(arr[n-1]<sum)
          return ( sumpartition(arr, n-1, sum-arr[n-1]) ||sumpartition(arr, n-1, sum) );
      else
          return sumpartition(arr, n-1, sum);
          */
        
        
        // Base Cases 
        /*
        if (sum == 0) 
            return true; 
        if (n == 0 && sum != 0) 
            return false; 
        
      if(arr[n-1]<sum)
          return ( sumpartition(arr, n-1, sum-arr[n-1]) ||sumpartition(arr, n-1, sum) );
      else
          return sumpartition(arr, n-1, sum);*/
        
    }

    
    public static boolean isSubsetSum1( int set[],int n,int sum){
        System.out.println(" n : "+n +"sum : "+ sum );
        
             if (sum == 0) 
            return true; 
        if (n == 0 && sum != 0) 
            return false; 
  
                
        if (set[n - 1] <= sum) 
            return isSubsetSum1(set, n - 1, sum) || isSubsetSum1(set, n - 1, sum - set[n - 1]); 
            return isSubsetSum1(set, n - 1, sum); 
         /*
          if(set[n-1]>sum)
          return isSubsetSum(set, n-1, sum);
          else
          return ( isSubsetSum(set, n-1, sum-set[n-1]) ||isSubsetSum(set, n-1, sum) );
        */
                 

        
        

        
    }
    
    
}
