package io.ps.shared.domain.mothers;

import com.github.javafaker.Faker;

public final class SurnameMother {

    public static String random(){
        return Faker.instance().name().lastName();
    }
}
