package io.ps.domain.mothers;

import io.ps.domain.clients.valueobjects.ClientAddress;
import io.ps.shared.domain.mothers.AddressMother;

public final class ClientAddressMother {

    public static ClientAddress create(String address){
        return new ClientAddress(address);
    }

    public static ClientAddress random(){
        return create(AddressMother.random());
    }

}
