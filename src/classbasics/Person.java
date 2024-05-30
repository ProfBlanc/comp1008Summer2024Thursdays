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
    byte age;
    float height;
    double weight;

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
}
