package intro;

import java.util.Scanner;

public class Week3 {

    static void workingWithArrays(){

        int[] nums1 = {11,22,33,44,55};
        int[] nums2 = new int[5]; // all indexes have value 0

        //output:
        System.out.println(nums1[2]);
        /*
indexes            0       1       2       3       4

values              11      22      33      44      55
         */
        String[] texts = new String[5];//all indexes null

    int val = "hello".length(); // gets length of string
    }

    static void task1(){
        int MAX_NUM = 3;
        String[] names = new String[MAX_NUM];
        Scanner input = new Scanner(System.in);
        int index = 0;

        System.out.printf("You are required to enter %d names of at least %d characters%n",
                MAX_NUM, MAX_NUM
                );

        while(true){

            System.out.printf("Enter name number %d%n", index + 1);
            String name = input.nextLine();
            if(name.length() >= 3){
                names[index++] = name;
                if(index > 2)
                    break;
            }
            else{
                System.out.printf("Sorry but '%s' is not valid. The name needs to be " +
                        "at least %d characters%n", name, MAX_NUM);
            }
        }

        System.out.println("The End");
    }

    static void typecasting(){

        //changing the data type
        /*
                data type           size in bits            size in bytes

                boolean                  1                      1/8
                byte                     8                      1
                char                     8                       1
                short                    16                     2
                int                      32                     4
                long                      64                    8
                float                    32                     4
                double                   64                     8

         */

        int num1 = 10;
        long num2 = num1;  //typecasting. promoting=> smaller data type to bigger. implicit
        short num3 = (short)num2; //typecasting. demotion => bigger data type to smaller. explicit

        int num4 = -130;
        /*

        -128                                127
         */
        byte num5 = (byte) num4;

        System.out.println(num5);

        float num6 = 123f;
        int num7 = (int)num6;

        int num8 = 'B';


    }

    static void example1(){


        Car c = new Car();  //object created by follow Car class definition
        Car c1 = new Car();

        c.accelerate(100); //what data type did I pass as argment


        c.accelerate(987L);

        Pizza p = new Pizza();
        String result = p.deliver("1 Georgian Drive");
        System.out.println(result);

        String result1 = p.deliver("1 Georgian Drive", 10);
        System.out.println( result1);

    }

    static void example2(){

        Car c = new Car();

        c.doors = 10;
        c.wheels = 4;
        c.transmissionType = 'M';
        //c.oilType;

        System.out.println(c.doors);
        System.out.println(c.wheels);
    }
    public static void main(String[] args) {
        //task1();
  //      typecasting();
        example2();
    }
}
