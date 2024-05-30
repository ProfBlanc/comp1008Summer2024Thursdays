package classbasics;

public class Week4 {

    static void example1(){

//        Person p1 = new Person();
//        System.out.println(p1.name); // null || Person
//        p1.name = "Ben";
//        System.out.println(p1.name);  // Ben
//        p1.name = "";

    }
    public static void main(String[] args) {


        Person p1 = new Person();
        System.out.println(p1.getName());  // Person
        p1.setName("Ben");
        System.out.println(p1.getName());  //
        p1.setName("How are you doing?");
        System.out.println(p1.getName());  //


    }
}
