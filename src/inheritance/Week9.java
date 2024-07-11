package inheritance;

import org.w3c.dom.ls.LSOutput;

public class Week9 {
    static void example1(){
        Week9 wk9 = new Week9();

        wk9.toString();
        wk9.equals(1);
        wk9.hashCode();


        Person p = new Person();
        Student s = new Student();

        Person p1 = new Person("John", "Smith", 50, 135, 150);
        System.out.println(p1);
        Student s1 = new Student("John", "Smith", 50, 135, 150);
        System.out.println(s1);

    }
    static void example2(){

        Person p = new Student();
        System.out.println(p.sleep(10));


        Person[] people = new Person[3];
        people[0] = new Person();
        people[1] = new Student();
        people[2] = new Person();


    }
    public static void main(String[] args) {
        example2();
    }
}
