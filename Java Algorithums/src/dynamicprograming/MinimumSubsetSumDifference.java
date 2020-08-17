/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class MinimumSubsetSumDifference {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {arr[i]=sc.nextInt();
         sum +=arr[i];
        }   
        System.out.println(" input arr : "+Arrays.toString(arr));
       int result=minimumSubsetSumDifference(arr, sum);
        System.out.println("The minimum difference btw the any subset is :"+result);
    }
    public static int minimumSubsetSumDifference(int []arr,int sum){
        int n=arr.length;
        boolean matrix[][]=new boolean[n+1][sum+1];
        
        for(int j=0;j<sum+1;j++)
            matrix[0][j]=false;
        for(int j=0;j<n+1;j++)
            matrix[j][0]=true;
        
        
        for(int i =1;i<n+1;i++){
           for(int j=1; j<sum+1;j++){
               if(arr[i-1]<=j){
                matrix[i][j]=matrix[i-1][j-arr[i-1]] || matrix[i-1][j];
               }else
                   matrix[i][j]=matrix[i-1][j];
           }     
        }
      
        ArrayList<Integer> divisblenumberArray=new ArrayList<>();
        
        for(int j=0;j<(sum/2);j++){
          if(matrix[n][j]==true){
                System.out.print("  "+matrix[n][j]);
              divisblenumberArray.add(j);}
        }
        int minimumdiff=sum;
        System.out.println(divisblenumberArray);
        for(int num:divisblenumberArray){
        int mini=sum -2*num;
           minimumdiff=Math.min(minimumdiff, mini);
        }
        
        
        //output matrix code
        System.out.print("\n:  ");
        for(int j=0;j<sum+1;j++){
            System.out.print(j+"       ");        
        }
        System.out.println("");
        
        for(int i=0;i<n+1;i++){
            System.out.print(i+"  ");
            for(int j=0;j<sum+1;j++){
                System.out.print(matrix[i][j]+"  ");    
            }System.out.println("");
        }        
        
        
        
        
        
        
        
        
    return minimumdiff;
    }
  
    
    
    
}
/*
run:
3
1 2 
7 
 input arr : [1, 2, 7]
  true  true  true  true[0, 1, 2, 3]

:  0       1       2       3       4       5       6       7       8       9       10       
0  true  false  false  false  false  false  false  false  false  false  false  
1  true  true  false  false  false  false  false  false  false  false  false  
2  true  true  true  true  false  false  false  false  false  false  false  
3  true  true  true  true  false  false  false  true  true  true  true  
The minimum difference btw the any subset is :4

*/