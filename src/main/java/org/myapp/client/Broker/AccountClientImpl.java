package org.myapp.client.Broker;

import org.myapp.model.Bond;
import org.myapp.model.MoneyValue;
import org.myapp.model.Operation;
import org.myapp.model.User;

import java.util.ArrayList;
import java.util.List;

public class AccountClientImpl implements AccountClient{
    public List<Bond> getMyBonds(){
        return new ArrayList<Bond>();
    }
    public User myAccount(){
        return new User();
    }
    public List<Operation> getOperations(){
        return new ArrayList<Operation>();
    }
    public MoneyValue getAccountBalance(){
        return new MoneyValue();
    }
}
