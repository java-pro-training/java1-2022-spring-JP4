package lv.lu.training.hw10;

public class UserCreator {
    public static void main(String[] args){
        UserValidator validator = new UserValidator();
 //       validator.validate(new User("Zane", "Sondore", 29));
        validator.validate(new User("QWERTYUIOPASDFGHJ", "REDFHBRDHFNDEHHBSDSEGS", 777));
    }
}
