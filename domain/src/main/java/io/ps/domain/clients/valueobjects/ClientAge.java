package io.ps.domain.clients.valueobjects;

import io.ps.shared.domain.IntegerValueObject;

public final class ClientAge extends IntegerValueObject {

    public ClientAge(Integer value) {
        super(value);
        ensureValueAge(value);
    }

    private void ensureValueAge(Integer value) throws IllegalArgumentException{
        if (getValue() < 0 && getValue() > 120 ){
            throw new IllegalArgumentException("Age range is wrong. [0-120]");
        }
    }

}
