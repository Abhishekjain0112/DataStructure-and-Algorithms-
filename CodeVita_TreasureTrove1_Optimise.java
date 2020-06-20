<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class CodeVita_TreasureTrove1_Optimise {
 public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // sc.next();
       char mat[][]=new char[n][n];     
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
       mat[i][j]=sc.next().charAt(0);
       }
       CodeVita_TreasureTrove1_Optimise cv=new CodeVita_TreasureTrove1_Optimise();
       // System.out.println("-------------------------");
        for(int i=0;i<n;i++){
        cv.travers(mat, n ,i);
        }
     //       System.out.println("-------------------------");
       //print 
        System.out.println("");
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
            System.out.print(mat[i][j]+" ");
         System.out.println("");
        }
        
    }
    public void travers(char mat[][],int n,int count){
        //for(int i=count;i<n-count;i++){}
        int t=1,c=0,pointercount=0,k=0;
        for(int i=count;i<n-count;i++){
       pointercount++;
   }pointercount=pointercount*2-2;
        StringBuffer sb=new StringBuffer("");
      //  while(t==1){
        t=0;
      //left to right
        for(int j=count;j<n-count;j++){
           // System.out.print(c+" ");
                if(c>=pointercount) c=c*-1;
            sb.append(mat[count][j]);     // Character.toString();
               if(mat[count][j]=='X')
                   {
                    k=c;
                     System.out.print(c);                  
// System.out.print("---"+c+"---");
               }
            c++;   
              }
        //top to bottom
        for(int i=count+1;i<n-count;i++)
        {//System.out.print(c);
                if(c>=pointercount) c=c*-1;
            sb.append(mat[i][n-count-1]);     // Character.toString();
               if(mat[i][n-count-1]=='X')
                   {
                    k=c;
                   System.out.print(c);
                    //System.out.print("---"+c+"---");
               }
            c++;   
         }
// right to left
           for(int j=n-count-1-1;j>=count;j--){
             //  System.out.print(c);
                if(c>=pointercount) c=c*-1;
            sb.append(mat[n-count-1][j]);     // Character.toString();
               if(mat[n-count-1][j]=='X')
               {
                    k=c;
                 System.out.print(c);
               }
            c++;   
              }  
           //bottom to top 
        for(int i=n-count-2;i>count;i--)
        {
           // System.out.print(c);
                if(c>=pointercount) c=c*-1;
            sb.append(mat[i][count]);     // Character.toString();
               if(mat[i][count]=='X')
               {
                    k=c;
                 //  System.out.print("---"+c+"---");
                   System.out.print(c);
               }    
            c++;   
         }
    //}
      // System.out.println("\n loop End  total square = "+k +" String  "+sb.toString() );
         new CodeVita_TreasureTrove1_Optimise().changMatSqt(mat, sb, n, count, k);
    }
    public void changMatSqt(char mat[][],StringBuffer sb,int n,int count,int k){
       int xposition=0;
       if(k<0)
           xposition=sb.length()+k;
       else 
           xposition=k;
       //for(int lg=0;lg<sb.length();lg++){
           // if(xposition>=sb.length())xposition=0;
        //left to right
        for(int j=count;j<n-count;j++){
               if(xposition>=sb.length())xposition=0;
               mat[count][j]=sb.charAt(xposition);
                 xposition++;
              }
        //top to bottom
        for(int i=count+1;i<n-count;i++)
        {
              if(xposition>=sb.length())xposition=0;
               mat[i][n-count-1]=sb.charAt(xposition);
                xposition++;
         }
// right to left
           for(int j=n-count-1-1;j>=count;j--){
            if(xposition>=sb.length())xposition=0;
               mat[n-count-1][j]=sb.charAt(xposition);
                 xposition++;
              }  
           //bottom to top 
        for(int i=n-count-2;i>count;i--)
        {
                        if(xposition>=sb.length())xposition=0;
               mat[i][count]=sb.charAt(xposition);
                 xposition++;
         }
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class CodeVita_TreasureTrove1_Optimise {
 public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // sc.next();
       char mat[][]=new char[n][n];     
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
       mat[i][j]=sc.next().charAt(0);
       }
       CodeVita_TreasureTrove1_Optimise cv=new CodeVita_TreasureTrove1_Optimise();
       // System.out.println("-------------------------");
        for(int i=0;i<n;i++){
        cv.travers(mat, n ,i);
        }
     //       System.out.println("-------------------------");
       //print 
        System.out.println("");
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
            System.out.print(mat[i][j]+" ");
         System.out.println("");
        }
        
    }
    public void travers(char mat[][],int n,int count){
        //for(int i=count;i<n-count;i++){}
        int t=1,c=0,pointercount=0,k=0;
        for(int i=count;i<n-count;i++){
       pointercount++;
   }pointercount=pointercount*2-2;
        StringBuffer sb=new StringBuffer("");
      //  while(t==1){
        t=0;
      //left to right
        for(int j=count;j<n-count;j++){
           // System.out.print(c+" ");
                if(c>=pointercount) c=c*-1;
            sb.append(mat[count][j]);     // Character.toString();
               if(mat[count][j]=='X')
                   {
                    k=c;
                     System.out.print(c);                  
// System.out.print("---"+c+"---");
               }
            c++;   
              }
        //top to bottom
        for(int i=count+1;i<n-count;i++)
        {//System.out.print(c);
                if(c>=pointercount) c=c*-1;
            sb.append(mat[i][n-count-1]);     // Character.toString();
               if(mat[i][n-count-1]=='X')
                   {
                    k=c;
                   System.out.print(c);
                    //System.out.print("---"+c+"---");
               }
            c++;   
         }
// right to left
           for(int j=n-count-1-1;j>=count;j--){
             //  System.out.print(c);
                if(c>=pointercount) c=c*-1;
            sb.append(mat[n-count-1][j]);     // Character.toString();
               if(mat[n-count-1][j]=='X')
               {
                    k=c;
                 System.out.print(c);
               }
            c++;   
              }  
           //bottom to top 
        for(int i=n-count-2;i>count;i--)
        {
           // System.out.print(c);
                if(c>=pointercount) c=c*-1;
            sb.append(mat[i][count]);     // Character.toString();
               if(mat[i][count]=='X')
               {
                    k=c;
                 //  System.out.print("---"+c+"---");
                   System.out.print(c);
               }    
            c++;   
         }
    //}
      // System.out.println("\n loop End  total square = "+k +" String  "+sb.toString() );
         new CodeVita_TreasureTrove1_Optimise().changMatSqt(mat, sb, n, count, k);
    }
    public void changMatSqt(char mat[][],StringBuffer sb,int n,int count,int k){
       int xposition=0;
       if(k<0)
           xposition=sb.length()+k;
       else 
           xposition=k;
       //for(int lg=0;lg<sb.length();lg++){
           // if(xposition>=sb.length())xposition=0;
        //left to right
        for(int j=count;j<n-count;j++){
               if(xposition>=sb.length())xposition=0;
               mat[count][j]=sb.charAt(xposition);
                 xposition++;
              }
        //top to bottom
        for(int i=count+1;i<n-count;i++)
        {
              if(xposition>=sb.length())xposition=0;
               mat[i][n-count-1]=sb.charAt(xposition);
                xposition++;
         }
// right to left
           for(int j=n-count-1-1;j>=count;j--){
            if(xposition>=sb.length())xposition=0;
               mat[n-count-1][j]=sb.charAt(xposition);
                 xposition++;
              }  
           //bottom to top 
        for(int i=n-count-2;i>count;i--)
        {
                        if(xposition>=sb.length())xposition=0;
               mat[i][count]=sb.charAt(xposition);
                 xposition++;
         }
    }
}
>>>>>>> 05c53530eb85b9342418b97144ceb869791d3597
