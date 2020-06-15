package io.ps.domain.mothers;

import io.ps.domain.clients.valueobjects.ClientName;
import io.ps.shared.domain.mothers.NameMother;

public final class ClientNameMother {

    public static ClientName create(String value){
        return new ClientName(value);
    }

    public static ClientName random(){
        return create(NameMother.random());
    }

}
