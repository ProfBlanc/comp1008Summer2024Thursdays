package polymorphism;

public class Square extends Shape {

    private int[] sides = {1,1,1,1};
    private double[] angles = {90, 90, 90, 90};
    public Square(){}
    public Square(String name, int dimensions){
        super(name, dimensions);
    }
    public Square(String name, int dimensions, int[] sides, double... angles){
        super(name, dimensions);
        setSides(sides);
        setAngles(angles);
    }

    public void setSides(int[] sides) {
        this.sides = sides;
    }

    public void setAngles(double[] angles) {
        this.angles = angles;
    }

    @Override
    public double area(){
        return Math.pow(sides[0], 2);
    }
    public int perimeter(){
        int total = 0;
        for(int side : sides){
            total += side;
        }
        return total;
    }

}
