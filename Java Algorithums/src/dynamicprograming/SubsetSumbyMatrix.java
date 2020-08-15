/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprograming;

/**
 *
 * @author Abhishek
 */
public class SubsetSumbyMatrix {
    
   public static void main(String[] args) {
        /*
       Scanner sc =new Scanner(System.in);
       int n =6;
       int sum =9;  */                                                                                    
       
         // matr = new boolean[n+1][sum+1];
          // Arrays.fill(matr,false);
       
        int arr[] ={3, 4, 5, 2};//{3, 34, 4, 12, 5, 2}; //{3, 4, 5, 2};
        // int set[]={3, 34, 4, 12, 5, 2}; 
        int sum = 9; 
        int n = arr.length; 
        
       boolean  matrix[][] = new boolean[n+1][sum+1];
     
       for(int j=0;j<sum+1;j++)
             matrix[0][j]=false;
       for(int i=0;i<n+1;i++)
            matrix[i][0]=true;
       
       
       for(int i =1;i<n+1;i++){  
           for(int j=1;j<sum+1;j++){
               
              if(arr[i-1]<=j){  
                matrix[i][j]= matrix[i-1][j-arr[i-1]] || matrix[i-1][j];
              } 
              else
                   matrix[i][j]=matrix[i-1][j];
           }   
       }
       
       System.out.println("result :"+matrix[n][sum]);
       
    
    for(int i=0;i<n+1;i++){
        for(int j=0;j<sum+1;j++){
            System.out.print( matrix[i][j]+" ");
        } 
        System.out.println("");
        } 
   
   }    


    
}
