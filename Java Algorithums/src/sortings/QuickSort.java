/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortings;

import java.util.Arrays;
import java.util.Scanner;
//import static sortings.MergeSort1.mergesort;

/**
 *
 * @author Abhishek
 */
public class QuickSort {
    
    
    public static void main(String[] args) {
        
         
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n =sc.nextInt();
        
        int arr[] = new int[n];
    
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();     
        }  
        
         System.out.println(" Befor the Quick Sort "+ Arrays.toString(arr));
   
         quickSort(arr, 0, n-1);
        
         System.out.println(" After the Quick Sort "+ Arrays.toString(arr));       
        
  
        
    }
  
    static void quickSort(int []arr,int start,int end){
    
        if(start<end){
        
            int pivote = pivote(arr,start,end);
            
            quickSort(arr, start, pivote-1);
            quickSort(arr, pivote+1, end);
        
        }
    
    }
    static int pivote(int []arr,int start,int end){  
      int pivot =arr[start];
      //int i=start;
      int j=start;
      for(int i=start+1;i<=end;i++){ 
          if(arr[i]<=pivot){
         
              j++;
          
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;          
          }
    
      }
        int temp1 = arr[j];
        arr[j]=arr[start];
        arr[start]=temp1;      
        
             System.out.println("Quick Sort "+ Arrays.toString(arr)+" start ind :"+start +" end : "+end+"  pivot :"+pivot);    
    return j;    
    }
    
    
}
