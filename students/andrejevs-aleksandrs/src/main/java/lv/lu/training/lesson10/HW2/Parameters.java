package lv.lu.training.lesson10.HW2;

public enum Parameters {
    MIN_TEXT_LENGTH(3),
    MAX_TEXT_LENGTH(15),
    MIN_AGE(0),
    MAX_AGE(120);

    public final int number;

    Parameters(int number) {
        this.number = number;
    }
}
