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
        switch (this.student) {
            case ANNA:
                return new AnnaRealisation();
            case BOHDAN:
                return new BohdanRealisation();
            case DENYS:
                return new DenysRealisation();
            case DMYTRO:
                return new DmytroRealisation();
            case ILYA:
                return new IlyaRealisation();
            case IRA:
                return new IraRealisation();
            case JANET:
                return new JanetRealisation();
            case MAKSYM:
                return new MaksymRealisation();
            case TETIANA:
                return new TetianaRealisation();
            case ZHANNA:
                return new ZhannaRealisation();
            default:
                return null;
        }
    }
}
