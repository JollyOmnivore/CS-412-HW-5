import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {
        {
            boolean balance = true;
            Stack<Character> charstack = new Stack<>();
            // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            // Reading data using readLine
            String name = null;
            try {
                name = reader.readLine();
                char[] chararray;
                chararray = name.toCharArray();
                for (int i = 0; i < chararray.length; i++) {
                    if (chararray[i] == '{') {
                        charstack.push(chararray[i]);
                    } else if (chararray[i] == '(') {
                        charstack.push(chararray[i]);
                    } else if (chararray[i] == '[') {
                        charstack.push(chararray[i]);
                    }
                    //closing brace checking

                    else if (chararray[i] == '}') {
                        if(charstack.empty()){balance = false;}
                        else {
                            if (charstack.peek() == '{') {
                            charstack.pop();
                            }
                        }
                    }
                    else if (chararray[i] == ']') {
                        if(charstack.empty()){balance = false;}
                        else {
                            if (charstack.peek() == '[') {
                                charstack.pop();
                            }
                        }
                    }
                     else if (chararray[i] == ')') {
                        if(charstack.empty()){balance = false;}
                        else {
                         if (charstack.peek() == '(') {
                            charstack.pop();

                         }
                        }
                    }

                }


            } catch (IOException e) {
                System.out.println("Hello world!");
            }

            if(balance == true){
                if(charstack.empty() == true){
                    System.out.println("is balanced");
                }
                else{System.out.println("is not balanced");}
            }
            else{
                System.out.println("is not balanced");
            }



        }




    }

}