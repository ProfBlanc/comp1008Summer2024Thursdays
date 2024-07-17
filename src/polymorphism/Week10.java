package polymorphism;

public class Week10 {

    public static void main(String[] args) {
        Square s1 = new Square();
        Square s2 = new Square("Square", 2,
                new int[]{2,2,2,2}, 90, 90, 90, 90);

        System.out.println(s2.area());
        System.out.println(s2.perimeter());


        Shape sh1 = new Square();
        Hand h1 = new Human();
        System.out.println(h1.grab(100));

    }
}
