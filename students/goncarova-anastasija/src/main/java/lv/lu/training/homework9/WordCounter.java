package lv.lu.training.homework9;


import java.util.*;

//IESK
public class WordCounter {

    public static void main(String[] args) {
        WordCounter runProgram = new WordCounter();
        runProgram.run();
    }

    Map<String, Integer> wordCounts = new HashMap<>();

    public void run() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter line of words or type quit: ");
            String line = input.nextLine();
            if (line.contains("quit")) break;
            for (String word : line.split(" ")) {
                addWord(word, wordCounts);
            }
        }
        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(wordCounts);
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println("===========");

        for (String word : wordCounts.keySet()) {
            System.out.println(word + " = " + wordCounts.get(word));
        }
        System.out.println("=================");

        List<Map.Entry<String, Integer>> list = new LinkedList<>(wordCounts.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " = " + entry.getValue());

        }

        input.close();
    }

    public static void addWord(String word, Map<String, Integer> wordMap) {
        Integer integer = wordMap.get(word);
        if (integer == null) {
            wordMap.put(word, 1);
        } else {
            wordMap.put(word, integer + 1);
        }
    }

    List<String> sortByKey(Map<String, Integer> map) {
        List<String> sortedByKey = new ArrayList<>(map.keySet());
        Collections.sort(sortedByKey);
        return sortedByKey;
    }

}
