package io.ps.shared.domain.mothers;

import com.github.javafaker.Faker;

public final class DniMother {

    public static String random(){
        return Faker.instance().idNumber().ssnValid();
    }
}
