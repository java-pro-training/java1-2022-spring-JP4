package lv.lu.training.lesson10.HW1;
//IESK
public class UserCreator {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        validator.validate(new User("Ainars", "Ungurs", 34));
//        validator.validate(new User("Aa", "Uu", 30));
//        validator.validate(new User("Ainars", "Ungurs", 130));
    }
}
