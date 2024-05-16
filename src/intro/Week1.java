package intro;

import java.util.Scanner;
import java.util.Random;


public class Week1 {

    static void example1(){

        /*
                create two numbers

                output the sum, difference, quotient & product
         */

        //dataType name = value;
        int number1 = 10;
        short number2 = 15;

        int sum = number1 + number2;
        int difference = number1 - number2;
        int quotient = number1 / number2;
        float product = number1 * number2;

        System.out.println(number1);
        System.out.println(number2);

        System.out.println(number1 + " / " + number2 + " = " + quotient);

        //souf+tab
        System.out.printf(" %d \t * \t %d = %f %n", number1,
                number2, product);
        /*
            %d          whole number        digit
            %f          float               decimal
            %s          string

            %t          tab char
            %n          nl char
         */
    }

    static void example2(){

        //ASK the user for two numbers

        Scanner input = new Scanner(System.in);

        for(int i= 1; i < 3; i++) {
            //prompt using sout
            System.out.printf("Enter number %d", i);
            //get into user Scanner object
            int number1 = input.nextInt();
            System.out.println(number1);

            System.out.println(number1 + 0xf);
        }
    }

    static void example3(){
        System.out.println("Counting down from 10 to 1");

        int value = 10;
        while(value > 0){
            System.out.println(value);
            value--;
        }


    }

    static void example4(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number");
        int number = input.nextInt();
        //determine if number is odd, even or neutral

        if(number % 2 == 1)
            System.out.println(number + " is odd");
        else if(number != 0 && number % 2 == 0){
            System.out.println(number + " is even");
        }
        else{
            System.out.println(number + " is neutral");
        }


    }
    static void example5(){

        Random random = new Random();

        for(int i = 0; i < 5; i++){

            int num1 = random.nextInt(1, 11);
            int num2 = random.nextInt(1000, 2001);

            System.out.println(num1 + " & " + num2);
        }
    }

    static  void example6(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = input.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = input.nextInt(); //"20\n"
        input.nextLine(); //received "\n"

        System.out.println("Enter operator");
        //consume the nl chara

        String op = input.nextLine();

        if(op.equals("+")){
            System.out.println(num1 + num2);
        }
        else if (op.equals("-")){
            System.out.printf("%d - %d = %d", num1, num2, num1-num2);

        }
    }
    // psvm+tab
    public static void main(String[] args) {
        //sout+tab
//        System.out.println("OH! Now I remember");
        example6();
    }

}
