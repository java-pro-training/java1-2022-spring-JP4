package lv.lu.training.lesson10;

public class UserCreator {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        validator.validate(new User("Mihail", "Zalygin", 6));
        validator.validate("Valeria", "Zalygina", 33);
    }
}
