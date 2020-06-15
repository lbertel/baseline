package io.ps.shared.domain.mothers;

import com.github.javafaker.Faker;

public final class AddressMother {

    public static String random(){
        return Faker.instance().address().streetAddress();
    }

}
