/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class HeapSort {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        
        for(int i =0;i<n;i++){
           arr[i]=sc.nextInt();      
        }  
        
        System.out.println("Heap Sort");
        heapsort(arr, n);
        System.out.println("Arr : "+Arrays.toString(arr));
        
    }
    public static void heapsort(int[] arr,int n){
    
        for(int i=n/2 -1;i>=0;i--){
            heapify(arr, n, i);
        }
        System.out.println("initial sort ends");
        
        for(int i =n-1;i>=0;i--){
        int swap =arr[0];
            arr[0]=arr[i];     
            arr[i]=swap;
            heapify(arr, i, 0);
        }
    
    } 
    
   public static void heapify(int[] arr, int size,int i){
      // System.out.println(" i :"+i);
       int largest=i;
       int left = 2*i + 1;
       int right=2*i + 2;
       
       if(left<size && arr[left]>arr[largest])
            largest=left;       
       if(right<size && arr[right]>arr[largest])
           largest=right;
       
       if(i!=largest){
          // System.out.println(" i :"+i +"  largest :"+largest);
         int swap=arr[i];
         arr[i]=arr[largest];
         arr[largest]=swap;
           heapify(arr, size, largest);
       }
       
   }
    
}
