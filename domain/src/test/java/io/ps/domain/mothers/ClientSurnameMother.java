package io.ps.domain.mothers;


import io.ps.domain.clients.valueobjects.ClientSurname;
import io.ps.shared.domain.mothers.SurnameMother;

public final class ClientSurnameMother {

    public static ClientSurname create(String surname){
        return new ClientSurname(surname);
    }

    public static ClientSurname random(){
        return create(SurnameMother.random());
    }
}
