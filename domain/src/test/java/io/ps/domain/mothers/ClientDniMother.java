package io.ps.domain.mothers;

import io.ps.domain.clients.valueobjects.ClientDni;
import io.ps.shared.domain.mothers.DniMother;

public final class ClientDniMother {

    public static ClientDni create(String dni){
        return new ClientDni(dni);
    }

    public static ClientDni random(){
        return create(DniMother.random());
    }
}
