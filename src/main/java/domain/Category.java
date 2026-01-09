package domain;

import javax.swing.plaf.SpinnerUI;

public enum Category {
    JAVA, BACKEND, FRONTEND,DATABASE,INFRA, CS, ETC;

    public static Category from(int input) {
        return switch (input) {
            case 1 -> JAVA;
            case 2 -> BACKEND;
            case 3 -> FRONTEND;
            case 4 -> DATABASE;
            case 5 -> INFRA;
            case 6 -> CS;
            case 7 -> ETC;
            default -> throw new IllegalArgumentException("[ERROR] 1~7까지의 숫자중 입력해주세요");
        };
    }
    }
