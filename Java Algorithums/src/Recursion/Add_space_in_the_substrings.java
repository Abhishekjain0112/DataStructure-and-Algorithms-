/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Add_space_in_the_substrings {
 
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        StringBuffer input= new StringBuffer(sc.next());
        StringBuffer output=new StringBuffer();
        output.append(input.charAt(0));
        input.deleteCharAt(0);
        
        addSpace(output, input);
                
         
    }
    
    static void addSpace(StringBuffer output,StringBuffer input){
    
      if(input.length()==0){
          System.out.println(output+" : ");
           return;
      }
      
      StringBuffer out2=new StringBuffer(output);
      StringBuffer out3=new StringBuffer(output);
        
        out2.append(input.charAt(0));

        out3.append('_').append(input.charAt(0));

        input.deleteCharAt(0);
                //System.out.print("call 1output 2 :"+out2);   
               //  System.out.println("  output 3 :"+out3);

        //System.out.print("bwfore call 1nd input "+input +" __");        
        addSpace(out3, input);
        
        //System.out.print("call 2nd input "+input +" __");            
        addSpace(out2, input );
      // System.out.println("end call 2nd ");
      //out2.append("dsd");
      
    }
    
    
}
