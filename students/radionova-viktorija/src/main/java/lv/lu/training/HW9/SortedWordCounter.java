package lv.lu.training.HW9;

import java.util.*;
//ISK
public class SortedWordCounter {

    public static void main(String[] args) {
        SortedWordCounter sortedWordCounter = new SortedWordCounter();
        sortedWordCounter.run();
    }

    Map<String, Integer> wordCounts = new HashMap<>();

    public void run() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please, enter words, or type quit to exit: ");
            String line = input.nextLine().toLowerCase();
            if (line.contains("quit")) break;
            for (String word : line.split(" ")) {
                addWord(word, wordCounts);
            }

            for(Map.Entry<String,Integer> key: sortByValue(wordCounts)){
                System.out.println(key.getKey()+"="+key.getValue());
            }
        }

        input.close();
    }

    public static void addWord(String word, Map<String, Integer> wordMap) {
        Integer value = wordMap.get(word);
        if (value == null) {
            wordMap.put(word, 1);
        } else {
            value++;
            wordMap.put(word, value);
        }

    }
    List<Map.Entry<String ,Integer>> sortByValue(Map<String,Integer> map){
        List<Map.Entry<String ,Integer>> listOfKeys = new ArrayList<>(map.entrySet());
        listOfKeys.sort(Map.Entry.comparingByValue());
        return listOfKeys;
    }

}