package io.ps.infra.clients.persistence;

import io.ps.domain.clients.Client;
import io.ps.domain.mothers.ClientIdMother;
import io.ps.domain.mothers.ClientMother;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Optional;

final class InMemoryClientRepositoryTest {

    private InMemoryClientRepository repository;

    @BeforeEach
    void setUp(){
        repository = new InMemoryClientRepository();
    }

    @Test
    void save_a_valid_client(){
        Client client = ClientMother.random();

        repository.save(client);
    }

    @Test
    void search_an_existing_client(){
        Client client = ClientMother.random();

        repository.save(client);

        assertThat(Optional.of(client), is(equalTo(repository.search(client.getId().getValue()))));

    }

    @Test
    void not_find_a_non_existing_client(){
        boolean actual = repository.search(ClientIdMother.random().getValue()).isPresent();
        assertThat( actual, is(false));
    }

}
