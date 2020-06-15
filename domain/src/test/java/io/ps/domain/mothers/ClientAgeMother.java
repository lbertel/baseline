package io.ps.domain.mothers;


import io.ps.domain.clients.valueobjects.ClientAge;
import io.ps.shared.domain.mothers.AgeMother;

public final class ClientAgeMother {

    public static ClientAge create(Integer age){
        return new ClientAge(age);
    }

    public static ClientAge random(){
        return create(AgeMother.random());
    }
}
