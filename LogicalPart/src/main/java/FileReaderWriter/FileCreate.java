package FileReaderWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\new\\coding.txt");
//        System.out.println(file.createNewFile());
//        System.out.println(file.canRead());

        FileWriter fileWriter=new FileWriter("C:\\new\\coding.txt");
        fileWriter.write("Hi this is harsha i would love to know more about you, this is ur customized page");
        fileWriter.close();
        //we must close the filewriter obj in order to view our info

        Scanner sc=new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();

        String data = "Test data";
        FileOutputStream out = new FileOutputStream("c:\\new\\testFile2.txt");
        out.write(data.getBytes());
        out.close();
    }
}
