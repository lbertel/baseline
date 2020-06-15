package io.ps.app.clients.create;

import io.ps.domain.clients.Client;
import io.ps.domain.clients.ClientCreateRequest;
import io.ps.domain.clients.repository.ClientRepository;
import io.ps.domain.mothers.ClientCreateRequestMother;
import io.ps.domain.mothers.ClientMother;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

final class ClientCreatorTest {

    private ClientRepository repository;

    @BeforeEach
    void setUp(){
        repository = mock(ClientRepository.class);
    }

    @Test
    void save_a_valid_client() {

        ClientCreator creator = new ClientCreator(repository);

        ClientCreateRequest request = ClientCreateRequestMother.random();

        Client client = ClientMother.fromRequest(request);

        creator.create(request);

        verify(repository, atLeastOnce()).save(client);
    }

}
