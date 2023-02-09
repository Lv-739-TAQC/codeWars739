package com.org.ita.kata.students;

public abstract class Base {
    @Override
    public String toString() {
        String[] names = this.getClass().toString().split("\\.");
        return String.format("%s", names[names.length - 1]);
    }
}
