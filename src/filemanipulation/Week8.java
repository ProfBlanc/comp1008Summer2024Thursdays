package filemanipulation;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Week8 {

    static void example1(){

        Path path = Path.of("");
        System.out.println(path.toAbsolutePath());
        Path path1 = Path.of("src/filemanipulation");
        System.out.println(path1.toAbsolutePath());
        Path path2 = Path.of("src", "filemanipulation");
        System.out.println(path2.toAbsolutePath());
        Path path3 = Path.of("src", "filemanipulation", "wk8_notes.txt");
        System.out.println(path3.toAbsolutePath());

    }
    static void example2(){

        Path p1 = Path.of("src", "filemanipulation", "dir1");
        System.out.println(p1.toFile().exists());
        System.out.println(Files.exists(p1));
        try {
            Files.createDirectory(p1);
        }
        catch (IOException e){
            System.err.println(e);
        }


    }
    static void example3(){

        Path p1 = Path.of("src", "filemanipulation", "dir1", "dir1-1",
                "dir1-1-1");
        System.out.println(p1.toFile().exists());
        System.out.println(Files.exists(p1));
        try {
            Files.createDirectories(p1);
        }
        catch (IOException e){
            System.err.println(e);
        }

    }
    static void example4(){

        Path p1 = Path.of("src", "filemanipulation", "test1.txt");
        try {
            //p1.toFile().createNewFile();

            Files.createFile(p1);
        }
        catch (IOException e){
            System.err.println(e);
        }


    }
    static void example5(){

        Path p1 = Path.of("src", "filemanipulation");

        String[] fileNames = p1.toFile().list();
        for(String fileName : fileNames){
            System.out.println(fileName);
        }
        System.out.println("*".repeat(20));


        File[] files = p1.toFile().listFiles();
        //p1.toFile().mkdir(); // equilvent of Files.createDirectory
        //p1.toFile().mkdirs() // equilent of Files.createDirectories

        for(File file : files){

            System.out.println(file.getName());
            System.out.println(file.isDirectory());
            System.out.println(file.isHidden());
            System.out.println(file.lastModified());
            System.out.println(file.length());
        }

    }
    static void example6(){
        /*
                Create the followng folder structure
                in filemanipulation directory
                    testdir1
                        f1.txt
                    testdir2
                        f2.text
                    testdir3
                        f3.txt
         */
        Path p1 = Path.of("src", "filemanipulation");

        for(int i = 1; i <4 ; i++){
            try {
                Path dir = p1.resolve("testdir" + i);
                Files.createDirectory(dir);
                Files.createFile(dir.resolve("f" + i + ".txt"));
            }
            catch (IOException e){
                System.err.println();
            }
        }


    }
    static void example7(){

        Path p1 = Path.of("src", "filemanipulation", "testdir1");
        Path p2 = Path.of("src", "filemanipulation", "testdir11");
        p1.toFile().renameTo(p2.toFile());
    }
    static void example8(){

        Path p1 = Path.of("src", "filemanipulation", "dir1");
        Path p2 = Path.of("src", "filemanipulation", "dir1One");
        try {
            Files.copy(p1, p2);
        }
        catch (IOException e){
            System.err.println(e);
        }
    }
    static void example9(){
        Path p1 = Path.of("src", "filemanipulation", "dir1");
        //Files.delete(p1);
        p1.toFile().delete(); //no try-catch statement needed
    }
    static void example10(){

        Path p1 = Path.of("src", "filemanipulation", "first1.txt");
        String content = "Hello World\n";
        try {
            //Files.writeString(p1, content);
Files.writeString(p1, content, !p1.toFile().exists()
        ?
        StandardOpenOption.CREATE_NEW
        :
        StandardOpenOption.APPEND);

        }
        catch (IOException e){
            System.err.println(e);
        }

    }
    static void example11(){
        Path p1 = Path.of("src", "filemanipulation", "first.txt");
        try {
            String content = Files.readString(p1);
        }
        catch (IOException e){
            System.err.println(e);
        }


    }
    public static void main(String[] args) {
        example10();
    }
}
