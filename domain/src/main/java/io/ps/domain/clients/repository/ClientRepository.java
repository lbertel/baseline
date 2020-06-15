package io.ps.domain.clients.repository;

import io.ps.domain.clients.Client;

import java.util.Optional;

public interface ClientRepository {

    void save(Client client);
    Optional<Client> search(String id);

}
