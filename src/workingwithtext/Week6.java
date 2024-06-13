package workingwithtext;
import java.util.Enumeration;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;
public class Week6 {
    public static void main(String[] args) {
            example9();
    }
    static void example1(){

        String s1 = "Hello World";
        String s2 = new String("Hi, there");
        String s3 = new String();
        String temp = "i love java";
        char[] letters = temp.toCharArray();
        String s4 = new String(letters);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        s1.contains("o");
        byte[] letterBytes = s1.getBytes();
        System.out.println(letterBytes[0]);

        s1.charAt(3);

    }

    static void example2(){

        StringBuilder sb = new StringBuilder();
        //empty content, length = 0, capacity = 16
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.toString());

        sb.append(3294942389342L);
        sb.append(12.3);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.toString());

        sb.append("hello");

        sb.delete(5, 10);//5,6,7,8,9
        sb.deleteCharAt(1);
        sb.insert(4, "hello");
        sb.setLength(0); //clear the contents of StringBuilder
        sb.delete(0, sb.length()); // clear contents

    }

    static void example3(){

//    String text = "My phone number is 705-555-1234. Call me anytime";
//        String regex = "\\d{3,4}";
    String text = "7055551234";
    String regex = "\\d+";

    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(text);

    boolean completeMatch = matcher.find() && text.length() == matcher.group().length();

        System.out.println(completeMatch);
//    while(matcher.find()){
//
//        String hit = matcher.group();
//        System.out.println(hit);
//    }


    }

    static void example4(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println("You entered the number " + number);

    }

    static void example5(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        try {
            int number = input.nextInt();
            System.out.println("You entered the number " + number);
        }
        catch (Exception e){

            System.err.printf("The error name is %s\nThe error message is %s\n",
                    e.getClass().getName(),
                    e.getMessage() == null ? "(no message)" : e.getMessage()
                    );
        }

    }

    static void example6(){

        Scanner input = new Scanner(System.in);

        int arr[] = new int[5];
        try {
            System.out.println("Enter an index");
            int index = input.nextInt();
            input.nextLine();

            System.out.println(arr[index]);
            System.out.println("Enter a number");
            String value = input.nextLine();
            int number = Integer.parseInt(value);

            System.out.println("You entered the number " + number);

        }
        catch (NumberFormatException e){
            System.err.println("Unable to parse number " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.err.println("Invalid integer input");
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("Array index is out of bounds. Values 0 - " + (arr.length - 1 ));
        }
//        catch (NumberFormatException e){
//
//            System.err.printf("The error name is %s\nThe error message is %s\n",
//                    e.getClass().getName(),
//                    e.getMessage() == null ? "(no message)" : e.getMessage()
//            );
//        }

    }

    static void example7() throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and last name separated by a space");
        StringBuilder sb = new StringBuilder(30);
        sb.append(input.nextLine());

        if(!sb.toString().contains(" ") || sb.length() < 7){
            throw new IllegalArgumentException("Name too short or did not include first & last name");
        }

        System.out.println("Enter your birth year. Must be at least 13 years old");
        int minBirthYear = 2011;
        int userBirthYear = input.nextInt();

        if(userBirthYear > minBirthYear)
            throw new Exception("Too young to create a profile");

        System.out.printf("Name = %s, DOB = %d%n", sb, userBirthYear);

    }

    static void example8(){

        try{
            example7();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
    static void example9(){
        try {
//            Sentence sentence = new Sentence("I love java. Do you?");
            Sentence sentence = new Sentence("comp1008");
            System.out.println(sentence.getWords());
            System.out.println(sentence.getLetters());
            System.out.println(sentence.getNonLetters());
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
