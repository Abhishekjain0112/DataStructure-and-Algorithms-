
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek
 */
public class Cipher {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         int k=sc.nextInt();
         char charr[]=s.toCharArray();

          for(int i =0;i<charr.length;i++){
           char ch=charr[i];
              if(Character.isLetter(ch)){
                
                  if(Character.isLowerCase(ch)){
                   
                    if( (int)(ch+k)>'z' ){
                       
                       int newchar= ((ch+k)%('z'+1) )+'a'; 
                        charr[i] =(char)(newchar);
                    } else{
                         charr[i] =(char)(ch+k); 
                    }
                      
                  }else if(Character.isUpperCase(ch)){
                      
                    if( (int)(ch+k)>'Z' ){
                       
                       int newchar= ((ch+k)%('Z'+1) )+'A'; 
                        charr[i] =(char)(newchar);
                    } else{
                         charr[i] =(char)(ch+k); 
                    }
                  }
                  
              }  
              
          }
          String res=new String(charr);
          System.out.println("Result :"+res);
        
    }
    
    
}
