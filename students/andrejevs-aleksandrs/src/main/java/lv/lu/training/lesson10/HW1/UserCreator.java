package lv.lu.training.lesson10.HW1;

//IESK
public class UserCreator {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        validator.validate(new User("Martins", "Ceske", 37));
        validator.validate(new User("Aleksandrs", "Andrejevs", 290));
    }
}
