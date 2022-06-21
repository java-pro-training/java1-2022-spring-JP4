package lv.lu.training.HW10;

public class UserCreator {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        // validator.validate(new User("Viktorija ", "Radionova", 27));
        validator.validate(new User("Julia", "Summmer", 45));
    }
}