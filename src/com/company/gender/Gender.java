package com.company.gender;

public enum Gender {
    WOMAN('W'),
    MAN('M');

    private char gen;

    Gender() {
    }

    Gender(char gen) {
        this.gen = gen;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return " Gender: " +
                super.toString();
    }
}

