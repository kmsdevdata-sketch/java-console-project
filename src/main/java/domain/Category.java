package domain;

import javax.swing.plaf.SpinnerUI;

public enum Category {
    JAVA, BACKEND, FRONTEND,DATABASE,INFRA, CS, ETC;

    public static Category from(int num) {
        if (num == 1) {
            return JAVA;
        }
        if (num == 2) {
            return BACKEND;
        }
        if (num == 3) {
            return FRONTEND;
        }
        if (num == 4) {
            return DATABASE;
        }
        if (num == 5) {
            return INFRA;
        }
        if (num == 6) {
            return CS;
        }
        if (num == 7) {
            return ETC;
        }
        throw new IllegalArgumentException("[ERROR] 1~7까지의 숫자중 입력해주세요");
    }
    }
