package lv.lu.training.lesson8.interfaces;

public class PlayWithInterface {

    public static void main(String[] args) {
        MasterCard masterCard = new MasterCard(1000d);
        AmericanBlueCard americanBlueCard = new AmericanBlueCard();

        BankCard[] bankCards = new BankCard[]{masterCard, americanBlueCard};

        for (BankCard card : bankCards) {
            card.getCash(10d);
        }
    }
}
