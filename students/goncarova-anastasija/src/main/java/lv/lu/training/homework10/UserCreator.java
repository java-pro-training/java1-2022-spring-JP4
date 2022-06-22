package lv.lu.training.homework10;
//IESK
public class UserCreator {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        validator.validate(new User("John", "Smith", 35));
        validator.validate(new User("Anastasija", "Goncarova", 27));
    }
}
