/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursera;

import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
         
        int fule = tank;
        
       int count =0,stop=0;
       
        for(int i = 0;i<stops.length ;i++){
        
            if(fule>=dist)
                return count;
            
            if(stops[i]<fule){
               stop++;
               if(i==stops.length-1){
               fule=tank+stops[i];
               stop=0;
               count++;  
               }
               //i++;
            }
            else if(i!=0 && stops[i]==fule){
               fule=tank+stops[i];
               stop=0;
               count++;       
            }
            else if(stops[i]>fule){
               if(stop == 0){
                  
                if(i!=0 && stops[i-1]==fule){
               fule=tank+stops[i-1];
               stop=0;
               count++; 
            }   
                   
                  else 
                   return -1;
               
               }
               else{
               fule=tank+stops[i-1];
               stop=0;
               count++;
               }
            }
            
            
            
            
            
        }
      //  System.out.println("fule :" +fule);
        
     if(fule>=dist){
       return count;
     }  else 
         return -1;
        
     
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
