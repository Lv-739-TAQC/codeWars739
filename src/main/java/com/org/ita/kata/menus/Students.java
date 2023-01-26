package com.org.ita.kata.menus;
import com.org.ita.kata.utils.SystemInput;

public class Students {

    private String students;

    public Students() {
        this.students = "1.) Anna\n" + "2.) Bohdan\n" + "3.) Denys\n" + "4.) Dmytro\n" + "5.) Ilya\n" +
                "6.) Ira\n" + "7.) Janet\n" + "8.) Maksym\n" + "9.) Tetiana\n" + "10.) Zhanna";;
    }

    @Override
    public String toString() {
        return "[ALL STUDENTS]\n" + students;
    }

    public String chooseStudent() {
        System.out.println("Enter student's name : ");
        return SystemInput.input.nextLine();
    }
}
