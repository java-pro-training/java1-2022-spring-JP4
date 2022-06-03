package lv.lu.training.lessson9;

import java.util.ArrayList;
import java.util.List;

public class PlayWithCollections {

    public static void main(String[] args) {
        List<String> currencies = new ArrayList<>();
        currencies.add("EUR_20");
        currencies.add("USD_50");
        currencies.add("CHF_10");

        currencies.stream()
                .map(item -> item.substring(4))
                .forEach(System.out::println);


    }
}
