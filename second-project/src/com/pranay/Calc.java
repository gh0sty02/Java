package com.pranay;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            // take input till user presses x or X


            int result = 0;

            while(true){

                System.out.println("Enter the Operator: ");
                char op = in.next().trim().charAt(0);

                if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){



                    System.out.println("Enter 2 Numbers : ");
                    int input1 = in.nextInt();
                    int input2 = in.nextInt();

                    if(op == '+'){
                        result = input1 + input2;
                    } if(op == '-'){
                        result = input1 - input2;
                    } if(op == '*'){
                        result = input1 * input2;
                    } if(op == '/'){
                        result = input1 / input2;
                    }
                    if(op == '%'){
                        result = input1 % input2;
                    }



                }
                else if(op == 'x' || op == 'X'){
                    break;
                }
                else{
                    System.out.println("invalid operator");
                }

                System.out.println(result);
            }



    }
}
