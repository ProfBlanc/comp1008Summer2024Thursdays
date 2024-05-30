package classbasics;

/**
 * This is a wonderful Person class that we have created in our awesome Java class
 * @author Prof Blanc
 * @since 2024-05-30
 * @version 1.0
 */
public class Person {

    /*
    age
    name
    height
    weight
     */
    //i
    private String name = "Person";
    /** This is the age of the person in years */
    private byte age = 13;
    private float height = 0.5f;
    private double weight = 40;

    public String getName(){
        return name;
    }
    //javadoc: java documentation: /** */

    /**
     * This function sets the name of the person. Name must be at least 3 chars
     * and only contain letters
     * @param name value of a person's name
     */
    public void setName(String name){
        if(name.length() >= 3 && validateName(name))
            this.name = name;
    }
    private boolean validateName(String name, boolean allowSpaces,
                                 boolean allowHyphens){

        boolean result = true;

        for(char character : name.toUpperCase().toCharArray()){
    if(character == '-' || character == ' ' || character >= 'A' && character <= 'Z'){}
    else{
        result = false;
        break;
    }
        }
        return result;
    }

    /**
     * Validates a name to ensure it only contains letters A-Z
     * @param name value to evaluate
     * @return whether the name is valid or not
     */

    private boolean validateName(String name){

        //enhance for loop
        //iterate through a collection of values
        //placeholder that represents a single value
        //collection of values
        //for(dataType singleValue : collectionOfValues)

        for( char letter :   name.toUpperCase().toCharArray()){
            if(letter < 'A' || letter > 'Z')
                return false;
        }
        return true;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if(age >= 13 && age <= 65)
            this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if(height >= 0.5 && height <= 2.3)
            this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight >= 40 && weight <= 1000)
            this.weight = weight;
    }

    //isOld() => age > 30
    // isTall => height > 2m
    //hasStrongBones => age < 30 and height is no more than 1.5

    public boolean isOld(){
        return age > 30;
    }
    public boolean isTall(){
        return height > 1.5;
    }
    public boolean hasStrongBones(){
        return age < 30 && height <= 1.5;
    }

    public Person(){}  //default constructor
    public Person(String name, byte age, float height, double weight){
        setName(name);
        setWeight(weight);
        setAge(age);
        setHeight(height);
    }
    public Person(String name, double weight, float height,byte age) {
        this(name, age, height, weight);
    }

    public Person(byte age, double weight, float height,String name) {
        this(name, age, height, weight);
    }
    public Person(double weight, float height,String name, byte age) {
        this(name, age, height, weight);
    }
    public Person(float height,String name, byte age, double weight) {
        this(name, age, height, weight);
    }

    //factory method:

    public static Person TallPerson(){

        return new Person("Tall", (byte) 25, 2f, 200);
    }

    public static Person OldPerson(){

        return new Person("Old", (byte) 60, 1.5f, 100);
    }

}
