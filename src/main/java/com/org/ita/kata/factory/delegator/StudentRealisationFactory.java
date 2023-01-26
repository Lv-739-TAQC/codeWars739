package com.org.ita.kata.factory.delegator;

import com.org.ita.kata.StudentRealisation;
import com.org.ita.kata.factory.*;

public class StudentRealisationFactory {

    private String studentName;

    public StudentRealisationFactory(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "You have chosen [" + getStudentName() + "] implementation !";
    }

    public StudentRealisation setUpImplementation() {
        switch (this.studentName) {
            case "Anna":
                return new AnnaRealisation();
            case "Bohdan":
                return new BohdanRealisation();
            case "Denys":
                return new DenysRealisation();
            case "Dmytro":
                return new DmytroRealisation();
            case "Ilya":
                return new IlyaRealisation();
            case "Ira":
                return new IraRealisation();
            case "Janet":
                return new JanetRealisation();
            case "Maksym":
                return new MaksymRealisation();
            case "Tetiana":
                return new TetianaRealisation();
            default:
                return new ZhannaRealisation();
        }
    }
}