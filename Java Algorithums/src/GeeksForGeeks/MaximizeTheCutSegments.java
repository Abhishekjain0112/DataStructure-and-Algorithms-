/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class MaximizeTheCutSegments {
    
    
    	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 
	 int t=sc.nextInt();
	 while(t-->0){
	  //Write your code here
	  
	  int n=sc.nextInt();
          
          int dp[]=new  int[n+1];         
          int cost[]=new int[3];
          
           dp[0]=0;
          for(int i=0;i<cost.length;i++)
              cost[i]=sc.nextInt();
          
          
          for(int i=1;i<=n;i++){
              int maxVale=Integer.MIN_VALUE;
              
              for(int j=0;j<cost.length;j++){
                 if(j<i){
                      maxVale=Math.max(maxVale,1+dp[i-j-1]);
                          }   
              }dp[i]=maxVale;
     
          }
          
          
          
	  
	            System.out.println("Result :"+dp[n]);
	  
	 }
	 
	 
	 
	 
	 
	 }
    
    
    
    
    
    
    
    
}
