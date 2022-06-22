package lv.lu.training.homework9;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//IESK
public class WordCounter {

    public static void main(String[] args) {
        WordCounter run = new WordCounter();
        run.run();
    }

    Map<String, Integer> wordCounts = new HashMap<>();

    private void run() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter line of words or type quit");
            String line = input.nextLine();
            if (line.contains("quit")) break;
            for (String word : line.split(" ")) {
                addWord(word, wordCounts);
            }
        }

        for (String word : wordCounts.keySet()) {
            System.out.println(word + " = " + wordCounts.get(word));
        }
        input.close();
    }

    public static void addWord(String word, Map<String, Integer> wordMap){
        System.out.println(wordMap);
    }
}



