package com.pluralsight;

public class Password {
    private String value;
    private int length;

    public Password(String value) {
        this.value = value;
        this.length = value.length();
    }

    public int charType(char c) {
        int val;

        if (Character.isUpperCase(c)) {
            val = 1;
        } else if (Character.isLowerCase(c)) {
            val = 2;
        } else if (Character.isDigit(c)) {
            val = 3;
        } else {
            val = 4;
        }

        return val;
    }

    public int passwordStrength() {
        String s = this.value;
        boolean usedUpper = false;
        boolean usedLower = false;
        boolean usedNum = false;
        boolean usedSym = false;
        int type;
        int score = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            type = charType(c);

            if (type == 1) {
                usedUpper = true;
            }
            if (type == 2) {
                usedLower = true;
            }
            if (type == 3) {
                usedNum = true;
            }
            if (type == 4) {
                usedSym = true;
            }
        }

        if (usedUpper) {
            score += 1;
        }
        if (usedLower) {
            score += 1;
        }
        if (usedNum) {
            score += 1;
        }
        if (usedSym) {
            score += 1;
        }

        if (s.length() >= 8) {
            score += 1;
        }
        if (s.length() >= 16) {
            score += 1;
        }

        return score;
    }

    public String calculateScore() {
        int score = this.passwordStrength();

        if (score == 6) {
            return "This is a very good password :D check the Useful Information section to make sure it satisfies the guidelines";
        } else if (score >= 4) {
            return "This is a good password :) but you can still do better";
        } else if (score >= 3) {
            return "This is a medium password :/ try making it better";
        } else {
            return "This is a weak password :( definitely find a new one";
        }
    }

    @Override
    public String toString() {
        return value;
    }
}