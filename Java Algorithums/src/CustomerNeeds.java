
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
public class CustomerNeeds {
    
    
    public static void main(String[] args) {
        
        
        int itemsarry[] ={50,100,40,200,300};
        Scanner sc =new Scanner(System.in);
        String input1=sc.nextLine();
        String input2=sc.nextLine();   
        String s1[]=input1.split(" ");
        String s2[]=input2.split(" ");
          int totalcost=0;      
        for(int i=0;i<s2.length;i++){
         int item= Integer.parseInt(s1[i]);
         int quntity=Integer.parseInt(s2[i]);  
            System.out.println("i:"+ item +"  qun :"+quntity);
         totalcost=totalcost + itemsarry[item-1]*quntity;       
        }
        int discount=0;
        char ch=sc.next().charAt(0);
        if(ch=='y')
             discount=5;
        float finalcost=0f;        
        if(totalcost>1000)
            discount=discount+10;
        finalcost = totalcost - (totalcost*discount)/100;      
        System.out.println(finalcost+"INR");
       
    }
    
    
}
