/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprograming;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class ChangeDP {
    private static int getChange(int m) {
        //write your code here
        int[] coins = {1,3,4};
        int[] minimumcoins=new int[m+1];
        minimumcoins[0]=0;
        for(int i = 1;i<=m;i++){
           minimumcoins[i]=Integer.MAX_VALUE;
            for(int coinvalue:coins){
                System.out.println("coin value :" + coinvalue + " i :" +i);
                if(coinvalue<=i){
                
                int mincoin=minimumcoins[i-coinvalue]+1;
                if(mincoin<minimumcoins[i]){
                  minimumcoins[i]=mincoin;
                    }
                }
            }        
        }
        
        
        System.out.println(" arrays :" +Arrays.toString(minimumcoins));
        
        return minimumcoins[m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

