package intro;

public class Car {

    //attributes
    //color, wheel, doors, horsePower

    //accessLevel dataType name[; OR = value;]

    //accessLevel: public, private, protected, default aka package-private

    public String color;
    public int doors, wheels;

    protected char transmissionType = 'A';

    private String oilType;

    //actions

    void accelerate(double speed){
        System.out.printf("You accelerate by %.1f km/h %n", speed);
    }



    void accelerate(String speed){
        System.out.printf("You increases your speed by %s %n", speed);
    }
    void accelerate(double a, String b){}

    void accelerate(String a, double b){}
    //String accelerate(String a, double b){ return null;}
//    void acelerate(byte a){}
}
