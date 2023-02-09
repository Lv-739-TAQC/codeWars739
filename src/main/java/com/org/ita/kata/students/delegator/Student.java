package com.org.ita.kata.students.delegator;

import com.org.ita.kata.StudentRealisation;
import com.org.ita.kata.students.*;

public enum Student {

    ANNA(1, "Anna", "AnnaMatviienko", new AnnaRealisation()),
    BOHDAN(2, "Bohdan", "dzobabohdan", new BohdanRealisation()),
    DENYS(3, "Denys", "DenisPitsul", new DenysRealisation()),
    DMYTRO(4, "Dmytro", "savaxn04", new DmytroRealisation()),
    ILYA(5, "Ilya", "kapustin-ilya", new IlyaRealisation()),
    IRA(6, "Ira", "IrenZh", new IraRealisation()),
    JANET(7, "Janet", "Tafiy-Janet", new JanetRealisation()),
    MAKSYM(8, "Maksym", "Maksym637", new MaksymRealisation()),
    TETIANA(9, "Tetiana", "TetianaFilatova", new TetianaRealisation()),
    ZHANNA(10, "Zhanna", "janestadnytska", new ZhannaRealisation());

    private final int id;
    private final String name;
    private final String gitHubName;
    private final StudentRealisation studentRealisation;

    Student(int id, String name, String gitHubName, StudentRealisation studentRealisation) {
        this.id = id;
        this.name = name;
        this.gitHubName = gitHubName;
        this.studentRealisation = studentRealisation;
    }

    public static Student getStudentByName(String name) {
        return Student.valueOf(Student.class, name.toUpperCase());
    }

    public static void printAllStudents() {
        for (Student student : values()) {
            System.out.println(student.id + " - " + student.name);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGitHubName() {
        return gitHubName;
    }

    public StudentRealisation getStudentRealisation() {
        return studentRealisation;
    }

    public String toString() {
        return String.format("You have chosen %s implementation ! ", name);
    }
}
