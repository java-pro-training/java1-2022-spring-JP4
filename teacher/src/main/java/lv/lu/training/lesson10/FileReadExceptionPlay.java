package lv.lu.training.lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExceptionPlay {


    public static void main(String[] args) {
        standartTryCatch();
    }

    private static void standartTryCatch() {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            System.out.println("This is my last wish");
        }
    }

    private static void tryWithResources() {
        try (Scanner scanner = new Scanner(new File("input.txt"))) {
            scanner.hasNext();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    public static void readFile() throws FileNotFoundException {
        File inputFile = new File("input.txt");
        Scanner scanner = new Scanner(inputFile);
    }


    public void printString(String myText) {

    }

}
