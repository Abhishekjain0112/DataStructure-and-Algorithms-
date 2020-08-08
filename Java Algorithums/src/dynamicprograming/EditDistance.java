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
      
   for(int i =0; i<=len1;i++){
     for(int j =0;j<=len2;j++){
         System.out.print(" "+matrix[i][j]);
     }System.out.println("");
   }  
      
      return 0;
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditDistance(s, t));
  }

}
