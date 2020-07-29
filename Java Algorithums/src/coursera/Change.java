/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursera;

import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        //write your code here
        int total =m;
        int coins= 0;
        int count=0;
          if(total>=10){
             count = total/10;
             coins = coins+ count;
             total = total - (10*count);
          }
          if(total>=5){
             count = total/5;
             coins = coins+ count;
             total = total - (5*count);          
          }
          if(total >=1){
            coins +=total;
          }
        
        
        
        return coins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

