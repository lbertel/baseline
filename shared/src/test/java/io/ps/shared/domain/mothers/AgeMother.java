package io.ps.shared.domain.mothers;

import com.github.javafaker.Faker;

public final class AgeMother {

    public static Integer random(){
        return Faker.instance().number().numberBetween(0, 120);
    }
}
