package domain;

public enum Level {
    BEGINNER, LOW, MEDIUM, HIGH, ADVANCED;


    public static Level from(int num) {
        if (num == 1) {
            return BEGINNER;
        }
        if (num == 2) {
            return LOW;
        }
        if (num == 3) {
            return MEDIUM;
        }
        if (num == 4) {
            return HIGH;
        }
        if (num == 5) {
            return ADVANCED;
        }
        throw new IllegalArgumentException("[ERROR] 1~5까지의 숫자중 입력해주세요");
    }
}
