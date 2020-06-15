package io.ps.domain.clients;

import io.ps.domain.clients.valueobjects.ClientAddress;
import io.ps.domain.clients.valueobjects.ClientAge;
import io.ps.domain.clients.valueobjects.ClientDni;
import io.ps.domain.clients.valueobjects.ClientId;
import io.ps.domain.clients.valueobjects.ClientName;
import io.ps.domain.clients.valueobjects.ClientSurname;

import java.util.Objects;

public final class Client {

    private final ClientId   id;
    private final ClientDni     dni;
    private final ClientName    name;
    private final ClientSurname surname;
    private final ClientAge     age;
    private final ClientAddress address;

    public Client(ClientId id, ClientDni dni, ClientName name, ClientSurname surname, ClientAge age, ClientAddress address) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public ClientId getId() {
        return id;
    }

    public ClientDni getDni() {
        return dni;
    }

    public ClientName getName() {
        return name;
    }

    public ClientSurname getSurname() {
        return surname;
    }

    public ClientAge getAge() {
        return age;
    }

    public ClientAddress getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
            Objects.equals(dni, client.dni) &&
            Objects.equals(name, client.name) &&
            Objects.equals(surname, client.surname) &&
            Objects.equals(age, client.age) &&
            Objects.equals(address, client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dni, name, surname, age, address);
    }
}
