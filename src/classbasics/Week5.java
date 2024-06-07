package classbasics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Week5 {

    static void example1(){

        //array: collection of values
            //fixed: days of the week
            //index: position that points to a value
        // 0  1 2 3 4

        Student[] students = new Student[5];

        for(int i = 0; i < students.length; i++){
            students[i] = new Student();
        }

        for(Student each : students){
            System.out.println(each.getName());
        }

    }
    static void example2(){

        //ArrayList: dynamic containers for any data type
            //reference: data type must start with a capital
        //int, double, byte, char
            //class-wrapper container for this primitive bytes
        //int = primitive, Integer = reference
        //char = primitive, Character = reference
        //capitalize the first letter
        //Byte, Double, Long

        //java.util.ArrayList;

        ArrayList<Integer> numbers = new ArrayList<>();  //4
        //length => NO
        //capacity => Yes
        //once over capacity: ArrayList automatically grows
        //doubles
        numbers.add(100);
        //numbers.add(1d);
        numbers.add(-100);
        numbers.add(1);
        numbers.add(-1);

        int length = numbers.size();  //number of items in ArrayList
        boolean result1 = numbers.contains(5); // false
        boolean result2 = numbers.contains(-1); //true

        numbers.remove(2);
        Integer ii = -100;
        numbers.remove(ii);  //value needs to exist or error
    }
    static void example3(){

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student());

        students.add(new Student("Joe", 50, 100));

        Student selected = students.get(1); // get Joe

        students.add(1, new Student("New", 40, 99));
        //Student, New,Joe
         selected = students.get(1); // get New
        //Ben Blanc = Prof Blanc

        //reference data type
        //symbolic link => shortcut
        //shortcut on desktop: new program => NO
        // a pointer to an existing program

        //boolean result = students.contains(selected);
        boolean result = students.contains(new Student());

        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.equals(s2));

        System.out.println(s1.equals("hi"));

        System.out.println(result);


    }
    static void example4(){

        ArrayList<Person> people = new ArrayList<>();

        Person p1 = new Person();
        people.add(new Person());  // index 0
        Person p2 = new Person();
        Person p3 = people.get(0);
        people.add(p1); // index = 1
        people.add(p2); // index = 2


        /*
            How many independent Person objects are there?
                3
         */

        System.out.println(p1.equals(p2));
        Person p4 = p1;
        System.out.println(p1.equals(p4));
        people.get(0).setName("Hello");
        System.out.println(p3.getName());

    }
    static void example5(){
        Student s1 = new Student();
        System.out.println(s1.educationLevel);
        s1.educationLevel = Student.EducationLevels.UNIVERSITY;
        System.out.println(s1.educationLevel);

    }
    static void example6(){

        Student s1 = new Student();
        if(s1.getName().length() >= 5 && s1.getAge() >= 18 && s1.getAge() <= 65
        && s1.getGrade() >= 0 && s1.getGrade() <= 100)
            System.out.println("Valid values");
        else
            System.out.println("invalid values");


        /*
        JUnit Test
            Automatic testing for a class
                Object has a method => returns a values
                Test a method
                    expected
                    actual/result
                    expected ==, != actual
         */
    }
    public static void main(String[] args) {
        example6();
    }
}
