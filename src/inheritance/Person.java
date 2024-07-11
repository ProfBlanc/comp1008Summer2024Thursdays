package inheritance;

public class Person {
    private String firstName, lastName;
    protected int age;
    double weight;
    public float height;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Person(){}

    public Person(String firstName, String lastName, int age, double weight, float height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double sleep(int duration){
        return duration / 2.0;
    }
    public String sleep(String where, int howLong){
        return String.format("%s %s is sleeping %s for %d hours\n",
                firstName, lastName, where, howLong);
    }
    protected int eat(String food){
        return food.length();
    }
    private boolean isOnDiet(int howLong) {
        return howLong % 2 ==0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
