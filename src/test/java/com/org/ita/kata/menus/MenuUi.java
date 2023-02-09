package com.org.ita.kata.menus;

import com.org.ita.kata.students.delegator.Student;

public class MenuUi {

    public Student student = Student.MAKSYM;

    public MenuEight getMenuEight() {
        return new MenuEight(student);
    }

    public MenuSeven getMenuSeven() {
        return new MenuSeven(student);
    }

    public MenuSix getMenuSix() {
        return new MenuSix(student);
    }

    public MenuFive getMenuFive() {
        return new MenuFive(student);
    }

    public MenuFour getMenuFour() {
        return new MenuFour(student);
    }
}
