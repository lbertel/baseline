package io.ps.domain.mothers;

import io.ps.domain.clients.ClientCreateRequest;
import io.ps.domain.clients.valueobjects.*;

public final class ClientCreateRequestMother {

    public static ClientCreateRequest create(
        ClientId id,
        ClientDni dni,
        ClientName name,
        ClientSurname surname,
        ClientAge age,
        ClientAddress address){
        return new ClientCreateRequest(
            id.getValue(),
            dni.getValue(),
            name.getValue(),
            surname.getValue(),
            age.getValue(),
            address.getValue()
        );
    }

    public static ClientCreateRequest random(){
        return create(
            ClientIdMother.random(),
            ClientDniMother.random(),
            ClientNameMother.random(),
            ClientSurnameMother.random(),
            ClientAgeMother.random(),
            ClientAddressMother.random()
        );
    }

}
