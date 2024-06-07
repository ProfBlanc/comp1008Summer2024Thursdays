package classbasics;

public class Student {
    private String name = "Student";
    private int age = 18;
    private double grade = 0;

    //enum: enumerable: drop-down list of option to give the user to select from

    // What country:
    // what province:

    //educationLevel: high school, college, university, masters, doctoral

    //2 parts
    //1 declaring list of posibilities
    //2 instance variable that stores ONE possibility

    //list of constant values / array of constant values
    enum EducationLevels {HIGH_SCHOOL, COLLEGE, UNIVERSITY, MASTERS, DOCTORAL }

    public EducationLevels educationLevel = EducationLevels.COLLEGE; //null
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 5)
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18 && age <= 120)
            this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade >= 0 && grade <= 100)
            this.grade = grade;
    }

    public Student(){}

    public Student(String name, int age, double grade) {
        setAge(age);
        setGrade(grade);
        setName(name);
    }
    public Student(int age, double grade,String name) {
        this(name, age, grade);
    }
    public Student(double grade,String name, int age) {
        this(name, age, grade);
    }
    public static Student MatureStudent(){
        return new Student("Mature Student", 30, 50);
    }
    public static Student DeansListStudent(){

        return new Student("Deans List", 20, 90);
    }

    public boolean equals(Object o){

        if( o instanceof Student){

            Student compare = (Student) o;

            return this.name.equals(compare.name) && this.age == compare.age
                    && this.grade == compare.grade;
        }
        else{
            return false;
        }

    }
}
