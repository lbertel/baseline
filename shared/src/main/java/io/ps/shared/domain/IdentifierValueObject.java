package io.ps.shared.domain;

import java.util.Objects;
import java.util.UUID;

public abstract class IdentifierValueObject {

    private final String value;

    public IdentifierValueObject(String value) {
        ensureValidUuid(value);
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    private void ensureValidUuid(String value) throws IllegalArgumentException{
        UUID.fromString(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdentifierValueObject that = (IdentifierValueObject) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}
