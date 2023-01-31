package com.org.ita.kata.students.delegator;

import com.org.ita.kata.StudentRealisation;
import com.org.ita.kata.students.*;

public class StudentRealisationFactory {

    private Student student;

    public StudentRealisationFactory(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "You have chosen [" + student.getName() + "] implementation !";
    }

    public StudentRealisation setUpImplementation() {
        switch (this.student.getName()) {
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
            case "Zhanna":
                return new ZhannaRealisation();
            default:
                return null;
        }
    }
}
