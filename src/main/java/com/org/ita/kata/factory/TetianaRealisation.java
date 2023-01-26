package com.org.ita.kata.factory;

import com.org.ita.kata.StudentRealisation;
import com.org.ita.kata.implementation.TetianaFilatova.*;

public class TetianaRealisation implements StudentRealisation {

    public EightImpl implementationEightKata() {
        return new EightImpl();
    }

    public SevenImpl implementationSevenKata() {
        return new SevenImpl();
    }

    public SixImpl implementationSixKata() {
        return new SixImpl();
    }

    public FiveImpl implementationFiveKata() {
        return new FiveImpl();
    }

    public FourImpl implementationFourKata() {
        return new FourImpl();
    }
}
