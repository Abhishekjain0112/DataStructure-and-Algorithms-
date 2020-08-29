/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeVita;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class A_Special_String {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0){
            int n =sc.nextInt();
            char[]ch =new char[n];
            String s=sc.next();
            ch=s.toCharArray();
            
            char right[]=new char[n/2];
            char left[]=new char[n/2];
            
            for(int i=0;i<n/2;i++)
                left[i]=ch[i];           
            for(int i=n/2+1,j=0;i<n;i++)
                right[j++]=ch[i];
            
            
            int minchange=Integer.MAX_VALUE;
            Arrays.sort(right);
            Arrays.sort(left);
            
          // condition 1st  
            char maxchar=right[n/2 -1];
            int change=0;
            for(char itr:left)
                if(itr<maxchar)
                    change++;
            
            if(change<minchange)
                minchange=change;
            // condition 2nd   
            char minchar= right[0];
            change=0;
            for(char itr:right)
                if(itr>minchange)
                    change++;            
            if(change<minchange)
                minchange=change;
            
            int maxcount=0,c=0;
            char latter=right[0];
            for(int i=0;i<n/2-1;i++){
                if(right[i]==right[i+1])
                {
                 c++;
                }
                else{
                 if(c>maxchar)
                 {
                  maxcount=c;
                  latter=right[i];
                  c=0;
                 }
                }
            }
            change=0;
            for(char itr:left){
               if(itr!=latter)
                   change++;
            } 
            if(change<minchange)
                minchange=change;            
             //condition 3th
             System.out.println(minchange);
            
        }
    }
            
    
}
