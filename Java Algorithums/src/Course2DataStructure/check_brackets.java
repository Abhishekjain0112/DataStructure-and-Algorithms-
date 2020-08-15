/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course2DataStructure;

/**
 *
 * @author Abhishek
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Bracket {
    Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int position;
}

class check_brackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();

        Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
		int count=0;
        for (int position = 0; position < text.length(); ++position) {
          
            char next = text.charAt(position);
            if (next == '(' || next == '[' || next == '{') {
                // Process opening bracket, write your code here
                Bracket pushBucket =new Bracket(next, position);
                opening_brackets_stack.push(pushBucket);
                
            }

            if (next == ')' || next == ']' || next == '}') {
                if(opening_brackets_stack.empty()){        
                    System.out.println(position+1);
                    count=1;
                    break;
                }else{
                    Bracket popBracket = opening_brackets_stack.pop();
                    if(!popBracket.Match(next)){
                          System.out.println(position+1 );
                          count=1;
                         break;             
                    }
                }
                
                // Process closing bracket, write your code here
            }
            
        }
        if(opening_brackets_stack.empty() && count==0)
            System.out.println("Success");
        else if(count==0)
            System.out.println(opening_brackets_stack.pop().position+1);

        // Printing answer, write your code here
    }
}