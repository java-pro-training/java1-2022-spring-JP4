package lv.lu.training.HW6;
//IESK
public class FindingOddNumber {

    public int from;
    public int till;

    public FindingOddNumber(int from, int till) {
        this.from = from;
        this.till = till;
    }

    public int getFrom() {
        return from;
    }

    public int getTill() {
        return till;
    }

    public static boolean isOdd(int number) {
        return (number % 2 != 0);
    }

    public static void main(String[] args) {

        FindingOddNumber interval = new FindingOddNumber(12, 42);

        if (interval.getFrom() > interval.getTill()) {
            System.out.println("Incorrect: ");
            System.out.println("Number in the range :");
            System.out.println("Please, try again: ");
        } else {
            for (int i = interval.getFrom(); i <= interval.getTill(); i++) {
                if (isOdd(i)) {
                    System.out.println(i);
                }
            }
        }
    }

}

