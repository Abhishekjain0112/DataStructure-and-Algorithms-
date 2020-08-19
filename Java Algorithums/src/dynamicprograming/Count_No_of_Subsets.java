/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprograming;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Count_No_of_Subsets {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int sum=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        int matrix[][]=new int[n+1][sum+1];
        
        for(int j=0;j<sum+1;j++)
            matrix[0][j]=0;
        for(int i=0;i<n+1;i++)
            matrix[i][0]=1;
        
        for(int i =1; i<n+1;i++){
           for(int j=1;j<sum+1;j++){
               if(arr[i-1]<=j)
                matrix[i][j]=matrix[i-1][j-arr[i-1]]   +   matrix[i-1][j];
               else 
                matrix[i][j]=matrix[i-1][j];               
           }
        }
        
        //print of matrix table in the standard format 
        System.out.print("\n:  ");
        for(int j=0;j<sum+1;j++){
            System.out.print(j+"  ");        
        }
        System.out.println("");
        
        for(int i=0;i<n+1;i++){
            System.out.print(i+"  ");
            for(int j=0;j<sum+1;j++){
                System.out.print(matrix[i][j]+"  ");    
            }System.out.println("");
        }
        
        System.out.println("Result : "+matrix[n][sum]);
        
    }
    
    
    
}
/*
run:
6
10 2 3 5 6 8 10 

:  0  1  2  3  4  5  6  7  8  9  10  
0  1  0  0  0  0  0  0  0  0  0  0  
1  1  0  1  0  0  0  0  0  0  0  0  
2  1  0  1  1  0  1  0  0  0  0  0  
3  1  0  1  1  0  2  0  1  1  0  1  
4  1  0  1  1  0  2  1  1  2  1  1  
5  1  0  1  1  0  2  1  1  3  1  2  
6  1  0  1  1  0  2  1  1  3  1  3  
Result : 3
*/