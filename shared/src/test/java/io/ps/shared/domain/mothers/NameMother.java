package io.ps.shared.domain.mothers;

import com.github.javafaker.Faker;

public final class NameMother {

    public static String random(){
        return Faker.instance().name().firstName();
    }

}
