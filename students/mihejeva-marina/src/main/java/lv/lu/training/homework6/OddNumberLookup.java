package lv.lu.training.homework6;

public class OddNumberLookup {

    boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void printOddWithin(int from, int till) {
        String oddNumbers = "";
        for (int i = from; i <= till; i++) {
            if (isOdd(i)) {
                if (oddNumbers.isEmpty()) {
                    oddNumbers += i;
                } else {
                    oddNumbers += ", " + i;
                }
            }
        }
        System.out.println("Odd numbers within = " + oddNumbers);
    }
}
