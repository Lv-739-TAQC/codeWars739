package com.org.ita.kata.students.delegator;

public enum Student {

    ANNA(1, "Anna", "AnnaMatviienko"), BOHDAN(2, "Bohdan", "dzobabohdan"),
    DENYS(3, "Denys", "DenisPitsul"), DMYTRO(4, "Dmytro", "savaxn04"),
    ILYA(5, "Ilya", "kapustin-ilya"), IRA(6, "Ira", "IrenZh"),
    JANET(7, "Janet", "Tafiy-Janet"), MAKSYM(8, "Maksym", "Maksym637"),
    TETIANA(9, "Tetiana", "TetianaFilatova"), ZHANNA(10, "Zhanna", "janestadnytska");

    private final int id;
    private final String name;
    private final String gitHubName;

    Student(int id, String name, String gitHubName) {
        this.id = id;
        this.name = name;
        this.gitHubName = gitHubName;
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

    public static Student getStudentByName(String name) {
        for (Student student : values()) {
            if (student.name.equals(name)) {
                return student;
            }
        }
        return null;
    }

    public static void printAllStudents() {
        for (Student student : values()) {
            System.out.println(student.id + " - " + student.name);
        }
    }
}
