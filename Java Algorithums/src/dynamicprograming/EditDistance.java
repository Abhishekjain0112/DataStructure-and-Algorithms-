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
public class EditDistance {
  public static int EditDistance(String s, String t) {
    //write your code here
      int len1=s.length();
      int len2=t.length();
      
    int matrix[][] =new int[len1+1][len2+1]; 
      
      for(int i=0;i<=len1;i++){
        matrix[i][0]=i;
      }
      for(int i=0;i<=len2;i++){
        matrix[0][i]=i;
      }      

 
      
       for(int i =1; i<=len1;i++){
     for(int j =1;j<=len2;j++){
           if(s.charAt(i-1)==t.charAt(j-1))
           {
            matrix[i][j]=matrix[i-1][j-1];
           }else{
           matrix[i][j]=min(matrix[i-1][j-1], matrix[i][j-1], matrix[i-1][j])+1;
           }
      }
   }    
      
      
      
      
      
      /*
   for(int i =0; i<=len1;i++){
     for(int j =0;j<=len2;j++){
         System.out.print(" "+matrix[i][j]);
     }System.out.println("");
   }  */
   
   
      
      return matrix[len1][len2];
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditDistance(s, t));
  }



public static int min(int a,int b,int c){
    int min=a;

     if(b<min)
         min =b;
     if(c<min)
         min=c;
    
    return min;
   }




}