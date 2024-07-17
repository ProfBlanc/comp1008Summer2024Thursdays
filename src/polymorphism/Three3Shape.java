package polymorphism;

public abstract class Three3Shape extends Shape {

    public Three3Shape(){}

    public Three3Shape(String name, int dimensions){
        super(name, dimensions);
    }
    @Override
    public void setDimensions(int dimensions){
        super.setDimensions(3);
    }

    public abstract double volume();

}
