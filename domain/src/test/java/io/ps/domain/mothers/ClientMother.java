package io.ps.domain.mothers;

import io.ps.domain.clients.Client;
import io.ps.domain.clients.ClientCreateRequest;
import io.ps.domain.clients.valueobjects.*;

public final class ClientMother {

    public static Client create(
        ClientId id,
        ClientDni dni,
        ClientName name,
        ClientSurname surname,
        ClientAge age,
        ClientAddress address){
        return new Client(id, dni, name, surname, age, address);
    }

    public static Client fromRequest(ClientCreateRequest request){
        return create(
            ClientIdMother.create(request.getId()),
            ClientDniMother.create(request.getDni()),
            ClientNameMother.create(request.getName()),
            ClientSurnameMother.create(request.getSurname()),
            ClientAgeMother.create(request.getAge()),
            ClientAddressMother.create(request.getAddress())
        );
    }

    public static Client random(){
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
