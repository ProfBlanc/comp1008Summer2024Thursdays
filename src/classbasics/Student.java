package classbasics;

public class Student {
    private String name = "Student";
    private int age = 18;
    private double grade = 0;

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

    public void setAge(int age1) {
        if(age >= 18)
            age = age1;
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
}
