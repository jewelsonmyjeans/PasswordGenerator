package com.pluralsight;

public class Alphabet {

    private final StringBuilder pool;

    public Alphabet(boolean uppercaseIncluded, boolean lowercaseIncluded, boolean numbersIncluded, boolean specialCharactersIncluded) {
        pool = new StringBuilder();
        if (uppercaseIncluded) {
            pool.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        }
        if (lowercaseIncluded) {
            pool.append("abcdefghijklmnopqrstuvwxyz");
        }
        if (numbersIncluded) {
            pool.append("1234567890");
        }
        if (specialCharactersIncluded) {
            pool.append("!@#$%^&*()-_=+\\/~?");
        }
    }

    public String getAlphabet() {
        return pool.toString();
    }
}