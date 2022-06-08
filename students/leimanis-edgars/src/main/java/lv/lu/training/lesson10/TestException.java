package lv.lu.training.lesson10;

import java.io.IOException;

public class TestException {


    public static void main(String[] args) {
      try{
          tryToCatchError();
      }catch (MyException e){
          System.out.println("Gave over");
      }catch(Exception ex){
          System.out.println("I'm still alive");
      }

    }


    private static void tryToCatchError(){
        try{
            NullPointerIntro.myMethod(null);
        }catch(NullPointerException e){
            System.out.println("Null pointer logginf");
            throw new MyException("Move further", e);
        }
    }
}
