package org.myapp.client.Broker;


import org.myapp.model.Bond;
import org.myapp.model.MoneyValue;
import org.myapp.model.Operation;
import org.myapp.model.User;

import java.util.List;

/**
 * Интерфейс для получения информации о счете
 */
public interface AccountClient {
    public List<Bond> getMyBonds();
    public User myAccount();
    public List<Operation> getOperations();
    public MoneyValue getAccountBalance();
}
