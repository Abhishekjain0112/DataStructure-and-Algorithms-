/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class StringInputComma {

    public static void main(String[] args) {
        
         
    Scanner sc = new Scanner(System.in);
    //String str=sc.nextLine();
     
    String str="1 ,2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 ,10";
    
    String strAry[]=str.trim().split(",");
    int arr[]=new int[strAry.length];
      int ii=0;
      
        for(String s:strAry){
            arr[ii++]=Integer.parseInt(s.trim());
            System.out.println(arr[ii-1]);
        }
        
        
        
    }
    

    
    
}
