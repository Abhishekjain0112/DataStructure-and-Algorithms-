/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class MergeSort {
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n =sc.nextInt();
        
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();     
        }  
        
         System.out.println(" Befor the Marge Sort "+ Arrays.toString(arr));    
         mergesort(arr, 0, n);        
         System.out.println(" After the Marge Sort "+ Arrays.toString(arr));       
                
    }
 
    static int[] mergesort(int arry[], int  start , int end){
        System.out.println("length :" +arry.length +"start : "+start +"end : "+end
        +" arrays : ");
    if (end-start<1){
       return arry;
    }
     int mid = (end-start)/2;
     System.out.println("");
   System.out.print("A array : " );
    for(int i=start;i<mid;i++){
        System.out.print(" "+arry[i]);
    }
        System.out.println("");
   
    int a[]= mergesort(arry,start,mid);
    
      System.out.println("");
        System.out.print("B array : " );
    for(int i=mid;i<end;i++){
        System.out.print(" " +arry[i]);
    }        
    
    int b[]= mergesort(arry,mid+1,end);

    
    //    System.out.println("A array : " +Arrays.toString(a) + "B Arrays : "+Arrays.toString(b));
             
    int c[]= merge(a,b);        
        
        
        return c;
    }
  
    static int[] merge(int a[],int b[]){
    int lenA=a.length;
    int lengB=b.length;   
    int c[] =new int[lenA+lengB];
    
    
    int i=0,j=0,k=0;
   while(i<lenA && j <lengB){
       if(a[i]<=b[j]){
        c[k++]=a[i++];
       }else{
        c[k++]=b[j++];
       }
   }
   if(i<lenA)
     while(i < lenA)
          c[k++]=a[i++];
   else     
       while(i < lenA)
          c[k++]=a[i++];
     
    
 
    return c;
    }
    
}
/*6

   7 89 45 2 99 105 26 
*/  