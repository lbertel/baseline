package io.ps.infra.clients.persistence;


import io.ps.domain.clients.Client;
import io.ps.domain.clients.repository.ClientRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Optional;

/*
Dummy implementation for testing
*/

@Component
public class InMemoryClientRepository implements ClientRepository {

    private final HashMap<String, Client> clients = new HashMap<>();

    @Override
    public void save(Client client) {
        this.clients.put(client.getId().getValue(), client);
    }

    @Override
    public Optional<Client> search(String id) {
        return Optional.ofNullable(clients.get(id));
    }

}
