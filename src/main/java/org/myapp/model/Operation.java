package org.myapp.model;

import com.google.type.DateTime;
import lombok.Data;

@Data
public class Operation {
    private String id;
    private String currency;
    private MoneyValue payment;
    private OperationState	operationState;
    private Integer quantity;
    private Integer quantity_rest;
    private String figi;
    private Instrument instrument_type;
    private DateTime date;
    private String type;
}
