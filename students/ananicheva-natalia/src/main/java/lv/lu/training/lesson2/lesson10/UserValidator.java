package lv.lu.training.lesson2.lesson10;

public class UserValidator {
    private static final int MIN_TEXT_LENGTH = 3;
    private static final int MAX_TEXT_LENGTH = 15;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 120;


    public void validate(User user){
        if (hasInvalidLength(user.getName())||hasInvalidLength(user.getSurname())){
            throw new ValidationException("name and surname must be 3 to 15 characters long");
        }else if(hasInvalidAge(user.getAge())){
            throw new ValidationException("User have invalid age");
        }
    }
    private boolean hasInvalidLength(String text){
        return text.length()<MIN_TEXT_LENGTH||text.length()>MAX_TEXT_LENGTH;
    }
    private boolean hasInvalidAge(int age){
        return age<MIN_AGE||age>MAX_AGE;
    }
}

