package polymorphism;

public abstract class Heart {

    private int heartRate;
    private double size;
    public Heart(){}
    public Heart(int heartRate, double size){
        setHeartRate(heartRate);
        setSize(size);

    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
