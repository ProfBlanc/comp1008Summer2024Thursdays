package polymorphism;

public abstract class Shape {

    public String name = "Shape";
    private int dimensions = 2;

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        if(dimensions == 2 || dimensions == 3)
            this.dimensions = dimensions;
    }

    public Shape(String name, int dimensions) {
        this.name = name;
        //this.dimensions = dimensions;
        setDimensions(dimensions);
    }
    public Shape(){}


   public abstract double area();

    public abstract int perimeter();




















}
