package workingwithtext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    /**
     * This class will work with String Builder,
     * RegEX and exception handling
     * The user will input a sentence and the class
     * will calculate the number of words, letters, nonLetters or the text
     */
    private StringBuilder text = new StringBuilder();
    private int words, letters, nonLetters;
    private Matcher matcher;
    private Pattern pattern;

    /**
     * The constructor for the Sentence class
     * @throws IllegalArgumentException if text is less than 10 characters
     * @param text a sentence to initialize the class object
     */
    public Sentence(String text){
        if(text.length() < 10)
            throw new IllegalArgumentException("Text must be at least 10 characters");

        this.text.append(text);
    }
    public int getWords(){
        pattern = Pattern.compile("[a-z]+", Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(text);

        return matchCounter(matcher);
    }
    public int getLetters(){
        pattern = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(text);

        return matchCounter(matcher);
    }
    public int getNonLetters(){
     pattern = Pattern.compile("[^a-z]", Pattern.CASE_INSENSITIVE);
     matcher = pattern.matcher(text);

     return matchCounter(matcher);
    }
    private int matchCounter(Matcher matcher){
        int counter = 0;
        while (matcher.find()) counter++;

        return counter;

    }
}
