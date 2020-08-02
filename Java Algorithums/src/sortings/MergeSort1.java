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
public class MergeSort1 {
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n =sc.nextInt();
        
        int arr[] = new int[n];
    
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();     
        }  
        
         System.out.println(" Befor the Marge Sort "+ Arrays.toString(arr));
        
         mergesort(arr, 0, n-1);
        
         System.out.println(" After the Marge Sort "+ Arrays.toString(arr));       
        
        
    }
 
    static void mergesort(int arry[], int  start , int end){
        
    // System.out.println("length :" +arry.length +"start : "+start +"end : "+end
      //  +" arrays : "+Arrays.toString(arry));
    if (start<end){
    int mid = (start+end)/2;
     mergesort(arry,start,mid);
     mergesort(arry,mid+1,end);
  
     merge(arry,start,mid,end);             
           
     }
    
    }
    static void merge(int arry[],int start,int mid, int end){
    int lenA=mid-start+1;
    int lengB=end-mid;
    
 
    int a[] =new int[lenA];
    int b[] =new int[lengB];
    
    for(int i = 0; i<lenA;i++){
       a[i]=arry[start+i];
    }
    for(int i = 0; i<lengB;i++){
       b[i]=arry[mid+i+1];
    }    
    int i=0,j=0,k=start;
    
   while(i<lenA && j <lengB){
       if(a[i]<=b[j]){
        arry[k++]=a[i++];
       }else{
        arry[k++]=b[j++];
       }
   }
   if(i<lenA)
     while(i < lenA)
          arry[k++]=a[i++];
   else if(j<lengB)   
       while(i < lengB)
          arry[k++]=a[i++];
     
    }
    
}

/*
test input
6
   7 89 45 2 99 105 26   */

