package io.ps.domain.mothers;

import io.ps.domain.clients.valueobjects.ClientId;
import io.ps.shared.domain.mothers.IdMother;

public final class ClientIdMother {

    public static ClientId create(String id){
        return new ClientId(id);
    }

    public static ClientId random(){
        return create(IdMother.random());
    }

}
