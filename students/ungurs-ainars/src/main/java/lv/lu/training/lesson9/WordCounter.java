package lv.lu.training.lesson9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCounter {
    public static void main(String[] args) {
    WordCounter counter = new WordCounter();
    counter.run();

    }

    Map<String, Integer> wordCounts = new HashMap<>();

    public void run() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter line of words or type quit:");
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


    private static void addWord(String word, Map<String, Integer> wordCounts) {
        Integer integer = wordCounts.get(word);
        if (integer == null) {
            wordCounts.put(word, 1);
        } else {
            wordCounts.put(word, integer + 1);
        }


    }
}
