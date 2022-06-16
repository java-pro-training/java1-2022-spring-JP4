package lv.lu.training.lesson9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    static Map<String, Integer> wordCounts = new HashMap<>();

    public static void main(String[] args) {
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
            System.out.println("=====unsorted=======");
            System.out.println(word + " = " + wordCounts.get(word));
        }


        input.close();
    }


    public static <wordCounts> Map<String, Integer> addWord(String word, Map<String, Integer> wordMap) {

        wordCounts.containsKey(word);
        if (true)
            wordCounts.merge(word, 1, Integer::sum);

        if (false) {
            wordCounts.putIfAbsent(word, 1);

        }

        return wordCounts;
    }
}

