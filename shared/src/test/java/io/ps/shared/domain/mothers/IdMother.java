package io.ps.shared.domain.mothers;

import java.util.UUID;

public final class IdMother {

    public static String random(){
        return UUID.randomUUID().toString();
    }
}
