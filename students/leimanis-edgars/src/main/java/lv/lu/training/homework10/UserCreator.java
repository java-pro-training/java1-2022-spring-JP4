package lv.lu.training.homework10;
//IESK
public class UserCreator {

    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
//        validator.validate(new User("Edgars", "Leimanis", 29));
        validator.validate(new User("ABCDEXXXXXXXXXXXX", "qqqqqqqqqqqqqqqqqqqq", 333));
    }


}
