package lv.lu.training.lesson10;

public class TestException {


    public static void main(String[] args) {
       try {
           tryToCatchError();
       }catch (MyException e){
           System.out.println("Game over");
       }catch (Exception ex){                   //kāda cita kļūda
           System.out.println("I'm still alive!");
       }
    }

    private static void tryToCatchError() {
        try {
            NullPointerIntro.myMethod(null);
        } catch (NullPointerException e) {
            System.out.println("Null pointer logging");
            throw new MyException("Move further", e);
        }
    }
}
