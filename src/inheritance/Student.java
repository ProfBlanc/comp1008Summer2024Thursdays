package inheritance;

public class Student extends Person{

    int studentID;
    double gpa;
    String program;

    public Student(String firstName, String lastName, int age, double weight, float height, String program, double gpa, int studentID) {

        super(firstName, lastName, age, weight, height);
        this.program = program;
        this.gpa = gpa;
        this.studentID = studentID;
    }

    public double student(int howLong){
        return howLong * (3/4.0);
    }
    public double takeTest(String testName, int duration){
        return duration * testName.length();
    }
    public double sleep(int duration){
        return super.sleep(duration) / 2;
    }

    public Student(){}
    public Student(String firstName, String lastName, int age, double weight, float height){
            //int = 1;
            super(firstName, lastName, age, weight, height);
            int i = 1;
//        setFirstName(firstName);
//        setLastName(lastName);
//        this.age = age;
//        this.weight = weight;
//        this.height = height;

    }

    @Override
    public String toString(){
        return "Student" + super.toString().substring(6, super.toString().length() - 1)
                +", studentID=" + studentID +", GPA=" + gpa + ", Program=" + program + "}"
                ;

    }

}
