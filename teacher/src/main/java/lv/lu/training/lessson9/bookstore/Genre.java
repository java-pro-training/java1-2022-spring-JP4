package lv.lu.training.lessson9.bookstore;

public enum Genre {

    DETECTIVE("Detective"),
    DRAMA("Drama"),
    NOVEL("Novel");

    private String value;

    Genre(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
