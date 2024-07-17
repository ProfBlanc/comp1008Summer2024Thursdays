package polymorphism;

public class Human extends Heart implements Feet, Arm{
    @Override
    public double grab(int duration) {
        return 0;
    }

    public Human() {
    }

    public Human(int heartRate, double size) {
        super(heartRate, size);
    }

    @Override
    public int punch(double force) {
        return 0;
    }

    @Override
    public void release() {

    }

    @Override
    public void kick(int force) {

    }

    @Override
    public void swings(int speed) {

    }
}
