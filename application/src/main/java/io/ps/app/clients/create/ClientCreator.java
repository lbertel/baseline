package io.ps.app.clients.create;

import io.ps.domain.clients.Client;
import io.ps.domain.clients.ClientCreateRequest;
import io.ps.domain.clients.repository.ClientRepository;
import io.ps.domain.clients.valueobjects.ClientAddress;
import io.ps.domain.clients.valueobjects.ClientAge;
import io.ps.domain.clients.valueobjects.ClientDni;
import io.ps.domain.clients.valueobjects.ClientId;
import io.ps.domain.clients.valueobjects.ClientName;
import io.ps.domain.clients.valueobjects.ClientSurname;
import org.springframework.stereotype.Component;


@Component
public final class ClientCreator {

    // private final ClientRepository repository;

    /*
    public ClientCreator(ClientRepository repository) {
        this.repository = repository;
    }*/

    public void create(ClientCreateRequest request){
        Client client = new Client(
            new ClientId(request.getId()),
            new ClientDni(request.getDni()),
            new ClientName(request.getName()),
            new ClientSurname(request.getSurname()),
            new ClientAge(request.getAge()),
            new ClientAddress(request.getAddress())
        );

        // repository.save(client);
    }

}
