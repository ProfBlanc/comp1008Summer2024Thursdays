package filemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SchoolCourseEvaluationsTracker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String school, year, semester, course, grade, evaluation;
        int evaluationCount;
        Path rootPath, termPath, coursePath;

        try{
        System.out.println("Welcome to our program");
        System.out.println("Enter your school");
        school = input.nextLine();
        System.out.println("Enter the year");
        year = input.nextLine();
        System.out.println("Enter the term");
        semester = input.nextLine();

        rootPath = Path.of("src", "filemanipulation", "funtask");
            if(!Files.exists(rootPath))
                Files.createDirectory(rootPath);

        termPath = rootPath.resolve(school).resolve(year).resolve(semester);

        if(!termPath.toFile().exists())
            termPath.toFile().mkdirs();

            System.out.println("Enter your course");
            course = input.nextLine();
            coursePath = termPath.resolve(course);

            if(!Files.exists(coursePath))
                Files.createDirectory(coursePath);

            System.out.println("How many evaulations did you have for " + course + "?");
            evaluationCount = Integer.parseInt(input.nextLine());

            for(int i = 1; i <= evaluationCount ; i++){

                System.out.println("Enter the evaluation name for " + course + " course");
                evaluation = input.nextLine();
                System.out.println("Enter the grade for " + evaluation + " for the " + course+ " course");
                grade = input.nextLine();

                Files.writeString(coursePath.resolve(evaluation + ".txt"), grade);
            }
        }
        catch (IOException e){
            System.err.println(e);
        }
    }
}
