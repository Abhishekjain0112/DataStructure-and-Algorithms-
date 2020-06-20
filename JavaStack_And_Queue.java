/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Abhishek
 */
public class JavaStack_And_Queue {
    
    
    public static void main(String []str){
    
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Elements Number :");
         int num=sc.nextInt();
         
         Stack<Integer> stk =new Stack<Integer>();
            
         for(int i=0;i<num;i++){
          stk.push(sc.nextInt());             
         }
        
         System.out.println( stk );
         
         System.out.println( "Pop " + stk.pop() );
        stk.add(0, 789);
         System.out.println(stk );
         Object obj[]= stk.toArray();
         
         int in[]=new int[stk.size()];
         int i=0;
         for(Object o:obj){
           in[i++]=(int)o;
         }
         
          System.out.println(Arrays.toString(in));
    
    }
        
    
    
    
}
