/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeVita;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class factorof3 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0){
            
            int n=sc.nextInt();
           int countdividedby3=0;
           int arr[] =new int[n];
            for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
                
               if(arr[i]%3==0){
                  countdividedby3++;
               }             
            }
            
            if(countdividedby3<=(int)n/2)
                System.out.println("Yes");
            else 
                System.out.println("No");
            
            
            
        t--;    
        }
        
        
    }
    
    
}
