package lv.lu.training.lesson9;

import java.util.*;


public class WordCounterSorted {
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
            for ( Integer key: sortByValue(wordCounts)){
                System.out.println("===========sorted===========");
                System.out.println(sortByValue(wordCounts)+"="+wordCounts.keySet());

            }

            input.close();
        }

        public static List<Integer> sortByValue(Map<String, Integer> wordCounts) {
            List<Integer> listOfValues = new ArrayList<>(wordCounts.values());
            Collections.sort(listOfValues);
            return listOfValues;

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