package classbasics;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    //@Test => test method => Student object
    @Test
    public void testingDefaultConstructorDefaultValues(){

        Student s1 = new Student();

        //assersion => assumption

        assertEquals("Student", s1.getName());
        assertEquals(18, s1.getAge());
        assertEquals(0, s1.getGrade());
    }

    @Test
    public void testingSetNameWithInvalidValue(){
        Student s1 = new Student();
        String name = "Ben";
        s1.setName(name);

        assertNotEquals(name, s1.getName());
        assertEquals("Student", s1.getName());

        assertTrue(s1.getName().equals("Student") && s1.getName().length() >= 5);
        assertNotNull(s1);

    }

    @ParameterizedTest
    @ValueSource(doubles = {100, 90, 80, 50, 70, 40, 20, 10})  //dataType(s) => int: ints, double, doubles, string, strings
    public void testingSetGradeWithValidValues(double grade){

        Student s1 = new Student();
        s1.setGrade(grade);
        assertEquals(grade, s1.getGrade());
    }

    @ParameterizedTest
    @CsvSource({"Johnny,30,99", "MaryMary, 28, 100", "Benny, 18, 100"})

    public void testing3ArgConstructor(String name, int age, double grade){

        Student s = new Student(name, age, grade);
        assertNotNull(s);
        assertNotNull(s.getName());
        assertEquals(name, s.getName());
        assertEquals(age, s.getAge());
        assertEquals(grade, s.getGrade());
    }
}