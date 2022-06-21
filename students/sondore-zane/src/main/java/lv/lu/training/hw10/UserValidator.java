package lv.lu.training.hw10;

public class UserValidator {
    private static final int MIN_TEXT_LENGHT = 3;
    private static final int MAX_TEXT_LENGHT = 15;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 120;

    public void validate(User user) {
        if (hasInvalidLenght(user.getName()) || hasInvalidLenght(user.getSurname())) {
            throw new ValidationException("Name and surname has to be 3 to 15 characters long");
        }else if (hasInvalidAge(user.getAge())) {
            throw new ValidationException("Use has invalid age");
        }
    }

    private boolean hasInvalidLenght(String text) {
        return text.length() < MIN_TEXT_LENGHT || text.length() > MAX_TEXT_LENGHT;
    }

    private boolean hasInvalidAge(int age) {
        return age < MAX_AGE || age > MAX_AGE;
    }
}